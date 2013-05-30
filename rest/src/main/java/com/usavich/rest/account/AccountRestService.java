package com.usavich.rest.account;

import com.usavich.entity.account.*;
import com.usavich.service.account.def.AccountService;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 3/7/13
 * Time: 2:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class AccountRestService implements AccountRestDef{

    @Autowired
    private AccountService accountService;

    @Override
    public UserInfo getAccountInfo(String userEmail, String password) {

        UserInfo accountInfo = accountService.getAccountInfo(userEmail,password);

        return accountInfo;
    }

    @Override
    public UserInfo createAccountInfo(UserBase userBase) {

        UserInfo accountInfo = accountService.createAccountInfo(userBase);

        return accountInfo;
    }
}
