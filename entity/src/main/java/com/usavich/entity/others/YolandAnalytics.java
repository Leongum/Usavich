package com.usavich.entity.others;

/**
 * Created with IntelliJ IDEA.
 * User: p
 * Date: 13-12-6
 * Time: 上午11:04
 * To change this template use File | Settings | File Templates.
 */
public class YolandAnalytics {

    private String company_id;
    private String company_name;
    private Integer question_id;
    private String question_name;
    private String question_answer;

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public Integer getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(Integer question_id) {
        this.question_id = question_id;
    }

    public String getQuestion_name() {
        return question_name;
    }

    public void setQuestion_name(String question_name) {
        this.question_name = question_name;
    }

    public String getQuestion_answer() {
        return question_answer;
    }

    public void setQuestion_answer(String question_answer) {
        this.question_answer = question_answer;
    }
}
