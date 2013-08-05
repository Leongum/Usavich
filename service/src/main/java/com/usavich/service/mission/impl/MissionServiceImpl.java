package com.usavich.service.mission.impl;

import com.usavich.db.mission.dao.def.MissionDAO;
import com.usavich.entity.enums.MissionType;
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

    public List<Mission> getMissions(Integer missionId, Date lastUpdateTime, Integer missionTypeId) {
        List<Mission> missionList = new ArrayList<Mission>();

        missionList = missionDAO.getMissions(missionId, lastUpdateTime, missionTypeId);

        for (Mission mission : missionList) {
            if (mission.getMissionPlacePackageId() != null) {
                List<MissionPlacePackage> missionPlacePackageList = missionDAO.getMissionPlacePackage(mission.getMissionPlacePackageId());
                mission.setMissionPlacePackages(missionPlacePackageList);
            }
            if (mission.getChallengeId() != null) {
                List<MissionChallenge> missionChallengeList = missionDAO.getMissionChallenges(mission.getChallengeId());
                mission.setMissionChallenges(missionChallengeList);
            }
        }

        return missionList;
    }

    @Override
    public List<MissionPlacePackage> getMissionPlacePackage(Integer missionPlacePackageId) {
        return missionDAO.getMissionPlacePackage(missionPlacePackageId);
    }

    @Override
    public List<MissionChallenge> getMissionChallenge(Integer challengeId) {
        return missionDAO.getMissionChallenges(challengeId);
    }
}
