package com.usavich.common.lib;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 3/5/13
 * Time: 3:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class CommonUtils {

    public static String checkString(String param, String paramName) {
        checkNull(param, paramName);

        if (param.trim().length() == 0) {
            throw new IllegalArgumentException(String.format("Parameter '%s' should not be empty.", paramName));
        }

        return param;
    }

    public static <T> T checkNull(T param, String paramName) {
        if (param == null) {
            throw new IllegalArgumentException(String.format("Parameter '%s' should not be null.", paramName));
        }

        return param;
    }
}
