package com.usavich.entity.plan;

import com.usavich.common.lib.CustomDateDeserializer;
import com.usavich.common.lib.CustomDateSerializer;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: p
 * Date: 13-11-8
 * Time: 下午2:24
 * To change this template use File | Settings | File Templates.
 */
public class PlanNextMission {

    private Integer planId;
    private String planRunUuid;
    private Integer userId;
    private String nextMissionId;
    private Date startTime;
    private Date endTime;
    private Date commitTime;

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public String getPlanRunUuid() {
        return planRunUuid;
    }

    public void setPlanRunUuid(String planRunUuid) {
        this.planRunUuid = planRunUuid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNextMissionId() {
        return nextMissionId;
    }

    public void setNextMissionId(String nextMissionId) {
        this.nextMissionId = nextMissionId;
    }

    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getStartTime() {
        return startTime;
    }

    @JsonDeserialize(using = CustomDateDeserializer.class)
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getEndTime() {
        return endTime;
    }

    @JsonDeserialize(using = CustomDateDeserializer.class)
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getCommitTime() {
        return commitTime;
    }

    @JsonDeserialize(using = CustomDateDeserializer.class)
    public void setCommitTime(Date commitTime) {
        this.commitTime = commitTime;
    }
}
