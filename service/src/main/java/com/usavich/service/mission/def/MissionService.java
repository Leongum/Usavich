package com.usavich.service.mission.def;

import com.usavich.entity.mission.*;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 6/19/13
 * Time: 7:45 PM
 * To change this template use File | Settings | File Templates.
 */
public interface MissionService {

    Mission getMissionById(Integer missionId);

    List<Mission> getMissionListByMinId(Integer minMissionId);

    List<Mission> getMissionListByTime(Date lastUpdateTime);

    MissionPackage getMissionPackageListById(Integer missionPackageId);

    List<MissionPackage> getMissionPackageListByMinId(Integer minMissionPackageId);

    List<MissionPackage> getMissionPackageListByTime(Date lastUpdateTime);

    List<MissionPlacePackage> getMissionPlacePackage(Integer missionPlacePackageId);
}
