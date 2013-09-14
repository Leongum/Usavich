package com.usavich.rest.system;

import com.usavich.entity.common.SystemMessage;
import com.usavich.entity.common.VersionControl;
import com.usavich.rest.common.RestDef;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: p
 * Date: 13-9-14
 * Time: 下午2:03
 * To change this template use File | Settings | File Templates.
 */
@Path("/system")
@Consumes({"*/xml", MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public interface SystemRestDef extends RestDef {

    @GET
    @Path("/version/{" + PARAM_PLATFORM + "}")
    VersionControl getVersionControl(
            @PathParam(PARAM_PLATFORM) String platform);

    @GET
    @Path("/message/{" + PARAM_LAST_UPDATE_TIME + "}")
    List<SystemMessage> getSystemMessage(
            @PathParam(PARAM_LAST_UPDATE_TIME) String lastUpdateTime);
}
