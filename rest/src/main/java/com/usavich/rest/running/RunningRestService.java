package com.usavich.rest.running;

import com.usavich.common.lib.CommonUtils;
import com.usavich.entity.running.OnGoingRunning;
import com.usavich.entity.running.RunningHistory;
import com.usavich.rest.common.RestUtils;
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
    public List<RunningHistory> getRunningHistories(String userId, String lastUpdateTime, int pageNo, int pageSize) {
        if (pageNo <= 0)
            pageNo = defaultPageNo;
        if (pageSize <= 0)
            pageSize = defaultPageSize;
        int startSize = Math.max((pageNo - 1), 0) * pageSize;

        return runningService.getRunningHistoriesByDate(CommonUtils.parseIntegerToNull(userId),
                CommonUtils.parseDateDefaultToNull(lastUpdateTime), startSize, pageSize);
    }

    @Override
    public List<OnGoingRunning> getOnGoingRunning(String userId, String lastUpdateTime) {
        return runningService.getOnGoingRunning(CommonUtils.parseIntegerToNull(userId), CommonUtils.parseDateDefaultToNull(lastUpdateTime));
    }

    @Override
    public void createRunningHistory(String userId, List<RunningHistory> runningHistoryList) {
        RestUtils.checkUserId(userId);
        for (RunningHistory runningHistory : runningHistoryList) {
            runningHistory.setUserId(CommonUtils.parseIntegerToNull(userId));
        }
        runningService.createRunningHistory(runningHistoryList);
    }

    @Override
    public void createOnGoingRunning(String userId, List<OnGoingRunning> onGoingRunningList) {
        RestUtils.checkUserId(userId);
        for (OnGoingRunning onGoingRunning : onGoingRunningList) {
            onGoingRunning.setUserId(CommonUtils.parseIntegerToNull(userId));
        }
        runningService.createOnGoingRunning(onGoingRunningList);
    }
}
