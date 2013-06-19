package com.usavich.rest.mission;

import com.usavich.common.lib.CommonUtils;
import com.usavich.entity.mission.Mission;
import com.usavich.entity.mission.MissionPackage;
import com.usavich.entity.mission.MissionPlacePackage;
import com.usavich.service.mission.def.MissionService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.QueryParam;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 6/19/13
 * Time: 8:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class MissionRestService implements MissionRestDef{

    @Autowired
    private MissionService missionService;

    @Override
    public Mission getMissionById(@QueryParam(PARAM_MISSION_ID) String missionId) {
        return missionService.getMissionById(Integer.valueOf(missionId));
    }

    @Override
    public List<Mission> getMissionListByMinId(@QueryParam(PARAM_MISSION_MIN_ID) String missionMinId) {
        return missionService.getMissionListByMinId(Integer.valueOf(missionMinId));
    }

    @Override
    public List<Mission> getMissionListByTime(@QueryParam(PARAM_LAST_UPDATE_TIME) String lastUpdateTime) {
        return missionService.getMissionListByTime(CommonUtils.parseDateDefaultToNull(lastUpdateTime));
    }

    @Override
    public MissionPackage getMissionPackageListById(@QueryParam(PARAM_MISSION_PACKAGE_ID) String missionPackageId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<MissionPackage> getMissionPackageListByMinId(@QueryParam(PARAM_MISSION_MIN_PACKAGE_ID) String missionPackageMinId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<MissionPackage> getMissionPackageListByTime(@QueryParam(PARAM_LAST_UPDATE_TIME) String lastUpdateTime) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<MissionPlacePackage> getMissionPlacePackage(@QueryParam(PARAM_MISSION_PLACE_PACKAGE_ID) String missionPlacePackageId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
