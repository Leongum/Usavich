package com.usavich.entity.account;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 3/5/13
 * Time: 2:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserInfo extends UserBase {

    private double level;

    private double scores;

    private double experience;

    private double baseAcc;

    private double inertiaAcc;

    private double crit;

    private double luck;

    public UserInfo(){

    }

    public UserInfo(UserBase userBase) {
        this.setUserId(userBase.getUserId());
        this.setUserEmail(userBase.getUserEmail());
        this.setNickName(userBase.getNickName());
        this.setPassword(userBase.getPassword());
        this.setSex(userBase.getSex());
        this.level = 1;
        this.scores = 0;
        this.experience = 0;
        this.baseAcc = 1;
        this.inertiaAcc = 1;
        this.crit = 1;
        this.luck = 1;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
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

    public double getBaseAcc() {
        return baseAcc;
    }

    public void setBaseAcc(double baseAcc) {
        this.baseAcc = baseAcc;
    }

    public double getInertiaAcc() {
        return inertiaAcc;
    }

    public void setInertiaAcc(double inertiaAcc) {
        this.inertiaAcc = inertiaAcc;
    }

    public double getCrit() {
        return crit;
    }

    public void setCrit(double crit) {
        this.crit = crit;
    }

    public double getLuck() {
        return luck;
    }

    public void setLuck(double luck) {
        this.luck = luck;
    }

}
