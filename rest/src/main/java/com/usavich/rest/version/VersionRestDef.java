package com.usavich.rest.version;

import com.usavich.entity.common.*;
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
// The Java class will be hosted at the URI path "/version"
@Path("/version")
@Consumes({"*/xml", MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public interface VersionRestDef extends RestDef {

    @GET
    @Path("/{" + PARAM_PLATFORM + "}")
    VersionControl getVersionControl(
            @PathParam(PARAM_PLATFORM) String platform);
}
