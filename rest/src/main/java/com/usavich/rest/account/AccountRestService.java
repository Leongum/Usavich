package com.usavich.rest.account;

import com.usavich.common.lib.CommonUtils;
import com.usavich.entity.account.*;
import com.usavich.service.account.def.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 3/7/13
 * Time: 2:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class AccountRestService implements AccountRestDef {

    @Autowired
    private AccountService accountService;

    @Override
    public UserInfo getAccountInfo(String userEmail, String password) {
        return accountService.getAccountInfo(userEmail, password);
    }

    @Override
    public UserInfo getAccountInfoByID(String userId) {
        return accountService.getAccountInfoByID(CommonUtils.parseIntegerToNull(userId));
    }

    @Override
    public UserInfo createAccountInfo(UserBase userBase) {
        return accountService.createAccountInfo(userBase);
    }

    @Override
    public void updateAccountBase(String userId, UserBase userBase) {
        userBase.setUserId(CommonUtils.parseIntegerToNull(userId));
        accountService.updateAccountBase(userBase);
    }

    @Override
    public List<UserFriend> getUserFriends(String userId) {
        return accountService.getUserFriends(CommonUtils.parseIntegerToNull(userId));
    }

    @Override
    public void createUserFriendInvite(String userId, UserFriend userFriend) {
        userFriend.setUserId(CommonUtils.parseIntegerToNull(userId));
        accountService.createUserFriendInvite(userFriend);
    }

    @Override
    public void updateUserFriendStatus(String userId, UserFriend userFriend) {
        userFriend.setUserId(CommonUtils.parseIntegerToNull(userId));
        accountService.updateUserFriendStatus(userFriend);
    }

    @Override
    public UserLocation getUserLocation(String userId) {
        return accountService.getUserLocation(CommonUtils.parseIntegerToNull(userId));
    }

    @Override
    public void updateUserLocation(String userId, UserLocation userLocation) {
        userLocation.setUserId(CommonUtils.parseIntegerToNull(userId));
        accountService.updateUserLocation(userLocation);
    }

}
