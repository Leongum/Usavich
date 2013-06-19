package com.usavich.db.mission.dao.impl;

import com.usavich.entity.mission.*;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 6/19/13
 * Time: 5:14 PM
 * To change this template use File | Settings | File Templates.
 */
public interface MissionMapper {
    public List<Mission> getMissionById(@Param("missionId") Integer missionId);

    public List<Mission> getMissionListByMinId(@Param("minMissionId") Integer minMissionId);

    public List<Mission> getMissionListByTime(@Param("lastUpdateTime") Date lastUpdateTime);

    public List<MissionPackage> getMissionPackageListById(@Param("missionPackageId") Integer missionPackageId);

    public List<MissionPackage> getMissionPackageListByMinId(@Param("minMissionPackageId") Integer minMissionPackageId);

    public List<MissionPackage> getMissionPackageListByTime(@Param("lastUpdateTime") Date lastUpdateTime);

    public List<MissionPlacePackage> getMissionPlacePackage(@Param("missionPlacePackageId") Integer missionPlacePackageId);
}
