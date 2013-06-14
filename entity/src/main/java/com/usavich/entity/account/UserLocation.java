package com.usavich.entity.account;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 5/28/13
 * Time: 5:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserLocation extends UserBase {

    private Integer userId;

    private String lastLocationContent;

    private String lastLocationPoint;

    private Date lastActiveTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLastLocationContent() {
        return lastLocationContent;
    }

    public void setLastLocationContent(String lastLocationContent) {
        this.lastLocationContent = lastLocationContent;
    }

    public String getLastLocationPoint() {
        return lastLocationPoint;
    }

    public void setLastLocationPoint(String lastLocationPoint) {
        this.lastLocationPoint = lastLocationPoint;
    }

    public Date getLastActiveTime() {
        return lastActiveTime;
    }

    public void setLastActiveTime(Date lastActiveTime) {
        this.lastActiveTime = lastActiveTime;
    }
}