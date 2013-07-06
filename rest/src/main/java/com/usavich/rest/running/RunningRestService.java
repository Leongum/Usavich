package com.usavich.rest.running;

import com.usavich.common.lib.CommonUtils;
import com.usavich.entity.running.OnGoingRunning;
import com.usavich.entity.running.RunningHistory;
import com.usavich.service.running.def.RunningService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 6/24/13
 * Time: 4:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class RunningRestService implements RunningRestDef {

    @Autowired
    private RunningService runningService;

    @Override
    public List<RunningHistory> getRunningHistories(String userId, String missionId) {
        return runningService.getRunningHistories(CommonUtils.parseIntegerToNull(userId),
                CommonUtils.parseIntegerToNull(missionId));
    }

    @Override
    public List<OnGoingRunning> getOnGoingRunning(String userId) {
        return runningService.getOnGoingRunning(CommonUtils.parseIntegerToNull(userId));
    }

    @Override
    public void createRunningHistory(String userId, List<RunningHistory> runningHistoryList) {
        for (RunningHistory runningHistory : runningHistoryList) {
            runningHistory.setUserId(CommonUtils.parseIntegerToNull(userId));
        }
        runningService.createRunningHistory(runningHistoryList);
    }

    @Override
    public void createOnGoingRunning(String userId, List<OnGoingRunning> onGoingRunningList) {
        for(OnGoingRunning onGoingRunning:onGoingRunningList){
        onGoingRunning.setUserId(CommonUtils.parseIntegerToNull(userId));
        }
        runningService.createOnGoingRunning(onGoingRunningList);
    }
}
