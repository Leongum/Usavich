package com.usavich.rest.account;

import com.usavich.entity.account.*;
import com.usavich.rest.common.RestDef;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 3/7/13
 * Time: 2:02 PM
 * To change this template use File | Settings | File Templates.
 */
// The Java class will be hosted at the URI path "/account"
@Path("/account")
@Consumes({"*/xml", MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public interface AccountRestDef extends RestDef {

    @GET
    @Path("/{" + PARAM_USER_EMAIL + "}/{" + PARAM_PASSWORD + "}")
    UserInfo getAccountInfo(
            @PathParam(PARAM_USER_EMAIL) String userEmail,
            @PathParam(PARAM_PASSWORD) String password);

    @GET
    @Path("/{" + PARAM_USER_ID + "}")
    UserInfo getAccountInfoByID(
            @PathParam(PARAM_USER_ID) String userId);

    @POST
    @Path("/")
    UserInfo createAccountInfo(UserBase userBase);

    @PUT
    @Path("/{" + PARAM_USER_ID + "}")
    UserInfo updateAccountBase(UserBase userBase);

    @GET
    @Path("/friends/{" + PARAM_USER_ID + "}")
    List<UserFriend> getUserFriends(
            @PathParam(PARAM_USER_ID) String userId);


    @POST
    @Path("/friends/")
    void createUserFriendInvite(UserFriend userFriend);


    @PUT
    @Path("/friends/")
    void updateUserFriendStatus(UserFriend userFriend);


    @GET
    @Path("/location/{" + PARAM_USER_ID + "}")
    UserLocation getUserLocation(
            @PathParam(PARAM_USER_ID) String userId);

    @PUT
    @Path("/location/{" + PARAM_USER_ID + "}")
    void updateUserLocation(UserLocation userLocation);

}
