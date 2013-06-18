package com.usavich.service.account.impl;

import com.usavich.common.exception.*;
import com.usavich.db.account.dao.def.AccountDAO;
import com.usavich.service.account.def.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

import com.usavich.entity.account.*;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    public UserInfo getAccountInfo(String userEmail, String password){
        UserInfo userInfo = accountDAO.getAccountInfo(userEmail, password);
        if(userInfo == null || userInfo.getUserId() == null){
            throw new RuntimeException(String.valueOf(ErrorMessageMapper.USER_NOT_FOUND.ordinal()));
        }
        return  userInfo;
    }

    @Override
    @Transactional
    public UserInfo createAccountInfo(UserBase userBase) {
        return accountDAO.createAccountInfo(userBase);
    }

    @Override
    public UserInfo getAccountInfoByID(Integer userId) {
        return accountDAO.getAccountInfoByID(userId);
    }

    @Override
    public List<UserFriend> getUserFriends(Integer userId) {
        return accountDAO.getUserFriends(userId);
    }

    @Override
    @Transactional
    public UserInfo updateAccountInfo(UserInfo userInfo) {
        return accountDAO.updateAccountInfo(userInfo);
    }

    @Override
    @Transactional
    public UserInfo updateAccountBase(UserBase userBase) {
        return accountDAO.updateAccountBase(userBase);
    }

    @Override
    @Transactional
    public void createUserFriendInvite(UserFriend userFriend) {
        accountDAO.createUserFriendInvite(userFriend);
    }

    @Override
    @Transactional
    public void updateUserFriendStatus(UserFriend userFriend) {
        accountDAO.updateUserFriendStatus(userFriend);
    }

    @Override
    public UserLocation getUserLocation(Integer userId) {
        return accountDAO.getUserLocation(userId);
    }

    @Override
    @Transactional
    public void updateUserLocation(UserLocation userLocation) {
        accountDAO.updateUserLocation(userLocation);
    }

    @Override
    public List<UserLocation> getUserLocations() {
        return accountDAO.getUserLocations();
    }
}
