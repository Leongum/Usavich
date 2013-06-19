package com.usavich.entity.mission;

import com.usavich.common.lib.CustomDateSerializer;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.springframework.dao.DataAccessException;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 6/19/13
 * Time: 6:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class Mission {

    private Integer missionId;
    private Integer missionTypeId;
    private String missionName;
    private String missionContent;
    private double scores;
    private double experience;
    private Integer missionFlag;
    private double levelLimited;
    private BigInteger missionTime;
    private double missionDistance;
    private double cycleTime;
    private String missionFrom;
    private String missionTo;
    private Integer missionPlacePackage;
    private List<MissionPlacePackage> missionPlacePackages;
    private BigInteger missionSteps;
    private double missionSpeed;
    private Date lastUpdateTime;

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

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public String getMissionContent() {
        return missionContent;
    }

    public void setMissionContent(String missionContent) {
        this.missionContent = missionContent;
    }

    public double getScores() {
        return scores;
    }

    public void setScores(double scores) {
        this.scores = scores;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public Integer getMissionFlag() {
        return missionFlag;
    }

    public void setMissionFlag(Integer missionFlag) {
        this.missionFlag = missionFlag;
    }

    public double getLevelLimited() {
        return levelLimited;
    }

    public void setLevelLimited(double levelLimited) {
        this.levelLimited = levelLimited;
    }

    public BigInteger getMissionTime() {
        return missionTime;
    }

    public void setMissionTime(BigInteger missionTime) {
        this.missionTime = missionTime;
    }

    public double getMissionDistance() {
        return missionDistance;
    }

    public void setMissionDistance(double missionDistance) {
        this.missionDistance = missionDistance;
    }

    public double getCycleTime() {
        return cycleTime;
    }

    public void setCycleTime(double cycleTime) {
        this.cycleTime = cycleTime;
    }

    public String getMissionFrom() {
        return missionFrom;
    }

    public void setMissionFrom(String missionFrom) {
        this.missionFrom = missionFrom;
    }

    public String getMissionTo() {
        return missionTo;
    }

    public void setMissionTo(String missionTo) {
        this.missionTo = missionTo;
    }

    public Integer getMissionPlacePackage() {
        return missionPlacePackage;
    }

    public void setMissionPlacePackage(Integer missionPlacePackage) {
        this.missionPlacePackage = missionPlacePackage;
    }

    public BigInteger getMissionSteps() {
        return missionSteps;
    }

    public void setMissionSteps(BigInteger missionSteps) {
        this.missionSteps = missionSteps;
    }

    public double getMissionSpeed() {
        return missionSpeed;
    }

    public void setMissionSpeed(double missionSpeed) {
        this.missionSpeed = missionSpeed;
    }

    public List<MissionPlacePackage> getMissionPlacePackages() {
        return missionPlacePackages;
    }

    public void setMissionPlacePackages(List<MissionPlacePackage> missionPlacePackages) {
        this.missionPlacePackages = missionPlacePackages;
    }

    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}
