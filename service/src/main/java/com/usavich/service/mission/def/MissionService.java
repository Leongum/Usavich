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

    List<Mission> getMissions(Integer missionId, Integer minId, Date lastUpdateTime);

    List<MissionPackage> getMissionPackages(Integer packageId, Integer minId, Date lastUpdateTime);

    List<MissionPlacePackage> getMissionPlacePackage(Integer missionPlacePackageId);
}
