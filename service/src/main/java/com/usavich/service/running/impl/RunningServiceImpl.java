package com.usavich.service.running.impl;

import com.usavich.db.running.dao.def.RunningDAO;
import com.usavich.entity.running.OnGoingRunning;
import com.usavich.entity.running.RunningHistory;
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
    public void createRunningHistory(List<RunningHistory> runningHistoryList) {
        for (RunningHistory runningHistory : runningHistoryList) {
            runningDAO.createRunningHistory(runningHistory);
            //need add user info
        }
    }

    @Override
    public List<OnGoingRunning> getOnGoingRunning(Integer userId, Date lastUpdateTime) {
        return runningDAO.getOnGoingRunning(userId, lastUpdateTime);
    }

    @Override
    @Transactional
    public void createOnGoingRunning(List<OnGoingRunning> goingRunningList) {
        for (OnGoingRunning onGoingRunning : goingRunningList) {
            runningDAO.createOnGoingRunning(onGoingRunning);
        }
    }
}
