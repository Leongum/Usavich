package com.usavich.thirdparty.httpService.impl;

import com.usavich.thirdparty.httpService.*;
import org.apache.http.HttpEntity;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 6/5/13
 * Time: 3:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class PM25GetRequest extends AbstractURIParameter {

    private String city;
    private String stations;
    private String avg;
    private String token;
    private String pm25getUrl;

    @Override
    protected HttpEntity getHttpEntity() {
        return null;
    }

    @Override
    protected String getMethod() {
        return "GET";
    }

    @Override
    protected Map<String, Object> getHttpParams() {
        return null;
    }

    @Override
    protected Map<String, String> getHttpHeader() {
        return null;
    }

    @Override
    public String getUri() {
        String uri = pm25getUrl + "?city=" + city + "&token=" + token;
        if (stations != null) {
            uri += "&stations=" + stations;
        }
        if (avg != null) {
            avg += "&avg=" + avg;
        }
        return uri;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStations() {
        return stations;
    }

    public void setStations(String stations) {
        this.stations = stations;
    }

    public String getAvg() {
        return avg;
    }

    public void setAvg(String avg) {
        this.avg = avg;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPm25getUrl() {
        return pm25getUrl;
    }

    public void setPm25getUrl(String pm25getUrl) {
        this.pm25getUrl = pm25getUrl;
    }
}
