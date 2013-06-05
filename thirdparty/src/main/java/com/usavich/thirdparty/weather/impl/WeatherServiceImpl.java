package com.usavich.thirdparty.weather.impl;

import com.usavich.thirdparty.httpService.impl.PM25GetRequest;
import com.usavich.thirdparty.weather.def.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 6/3/13
 * Time: 2:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    private PM25GetRequest pm25GetRequest;

    @Override
    public String getPM25Object(String city) throws Exception {
        pm25GetRequest.setCity(city);
        pm25GetRequest.setStations("no");
        pm25GetRequest.executeHttpRequest();
        return  pm25GetRequest.getResponseMessage();
    }
}