package com.usavich.db.running.dao.def;

import com.usavich.entity.running.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 6/21/13
 * Time: 6:41 PM
 * To change this template use File | Settings | File Templates.
 */
public interface RunningDAO {

    public List<RunningHistory> getRunningHistories(Integer userId, Integer missionId);

    public void createRunningHistory(RunningHistory runningHistory);

    public List<OnGoingRunning> getOnGoingRunning(Integer userId);

    public void createOnGoingRunning(OnGoingRunning goingRunning);
}
