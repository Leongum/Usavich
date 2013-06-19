package com.usavich.rest.mission;

import com.usavich.common.lib.CommonUtils;
import com.usavich.entity.mission.*;
import com.usavich.service.mission.def.MissionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 6/19/13
 * Time: 8:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class MissionRestService implements MissionRestDef {

    @Autowired
    private MissionService missionService;

    @Override
    public List<Mission> getMissions(String missionId, String minId, String lastUpdateTime) {
        return missionService.getMissions(CommonUtils.parseIntegerToNull(missionId),
                CommonUtils.parseIntegerToNull(minId),
                CommonUtils.parseDateDefaultToNull(lastUpdateTime));
    }

    @Override
    public List<MissionPackage> getMissionPackages(String packageId, String minId, String lastUpdateTime) {
        return missionService.getMissionPackages(CommonUtils.parseIntegerToNull(packageId),
                CommonUtils.parseIntegerToNull(minId),
                CommonUtils.parseDateDefaultToNull(lastUpdateTime));
    }

    @Override
    public List<MissionPlacePackage> getMissionPlacePackages(String packageId) {
        return missionService.getMissionPlacePackage(CommonUtils.parseIntegerToNull(packageId));
    }
}
