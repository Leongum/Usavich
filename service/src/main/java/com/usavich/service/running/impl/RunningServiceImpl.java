package com.usavich.service.running.impl;

import com.usavich.db.running.dao.def.RunningDAO;
import com.usavich.entity.running.OnGoingRunning;
import com.usavich.entity.running.RunningHistory;
import com.usavich.service.running.def.RunningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 6/24/13
 * Time: 3:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class RunningServiceImpl implements RunningService{

    @Autowired
    private RunningDAO runningDAO;

    @Override
    public List<RunningHistory> getRunningHistories(Integer userId, Integer missionId) {
        return runningDAO.getRunningHistories(userId,missionId);
    }

    @Override
    @Transactional
    public void createRunningHistory(RunningHistory runningHistory) {
        runningDAO.createRunningHistory(runningHistory);
        //need add user info
    }

    @Override
    public List<OnGoingRunning> getOnGoingRunning(Integer userId) {
        return runningDAO.getOnGoingRunning(userId);
    }

    @Override
    @Transactional
    public void createOnGoingRunning(OnGoingRunning goingRunning) {
        runningDAO.createOnGoingRunning(goingRunning);
    }
}
