package com.usavich.rest.plan;

import com.usavich.common.lib.CommonUtils;
import com.usavich.entity.plan.*;
import com.usavich.service.plan.def.PlanService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: p
 * Date: 13-11-12
 * Time: 上午9:40
 * To change this template use File | Settings | File Templates.
 */
public class PlanRestService implements PlanRestDef {

    @Autowired
    private PlanService planService;

    @Override
    public Plan getPlan(String planId, String lastUpdateTime, String needDetails) {
        Integer detailInformation = CommonUtils.parseIntegerToNull(needDetails);
        if (detailInformation == null) {
            detailInformation = 1;
        }
        return planService.getPlan(CommonUtils.parseIntegerToNull(planId),
                CommonUtils.parseDateDefaultToNull(lastUpdateTime), detailInformation);
    }

    @Override
    public List<Plan> getPlans(String pageNo) {
        return planService.getPlanByPageNo(CommonUtils.parseIntegerToNull(pageNo));
    }

    @Override
    public List<PlanCollect> getPlanCollection(String userId, String lastUpdateTime) {
        return planService.getPlanCollection(CommonUtils.parseIntegerToNull(userId),
                CommonUtils.parseDateDefaultToNull(lastUpdateTime));
    }

    @Override
    public void updateUserCollects(String userId, List<PlanCollect> planCollects) {
        planService.updateUserCollects(CommonUtils.parseIntegerToNull(userId), planCollects);
    }

    @Override
    public List<PlanRunHistory> getPlanRunHistory(String userId, String lastUpdateTime) {
        return planService.getPlanRunHistory(CommonUtils.parseIntegerToNull(userId),
                CommonUtils.parseDateDefaultToNull(lastUpdateTime));
    }

    @Override
    public PlanRunHistory checkRunningHistoryStatus(String userId, PlanRunHistory planHistory) {
        return planService.checkRunningHistoryStatus(CommonUtils.parseIntegerToNull(userId),planHistory);
    }

    @Override
    public List<PlanRunHistory> getPlanRunningByPlanId(String planId) {
        return planService.getPlanRunningByPlanId(CommonUtils.parseIntegerToNull(planId));
    }

    @Override
    public List<PlanRunHistory> getPlanRunningByUserId(String userId) {
        return planService.getPlanRunningByUserId(CommonUtils.parseIntegerToNull(userId));
    }

    @Override
    public List<PlanUserFollow> getPlanFollower(String userId, String lastUpdateTime) {
        return planService.getPlanFollower(CommonUtils.parseIntegerToNull(userId),
                CommonUtils.parseDateDefaultToNull(lastUpdateTime));
    }

    @Override
    public void updatePlanFollower(String userId, List<PlanUserFollow> planFollow) {
        planService.updatePlanFollower(CommonUtils.parseIntegerToNull(userId), planFollow);
    }
}
