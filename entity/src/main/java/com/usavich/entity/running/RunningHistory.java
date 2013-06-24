package com.usavich.entity.running;

import java.math.BigInteger;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 6/24/13
 * Time: 11:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class RunningHistory {
    private Integer userId;
    private Integer missionId;
    private Integer missionTypeId;
    private String missionRoute;
    private Date missionStartTime;
    private Date missionEndTime;
    private Date missionDate;
    private double spendCarlorie;
    private BigInteger duration;
    private double avgSpeed;
    private double distance;
    private String offerUsers;
    private Integer missionGrade;
    private double scores;
    private double experience;
    private String comment;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public String getMissionRoute() {
        return missionRoute;
    }

    public void setMissionRoute(String missionRoute) {
        this.missionRoute = missionRoute;
    }

    public Date getMissionStartTime() {
        return missionStartTime;
    }

    public void setMissionStartTime(Date missionStartTime) {
        this.missionStartTime = missionStartTime;
    }

    public Date getMissionEndTime() {
        return missionEndTime;
    }

    public void setMissionEndTime(Date missionEndTime) {
        this.missionEndTime = missionEndTime;
    }

    public Date getMissionDate() {
        return missionDate;
    }

    public void setMissionDate(Date missionDate) {
        this.missionDate = missionDate;
    }

    public double getSpendCarlorie() {
        return spendCarlorie;
    }

    public void setSpendCarlorie(double spendCarlorie) {
        this.spendCarlorie = spendCarlorie;
    }

    public BigInteger getDuration() {
        return duration;
    }

    public void setDuration(BigInteger duration) {
        this.duration = duration;
    }

    public double getAvgSpeed() {
        return avgSpeed;
    }

    public void setAvgSpeed(double avgSpeed) {
        this.avgSpeed = avgSpeed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getOfferUsers() {
        return offerUsers;
    }

    public void setOfferUsers(String offerUsers) {
        this.offerUsers = offerUsers;
    }

    public Integer getMissionGrade() {
        return missionGrade;
    }

    public void setMissionGrade(Integer missionGrade) {
        this.missionGrade = missionGrade;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
