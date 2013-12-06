package com.usavich.service.common.impl;

import com.usavich.db.common.dao.def.CommonDAO;
import com.usavich.entity.common.*;
import com.usavich.entity.others.YolandCalc;
import com.usavich.service.Cache.CacheFacade;
import com.usavich.service.backend.BackendJobCache;
import com.usavich.service.common.def.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: p
 * Date: 13-9-14
 * Time: 下午1:52
 * To change this template use File | Settings | File Templates.
 */
public class CommonServiceImpl implements CommonService {

    @Autowired
    private CommonDAO commonDAO;

    @Override
    @Transactional
    public VersionControl getVersionControl(String platform) {
        return commonDAO.getVersionControl(platform);
    }

    @Override
    public VersionControl getVersionForRest(String platform) {
        VersionControl versionControl = new VersionControl();
        if (platform.equalsIgnoreCase("ios")) {
            versionControl = BackendJobCache.versionControlIOS;
        } else {
            versionControl = getVersionControl(platform);
        }
        versionControl.setMessageLastUpdateTime(BackendJobCache.messageLastTime);
        versionControl.setMissionLastUpdateTime(BackendJobCache.missionLastTime);
        return versionControl;
    }

    @Override
    public List<SystemMessage> getSystemMessage(Date lastUpdateTime) {
        return commonDAO.getSystemMessage(lastUpdateTime);
    }

    @Override
    public List<SystemMessage> getSystemMessageForRest(Date lastUpdateTime) {
        if (lastUpdateTime.before(BackendJobCache.messageFirstTime)) {
            return BackendJobCache.allMessages;
        }
        if (lastUpdateTime.after(BackendJobCache.messageLastTime)) {
            return new ArrayList<SystemMessage>();
        }
        return getSystemMessage(lastUpdateTime);
    }

    @Override
    public void createFeedback(Feedback feedback) {
        commonDAO.createFeedback(feedback);
    }

    @Override
    public void createDownLoadInfo(Statistics statistics) {
        commonDAO.createDownLoadInfo(statistics);
    }

    @Override
    public void createMethodCollector(Map<String, Integer> methods) {
        Date now = new Date();
        for (String key : methods.keySet()) {
            MethodCollector methodCollector = new MethodCollector();
            methodCollector.setMethodName(key);
            methodCollector.setMethodTimes(methods.get(key));
            methodCollector.setUseDate(now);
            commonDAO.createMethodCollector(methodCollector);
        }
    }

    @Override
    public void evictCache(String cacheId) {
        if (cacheId.equalsIgnoreCase("all")) {
            CacheFacade.PLAN.evictAll();
        }
        if (cacheId.startsWith("plan")) {
            CacheFacade.PLAN.evict(cacheId);
        }
    }

    @Override
    public void createYolandCalc(YolandCalc yolandCalc) {
        commonDAO.createYolandDic(yolandCalc);
    }
}
