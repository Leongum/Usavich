package com.usavich.entity.product;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 6/20/13
 * Time: 11:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class Product {
    private Integer productId;
    private String productName;
    private String productDesc;
    private double scores;
    private double money;
    private Integer triggerType;
    private double levelLimit;
    private Date startTime;
    private Date endTime;
    private Integer status;
    private double discount;
    private String image;
    private String details;
    private double baseAcc;
    private double crit;
    private double inertia;
    private double luck;
    private Date lastUpdateTime;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public double getScores() {
        return scores;
    }

    public void setScores(double scores) {
        this.scores = scores;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Integer getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(Integer triggerType) {
        this.triggerType = triggerType;
    }

    public double getLevelLimit() {
        return levelLimit;
    }

    public void setLevelLimit(double levelLimit) {
        this.levelLimit = levelLimit;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public double getBaseAcc() {
        return baseAcc;
    }

    public void setBaseAcc(double baseAcc) {
        this.baseAcc = baseAcc;
    }

    public double getCrit() {
        return crit;
    }

    public void setCrit(double crit) {
        this.crit = crit;
    }

    public double getInertia() {
        return inertia;
    }

    public void setInertia(double inertia) {
        this.inertia = inertia;
    }

    public double getLuck() {
        return luck;
    }

    public void setLuck(double luck) {
        this.luck = luck;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}
