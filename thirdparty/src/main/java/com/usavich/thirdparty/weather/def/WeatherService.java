package com.usavich.thirdparty.weather.def;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 6/3/13
 * Time: 2:31 PM
 * To change this template use File | Settings | File Templates.
 */
public interface WeatherService {

    String getPM25Object(String city) throws IOException, Exception;
}
