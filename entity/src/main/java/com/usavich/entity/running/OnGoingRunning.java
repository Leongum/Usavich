package com.usavich.entity.running;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 6/24/13
 * Time: 11:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class OnGoingRunning {
    private Integer userId;
    private Integer missionId;
    private Integer missionTypeId;
    private Integer missionStatus;
    private Date startTime;

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

    public Integer getMissionStatus() {
        return missionStatus;
    }

    public void setMissionStatus(Integer missionStatus) {
        this.missionStatus = missionStatus;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}
