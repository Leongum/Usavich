package com.usavich.rest.common;

import com.usavich.common.exception.ErrorMessageMapper;
import com.usavich.common.exception.ServerRequestException;
import com.usavich.common.lib.CommonUtils;
import com.usavich.common.lib.Universe;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 7/23/13
 * Time: 5:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class RestUtils {

    public static void checkUserId(String userId) {
        if (CommonUtils.parseIntegerToNull(userId) != Universe.current().getUserId()) {
            throw new ServerRequestException(ErrorMessageMapper.LOGIN_CHECK_FAIL.toString());
        }
    }

}
