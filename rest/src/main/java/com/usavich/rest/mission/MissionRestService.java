package com.usavich.rest.mission;

import com.usavich.common.lib.CommonUtils;
import com.usavich.entity.mission.*;
import com.usavich.entity.mission.rest.*;
import com.usavich.service.mission.def.MissionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    private List<MissionPackageRest> missionPackageRestMapper(List<MissionPackage> missionPackageList) {
        List<MissionPackageRest> missionPackageRestList = new ArrayList<MissionPackageRest>();
        if (missionPackageList != null && missionPackageList.size() > 0) {
            Map<Integer, List<MissionPackage>> missionPackageMap;
            missionPackageMap = CommonUtils.toListMap(missionPackageList, new CommonUtils.IGetKey<Integer, MissionPackage>() {
                @Override
                public Integer getKey(MissionPackage obj) {
                    return obj.getMissionPackageId();
                }
            });
            for (Integer missionPackageId : missionPackageMap.keySet()) {
                List<MissionPackage> missionPackageListById = missionPackageMap.get(missionPackageId);
                MissionPackageRest missionPackageRest = new MissionPackageRest();
                if (missionPackageListById != null && missionPackageListById.size() > 0) {
                    missionPackageRest.setMissionPackageId(missionPackageListById.get(0).getMissionPackageId());
                    missionPackageRest.setMissionPackageName(missionPackageListById.get(0).getMissionPackageName());
                    missionPackageRest.setMissionPackageDescription(missionPackageListById.get(0).getMissionPackageDescription());
                    missionPackageRest.setLastUpdateTime(missionPackageListById.get(0).getLastUpdateTime());
                    for (MissionPackage missionPackage : missionPackageListById) {
                        MissionPackageList missionPackageInnerList = new MissionPackageList();
                        missionPackageInnerList.setMissionId(missionPackage.getMissionId());
                        missionPackageInnerList.setMissionTypeId(missionPackage.getMissionTypeId());
                        missionPackageInnerList.setSequence(missionPackage.getSequence());
                        missionPackageRest.getMissionPackageListList().add(missionPackageInnerList);
                    }
                }
                missionPackageRestList.add(missionPackageRest);
            }

        }
        return missionPackageRestList;
    }

    @Override
    public List<Mission> getMissions(String missionId, String minId, String lastUpdateTime) {
        return missionService.getMissions(CommonUtils.parseIntegerToNull(missionId),
                CommonUtils.parseIntegerToNull(minId),
                CommonUtils.parseDateDefaultToNull(lastUpdateTime));
    }

    @Override
    public List<MissionPackageRest> getMissionPackages(String packageId, String minId, String lastUpdateTime) {
        List<MissionPackage> missionPackageList = missionService.getMissionPackages(CommonUtils.parseIntegerToNull(packageId),
                CommonUtils.parseIntegerToNull(minId),
                CommonUtils.parseDateDefaultToNull(lastUpdateTime));
        return missionPackageRestMapper(missionPackageList);
    }

    @Override
    public List<MissionPlacePackage> getMissionPlacePackages(String packageId) {
        return missionService.getMissionPlacePackage(CommonUtils.parseIntegerToNull(packageId));
    }
}
