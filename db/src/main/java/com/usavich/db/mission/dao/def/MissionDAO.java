package com.usavich.db.mission.dao.def;

import com.usavich.entity.mission.*;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 6/19/13
 * Time: 5:13 PM
 * To change this template use File | Settings | File Templates.
 */
public interface MissionDAO {

    public List<Mission> getMissionById(Integer missionId);

    public List<Mission> getMissionListByMinId(Integer minMissionId);

    public List<Mission> getMissionListByTime(Date lastUpdateTime);

    public List<MissionPackage> getMissionPackageListById(Integer missionPackageId);

    public List<MissionPackage> getMissionPackageListByMinId(Integer minMissionPackageId);

    public List<MissionPackage> getMissionPackageListByTime(Date lastUpdateTime);

    public List<MissionPlacePackage> getMissionPlacePackage(Integer missionPlacePackageId);

}
