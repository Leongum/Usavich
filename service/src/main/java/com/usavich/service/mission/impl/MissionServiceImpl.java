package com.usavich.service.mission.impl;

import com.usavich.common.exception.ErrorMessageMapper;
import com.usavich.common.exception.ServerRequestException;
import com.usavich.db.mission.dao.def.MissionDAO;
import com.usavich.entity.mission.*;
import com.usavich.service.mission.def.MissionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
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
    public List<Mission> getMissions(Integer missionId, Integer minId, Date lastUpdateTime) {
        List<Mission> missionList = new ArrayList<Mission>();
        if (missionId != null) {
            missionList = missionDAO.getMissionById(missionId);
        } else if (minId != null) {
            missionList = missionDAO.getMissionListByMinId(minId);
        } else if (lastUpdateTime != null) {
            missionList = missionDAO.getMissionListByTime(lastUpdateTime);
        }else{
            throw new ServerRequestException(ErrorMessageMapper.PARAM_ERROR.toString());
        }

        for (Mission mission : missionList) {
            if (mission.getMissionPlacePackage() != null) {
                List<MissionPlacePackage> missionPlacePackageList = missionDAO.getMissionPlacePackage(mission.getMissionPlacePackage());
                mission.setMissionPlacePackages(missionPlacePackageList);
            }
        }

        return missionList;
    }

    @Override
    public List<MissionPackage> getMissionPackages(Integer packageId, Integer minId, Date lastUpdateTime) {
        List<MissionPackage> missionPackagesList = new ArrayList<MissionPackage>();
        if (packageId != null) {
            missionPackagesList = missionDAO.getMissionPackageListById(packageId);
        } else if (minId != null) {
            missionPackagesList = missionDAO.getMissionPackageListByMinId(minId);
        } else if (lastUpdateTime != null) {
            missionPackagesList = missionDAO.getMissionPackageListByTime(lastUpdateTime);
        }else{
            throw new ServerRequestException(ErrorMessageMapper.PARAM_ERROR.toString());
        }
        return missionPackagesList;
    }

    @Override
    public List<MissionPlacePackage> getMissionPlacePackage(Integer missionPlacePackageId) {
        return missionDAO.getMissionPlacePackage(missionPlacePackageId);
    }
}
