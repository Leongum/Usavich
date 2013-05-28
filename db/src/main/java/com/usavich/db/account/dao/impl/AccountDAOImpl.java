package com.usavich.db.account.dao.impl;

import com.usavich.db.account.dao.def.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;

import com.usavich.entity.account.model.*;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 3/5/13
 * Time: 5:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class AccountDAOImpl implements AccountDAO {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public UserInfo getAccountInfo(String userEmail, String password) {
        return accountMapper.getAccountInfo(userEmail, password);
    }

    @Override
    public UserInfo createAccountInfo(UserBase userBase) {
        accountMapper.createBase(userBase);
        UserInfo accountInfo = new UserInfo(userBase);
        accountMapper.createDetail(accountInfo);
        return accountInfo;
    }
}
