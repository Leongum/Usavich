package com.usavich.rest.account;

import com.usavich.entity.account.*;
import com.usavich.rest.common.RestDef;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

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

    @POST
    @Path("/")
    UserInfo createAccountInfo(UserBase userBase);
}
