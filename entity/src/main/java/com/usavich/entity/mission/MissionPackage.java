package com.usavich.entity.mission;

import com.usavich.common.lib.CustomDateDeserializer;
import com.usavich.common.lib.CustomDateSerializer;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 6/19/13
 * Time: 6:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class MissionPackage {

    private Integer missionPackageId;
    private String missionPackageName;
    private String missionPackageDescription;
    private Integer missionId;
    private Integer missionTypeId;
    private Integer sequence;
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

    public Integer getMissionId() {
        return missionId;
    }

    public void setMissionId(Integer missionId) {
        this.missionId = missionId;
    }

    public Integer getMissionTypeId() {
        return missionTypeId;
    }

    public void setMissionTypeId(Integer missionTypeId) {
        this.missionTypeId = missionTypeId;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
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
