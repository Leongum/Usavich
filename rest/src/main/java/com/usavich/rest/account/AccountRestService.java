package com.usavich.rest.account;

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
        return accountService.getAccountInfoByID(Integer.getInteger(userId));
    }

    @Override
    public UserInfo createAccountInfo(UserBase userBase) {
        return accountService.createAccountInfo(userBase);
    }

    @Override
    public UserInfo updateAccountBase(UserBase userBase) {
        return accountService.updateAccountBase(userBase);
    }

    @Override
    public List<UserFriend> getUserFriends(String userId) {
        return accountService.getUserFriends(Integer.getInteger(userId));
    }

    @Override
    public void createUserFriendInvite(UserFriend userFriend) {
        accountService.createUserFriendInvite(userFriend);
    }

    @Override
    public void updateUserFriendStatus(UserFriend userFriend) {
        accountService.updateUserFriendStatus(userFriend);
    }

    @Override
    public UserLocation getUserLocation(String userId) {
        return accountService.getUserLocation(Integer.getInteger(userId));
    }

    @Override
    public void updateUserLocation(UserLocation userLocation) {
        accountService.updateUserLocation(userLocation);
    }


}
