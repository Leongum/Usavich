package com.usavich.service.mission.impl;

import com.usavich.db.mission.dao.def.MissionDAO;
import com.usavich.entity.mission.Mission;
import com.usavich.entity.mission.MissionPackage;
import com.usavich.entity.mission.MissionPlacePackage;
import com.usavich.service.mission.def.MissionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 6/19/13
 * Time: 7:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class MissionServiceImpl implements MissionService {

    @Autowired
    private MissionDAO missionDAO;

    @Override
    public Mission getMissionById(Integer missionId) {
        Mission mission = missionDAO.getMissionById(missionId);

        if (mission.getMissionPlacePackage() != null) {
            List<MissionPlacePackage> missionPlacePackageList = missionDAO.getMissionPlacePackage(mission.getMissionPlacePackage());
            mission.setMissionPlacePackages(missionPlacePackageList);
        }

        return mission;
    }

    @Override
    public List<Mission> getMissionListByMinId(Integer minMissionId) {
        List<Mission> missionList = missionDAO.getMissionListByMinId(minMissionId);

        for (Mission mission : missionList) {
            if (mission.getMissionPlacePackage() != null) {
                List<MissionPlacePackage> missionPlacePackageList = missionDAO.getMissionPlacePackage(mission.getMissionPlacePackage());
                mission.setMissionPlacePackages(missionPlacePackageList);
            }
        }

        return missionList;
    }

    @Override
    public List<Mission> getMissionListByTime(Date lastUpdateTime) {
        List<Mission> missionList = missionDAO.getMissionListByTime(lastUpdateTime);

        for (Mission mission : missionList) {
            if (mission.getMissionPlacePackage() != null) {
                List<MissionPlacePackage> missionPlacePackageList = missionDAO.getMissionPlacePackage(mission.getMissionPlacePackage());
                mission.setMissionPlacePackages(missionPlacePackageList);
            }
        }

        return missionList;
    }

    @Override
    public MissionPackage getMissionPackageListById(Integer missionPackageId) {
        return missionDAO.getMissionPackageListById(missionPackageId);
    }

    @Override
    public List<MissionPackage> getMissionPackageListByMinId(Integer minMissionPackageId) {
        return missionDAO.getMissionPackageListByMinId(minMissionPackageId);
    }

    @Override
    public List<MissionPackage> getMissionPackageListByTime(Date lastUpdateTime) {
        return missionDAO.getMissionPackageListByTime(lastUpdateTime);
    }

    @Override
    public List<MissionPlacePackage> getMissionPlacePackage(Integer missionPlacePackageId) {
        return missionDAO.getMissionPlacePackage(missionPlacePackageId);
    }
}
