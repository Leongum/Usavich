package com.usavich.db.account.dao.def;


import com.usavich.entity.account.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 3/5/13
 * Time: 5:01 PM
 * To change this template use File | Settings | File Templates.
 */
public interface AccountDAO {

    public UserInfo getAccountInfo(String userEmail, String password);

    public UserInfo getAccountInfoByMail(String userEmail);

    public UserInfo getAccountInfoByID(Integer userId);

    public UserInfo updateAccountInfo(UserInfo userInfo);

    public void updateAccountBase(UserBase userBase);

    public UserInfo createAccountInfo(UserBase userBase);

    public List<UserFriend> getUserFriends(Integer userId);

    public UserFriend getUserFriend(Integer userId, Integer friendId);

    public void createUserFriendInvite(UserFriend userFriend);

    public void updateUserFriendStatus(UserFriend userFriend);

    public UserLocation getUserLocation(Integer userId);

    public void createUserLocation(UserLocation userLocation);

    public void updateUserLocation(UserLocation userLocation);

    public List<UserLocation> getUserLocations();
}
