package com.usavich.service.account.impl;

import com.usavich.db.account.dao.def.AccountDAO;
import com.usavich.service.account.def.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

import com.usavich.entity.account.*;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 3/6/13
 * Time: 11:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDAO accountDAO;

    @Override
    @Transactional
    public UserInfo getAccountInfo(String userEmail, String password) {
        return accountDAO.getAccountInfo(userEmail, password);
    }

    @Override
    @Transactional
    public UserInfo createAccountInfo(UserBase userBase) {
        return accountDAO.createAccountInfo(userBase);
    }

}
