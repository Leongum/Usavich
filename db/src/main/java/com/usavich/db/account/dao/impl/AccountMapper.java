package com.usavich.db.account.dao.impl;

import org.apache.ibatis.annotations.Param;

import com.usavich.entity.account.model.*;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 3/5/13
 * Time: 5:06 PM
 * To change this template use File | Settings | File Templates.
 */
public interface AccountMapper {

    public UserInfo getAccountInfo(@Param("userEmail") String userEmail,
                                      @Param("password") String password);

    public int createBase(@Param("baseEntity") UserBase userBase);

    public void createDetail(@Param("detailEntity") UserInfo accountInfo);
}
