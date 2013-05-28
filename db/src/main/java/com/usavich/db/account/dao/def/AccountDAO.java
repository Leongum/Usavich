package com.usavich.db.account.dao.def;


import com.usavich.entity.account.model.*;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 3/5/13
 * Time: 5:01 PM
 * To change this template use File | Settings | File Templates.
 */
public interface AccountDAO {

    public UserInfo getAccountInfo(String userEmail, String password);

    public UserInfo createAccountInfo(UserBase userBase);
}
