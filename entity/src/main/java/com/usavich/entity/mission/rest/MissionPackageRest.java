package com.usavich.entity.mission.rest;

import com.usavich.common.lib.CustomDateSerializer;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 6/19/13
 * Time: 6:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class MissionPackageRest {

    private Integer missionPackageId;
    private String missionPackageName;
    private String missionPackageDescription;
    private List<MissionPackageList> missionPackageListList = new ArrayList<MissionPackageList>();
    private Date lastUpdateTime;

    public Integer getMissionPackageId() {
        return missionPackageId;
    }

    public void setMissionPackageId(Integer missionPackageId) {
        this.missionPackageId = missionPackageId;
    }

    public String getMissionPackageName() {
        return missionPackageName;
    }

    public void setMissionPackageName(String missionPackageName) {
        this.missionPackageName = missionPackageName;
    }

    public String getMissionPackageDescription() {
        return missionPackageDescription;
    }

    public void setMissionPackageDescription(String missionPackageDescription) {
        this.missionPackageDescription = missionPackageDescription;
    }

    public List<MissionPackageList> getMissionPackageListList() {
        return missionPackageListList;
    }

    public void setMissionPackageListList(List<MissionPackageList> missionPackageListList) {
        this.missionPackageListList = missionPackageListList;
    }

    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}
