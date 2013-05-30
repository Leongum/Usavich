package com.usavich.service.account.def;

import com.usavich.entity.account.*;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 3/6/13
 * Time: 11:51 AM
 * To change this template use File | Settings | File Templates.
 */
public interface AccountService {

    UserInfo getAccountInfo(String userEmail, String password);

    UserInfo createAccountInfo(UserBase userBase);
}
