package com.usavich.db.mission.dao.impl;

import com.usavich.db.mission.dao.def.MissionDAO;
import com.usavich.entity.mission.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 6/19/13
 * Time: 5:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class MissionDAOImpl implements MissionDAO {

    @Autowired
    private MissionMapper missionMapper;

    @Override
    public List<Mission> getMissionById(Integer missionId) {
        return missionMapper.getMissionById(missionId);
    }

    @Override
    public List<Mission> getMissionListByMinId(Integer minMissionId) {
        return missionMapper.getMissionListByMinId(minMissionId);
    }

    @Override
    public List<Mission> getMissionListByTime(Date lastUpdateTime) {
        return missionMapper.getMissionListByTime(lastUpdateTime);
    }

    @Override
    public List<MissionPackage> getMissionPackageListById(Integer missionPackageId) {
        return missionMapper.getMissionPackageListById(missionPackageId);
    }

    @Override
    public List<MissionPackage> getMissionPackageListByMinId(Integer minMissionPackageId) {
        return missionMapper.getMissionPackageListByMinId(minMissionPackageId);
    }

    @Override
    public List<MissionPackage> getMissionPackageListByTime(Date lastUpdateTime) {
        return missionMapper.getMissionPackageListByTime(lastUpdateTime);
    }

    @Override
    public List<MissionPlacePackage> getMissionPlacePackage(Integer missionPlacePackageId) {
        return missionMapper.getMissionPlacePackage(missionPlacePackageId);
    }
}
