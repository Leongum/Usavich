package com.usavich.db.plan.dao.impl;

import com.usavich.db.plan.dao.def.PlanDAO;
import com.usavich.entity.plan.Plan;
import com.usavich.entity.plan.PlanCollect;
import com.usavich.entity.plan.PlanRunHistory;
import com.usavich.entity.plan.PlanUserFollow;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: p
 * Date: 13-11-8
 * Time: 下午5:43
 * To change this template use File | Settings | File Templates.
 */
public class PlanDAOImpl implements PlanDAO{

    @Autowired
    private PlanMapper planMapper;

    @Override
    public List<Plan> getPlansByPage(Integer from, Integer to) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Plan getPlan(Integer planId, Date lastUpdateTime) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<PlanCollect> getPlanCollection(Integer userId, Date lastUpdateTime) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void createUserCollect(Integer userId, PlanCollect planCollect) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void updateUserCollect(Integer userId, PlanCollect planCollect) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<PlanRunHistory> getPlanRunHistory(Integer userId, Date lastUpdateTime) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PlanRunHistory getPlanRunning(Integer userId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void updatePlanRunning(Integer userId, PlanRunHistory planHistory) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<PlanRunHistory> getPlanRunningByPlanId(Integer planId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<PlanRunHistory> getPlanRunningByUserId(Integer userId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void createPlanFollower(Integer userId, PlanUserFollow planUserFollow) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void updatePlanFollower(Integer userId, PlanUserFollow planUserFollow) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<PlanUserFollow> getPlanFollower(Integer userId, Date lastUpdateTime) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
