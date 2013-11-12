package com.usavich.service.plan.impl;

import com.usavich.db.plan.dao.def.PlanDAO;
import com.usavich.entity.plan.Plan;
import com.usavich.entity.plan.PlanCollect;
import com.usavich.entity.plan.PlanRunHistory;
import com.usavich.entity.plan.PlanUserFollow;
import com.usavich.service.mission.def.MissionService;
import com.usavich.service.plan.def.PlanService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: p
 * Date: 13-11-12
 * Time: 上午9:42
 * To change this template use File | Settings | File Templates.
 */
public class PlanServiceImpl implements PlanService {

    @Autowired
    private PlanDAO planDAO;

    @Autowired
    private MissionService missionService;

    @Override
    public List<Plan> getPlanByPageNo(Integer pageNo) {
        Integer from = pageNo * 10;
        Integer pageSize = 10;
        return planDAO.getPlansByPage(from, pageSize);
    }

    @Override
    public Plan getPlan(Integer planId, Date lastUpdateTime, Integer needMissions) {
        Plan plan = planDAO.getPlan(planId, lastUpdateTime);
        if (needMissions == 1) {
            plan.setMissions(missionService.getMissionsByPlanId(planId));
        }
        return plan;
    }

    @Override
    public List<PlanCollect> getPlanCollection(Integer userId, Date lastUpdateTime) {
        return planDAO.getPlanCollection(userId, lastUpdateTime);
    }

    @Override
    public void updateUserCollects(Integer userId, List<PlanCollect> planCollects) {
        for (int i = 0; i <= planCollects.size(); i++) {
            PlanCollect planCollect = planCollects.get(i);
            planCollect.setCollectTime(new Date());
            if (planCollect.getOperate() == 1) {
                planDAO.createUserCollect(userId, planCollects.get(i));
            } else if (planCollect.getOperate() == 2) {
                planDAO.updateUserCollect(userId, planCollects.get(i));
            }
        }
    }

    @Override
    public List<PlanRunHistory> getPlanRunHistory(Integer userId, Date lastUpdateTime) {
        return planDAO.getPlanRunHistory(userId, lastUpdateTime);
    }

    @Override
    public PlanRunHistory checkRunningHistoryStatus(Integer userId, PlanRunHistory planHistory) {
        PlanRunHistory currentHistory = planDAO.getPlanRunning(userId);
        if (currentHistory == null || currentHistory.getPlanRunUuid() == null) {
            planDAO.createPlanRunning(userId, planHistory);
        } else if (currentHistory.getRemainingMissions() <= planHistory.getRemainingMissions()) {
            planDAO.updatePlanRunning(userId, planHistory);
        } else {
            return currentHistory;
        }
        return planHistory;
    }

    @Override
    public List<PlanRunHistory> getPlanRunningByPlanId(Integer planId, Integer pageNo) {
        Integer from = pageNo * 10;
        Integer pageSize = 30;
        return planDAO.getPlanRunningByPlanId(planId, from, pageSize);
    }

    @Override
    public List<PlanRunHistory> getPlanRunningByUserId(Integer userId, Integer pageNo) {
        Integer from = pageNo * 10;
        Integer pageSize = 30;
        return planDAO.getPlanRunningByUserId(userId, from, pageSize);
    }

    @Override
    public List<PlanUserFollow> getPlanFollower(Integer userId, Date lastUpdateTime) {
        return planDAO.getPlanFollower(userId, lastUpdateTime);
    }

    @Override
    public void updatePlanFollower(Integer userId, List<PlanUserFollow> planFollow) {
        for (int i = 0; i <= planFollow.size(); i++) {
            PlanUserFollow planUserFollow = planFollow.get(i);
            planUserFollow.setAddTime(new Date());
            if (planUserFollow.getOperate() == 1) {
                planDAO.createPlanFollower(userId, planFollow.get(i));
            } else if (planUserFollow.getOperate() == 2) {
                planDAO.updatePlanFollower(userId, planFollow.get(i));
            }
        }
    }
}
