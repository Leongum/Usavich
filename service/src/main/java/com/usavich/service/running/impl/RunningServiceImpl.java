package com.usavich.service.running.impl;

import com.usavich.db.running.dao.def.RunningDAO;
import com.usavich.entity.account.UserInfo;
import com.usavich.entity.common.Experience;
import com.usavich.entity.running.OnGoingRunning;
import com.usavich.entity.running.RunningHistory;
import com.usavich.service.account.def.AccountService;
import com.usavich.service.running.def.RunningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 6/24/13
 * Time: 3:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class RunningServiceImpl implements RunningService {

    @Autowired
    private RunningDAO runningDAO;

    @Autowired
    private AccountService accountService;

    @Override
    public List<RunningHistory> getRunningHistories(Integer userId, Integer missionId) {
        return runningDAO.getRunningHistories(userId, missionId);
    }

    @Override
    public List<RunningHistory> getRunningHistoriesByDate(Integer userId, Date lastUpdateTime, int startSize, int pageSize) {
        return runningDAO.getRunningHistoriesByDate(userId, lastUpdateTime, startSize, pageSize);
    }

    @Override
    @Transactional
    public void createRunningHistory(Integer userId, List<RunningHistory> runningHistoryList) {
        UserInfo userInfo = accountService.getAccountInfoByID(userId);
        for (RunningHistory runningHistory : runningHistoryList) {
            runningDAO.createRunningHistory(runningHistory);
            //need add user info
            userInfo = updateUserInfo(userInfo, runningHistory);
        }
        accountService.updateAccountInfo(userInfo);
    }

    private UserInfo updateUserInfo(UserInfo userInfo, RunningHistory runningHistory) {
        //1000 meter sync as 200 experience
        double experience = userInfo.getExperience() + runningHistory.getExperience() + runningHistory.getDistance()/1000*200;
        userInfo.setExperience(experience);
        int minutes=(int) (((runningHistory.getMissionEndTime().getTime() - runningHistory.getMissionStartTime().getTime())/(1000*60)));
        if(minutes>0){
           double scores = userInfo.getScores() + runningHistory.getScores() + runningHistory.getDistance()/minutes*runningHistory.getDistance()/1000;
           userInfo.setScores(scores);
        }
        Experience experienceInfo = runningDAO.getExperienceLevel(experience);
        double level = experienceInfo.getLevel() +  (experience - (experienceInfo.getExperienceTotal()-experienceInfo.getExperience()))/experienceInfo.getExperience();
        userInfo.setLevel(level);
        return userInfo;
    }

    @Override
    public List<OnGoingRunning> getOnGoingRunning(Integer userId, Date lastUpdateTime) {
        return runningDAO.getOnGoingRunning(userId, lastUpdateTime);
    }

    @Override
    @Transactional
    public void createOnGoingRunning(Integer userId, List<OnGoingRunning> goingRunningList) {
        for (OnGoingRunning onGoingRunning : goingRunningList) {
            runningDAO.createOnGoingRunning(onGoingRunning);
        }
    }
}
