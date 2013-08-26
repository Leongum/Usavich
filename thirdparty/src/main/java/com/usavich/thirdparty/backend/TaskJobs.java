package com.usavich.thirdparty.backend;

import com.usavich.thirdparty.weather.def.WeatherService;
import com.usavich.thirdparty.weather.impl.WeatherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: p
 * Date: 13-8-26
 * Time: 下午3:35
 * To change this template use File | Settings | File Templates.
 */
@Service
public class TaskJobs {

    @Autowired
    private WeatherService weatherService;

    public void pm25SyncJob() {
        WeatherServiceImpl.pmInfos = weatherService.getPM25Object();
        WeatherServiceImpl.cityList = weatherService.getPMCityObject();
    }
}
