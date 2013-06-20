package com.usavich.rest.mission;

import com.usavich.entity.mission.*;
import com.usavich.entity.mission.rest.*;
import com.usavich.rest.common.RestDef;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 6/19/13
 * Time: 8:11 PM
 * To change this template use File | Settings | File Templates.
 */
@Path("/missions")
@Consumes({"*/xml", MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public interface MissionRestDef extends RestDef {

    @GET
    @Path("/mission")
    List<Mission> getMissions(
            @QueryParam(PARAM_MISSION_ID) String missionId,
            @QueryParam(PARAM_MIN_ID) String minId,
            @QueryParam(PARAM_LAST_UPDATE_TIME) String lastUpdateTime);

    @GET
    @Path("/package")
    List<MissionPackageRest> getMissionPackages(
            @QueryParam(PARAM_PACKAGE_ID) String packageId,
            @QueryParam(PARAM_MIN_ID) String minId,
            @QueryParam(PARAM_LAST_UPDATE_TIME) String lastUpdateTime);

    @GET
    @Path("/place")
    List<MissionPlacePackage> getMissionPlacePackages(
            @QueryParam(PARAM_PACKAGE_ID) String packageId);

}
