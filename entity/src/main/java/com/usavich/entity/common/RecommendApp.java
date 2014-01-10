package com.usavich.entity.common;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: p
 * Date: 14-1-10
 * Time: 下午8:44
 * To change this template use File | Settings | File Templates.
 */
public class RecommendApp {

    private Integer appId;
    private String appName;
    private String appDescription;
    private String appPicLink;
    private Date lastUpdateTime;
    private Integer recommendStatus;
    private Integer sequence;

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppDescription() {
        return appDescription;
    }

    public void setAppDescription(String appDescription) {
        this.appDescription = appDescription;
    }

    public String getAppPicLink() {
        return appPicLink;
    }

    public void setAppPicLink(String appPicLink) {
        this.appPicLink = appPicLink;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Integer getRecommendStatus() {
        return recommendStatus;
    }

    public void setRecommendStatus(Integer recommendStatus) {
        this.recommendStatus = recommendStatus;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
}
