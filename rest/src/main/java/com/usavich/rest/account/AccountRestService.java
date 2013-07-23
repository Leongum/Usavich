package com.usavich.rest.account;

import com.usavich.common.lib.CommonUtils;
import com.usavich.common.lib.Universe;
import com.usavich.entity.account.*;
import com.usavich.rest.common.RestUtils;
import com.usavich.service.account.def.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;


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
        UserInfo userInfo = accountService.getAccountInfo(userEmail, password);
        userInfo.setUuid(UUID.randomUUID().toString());
        userInfo.setSystemTime(Universe.current().getSystemTime());
        UserBase userBase = new UserBase();
        userBase.initUserBase(userInfo);
        accountService.updateAccountBase(userBase);
        return  userInfo;
    }

    @Override
    public UserInfo getAccountInfoByID(String userId) {
        return accountService.getAccountInfoByID(CommonUtils.parseIntegerToNull(userId));
    }

    @Override
    public UserInfo createAccountInfo(UserBase userBase) {
        userBase.setUuid(UUID.randomUUID().toString());
        UserInfo userInfo = accountService.createAccountInfo(userBase);
        userInfo.setSystemTime(Universe.current().getSystemTime());
        return  userInfo;
    }

    @Override
    public void updateAccountBase(String userId, UserBase userBase) {
        RestUtils.checkUserId(userId);
        userBase.setUserId(CommonUtils.parseIntegerToNull(userId));
        accountService.updateAccountBase(userBase);
    }

    @Override
    public List<UserFriend> getUserFriends(String userId,String lastUpdateTime) {
        return accountService.getUserFriends(CommonUtils.parseIntegerToNull(userId),CommonUtils.parseDateDefaultToNull(lastUpdateTime));
    }

    @Override
    public void createUserFriendInvite(String userId, UserFriend userFriend) {
        RestUtils.checkUserId(userId);
        userFriend.setUserId(CommonUtils.parseIntegerToNull(userId));
        accountService.createUserFriendInvite(userFriend);
    }

    @Override
    public void updateUserFriendStatus(String userId, UserFriend userFriend) {
        RestUtils.checkUserId(userId);
        userFriend.setUserId(CommonUtils.parseIntegerToNull(userId));
        accountService.updateUserFriendStatus(userFriend);
    }

    @Override
    public UserLocation getUserLocation(String userId) {
        return accountService.getUserLocation(CommonUtils.parseIntegerToNull(userId));
    }

    @Override
    public void updateUserLocation(String userId, UserLocation userLocation) {
        RestUtils.checkUserId(userId);
        userLocation.setUserId(CommonUtils.parseIntegerToNull(userId));
        accountService.updateUserLocation(userLocation);
    }
}
