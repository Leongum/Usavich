package com.usavich.entity.mission.rest;

import com.usavich.common.lib.CustomDateDeserializer;
import com.usavich.common.lib.CustomDateSerializer;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
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
    private List<MissionPackageList> missionPackageList = new ArrayList<MissionPackageList>();
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

    public List<MissionPackageList> getMissionPackageList() {
        return missionPackageList;
    }

    public void setMissionPackageList(List<MissionPackageList> missionPackageList) {
        this.missionPackageList = missionPackageList;
    }

    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    @JsonDeserialize(using = CustomDateDeserializer.class)
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}
