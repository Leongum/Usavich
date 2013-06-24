package com.usavich.service.running.def;

import com.usavich.entity.running.OnGoingRunning;
import com.usavich.entity.running.RunningHistory;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 6/24/13
 * Time: 3:20 PM
 * To change this template use File | Settings | File Templates.
 */
public interface RunningService {

    List<RunningHistory> getRunningHistories(Integer userId, Integer missionId);

    void createRunningHistory(RunningHistory runningHistory);

    List<OnGoingRunning> getOnGoingRunning(Integer userId);

    void createOnGoingRunning(OnGoingRunning goingRunning);
}
