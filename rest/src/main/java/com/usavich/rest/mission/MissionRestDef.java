package com.usavich.rest.mission;

import com.usavich.entity.mission.*;
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
public interface MissionRestDef extends RestDef{

    @GET
    @Path("/mission")
    Mission getMissionById(
            @QueryParam(PARAM_MISSION_ID) String missionId);

    @GET
    @Path("/mission")
    List<Mission> getMissionListByMinId(
            @QueryParam(PARAM_MISSION_MIN_ID) String missionMinId);

    @GET
    @Path("/mission")
    List<Mission> getMissionListByTime(
            @QueryParam(PARAM_LAST_UPDATE_TIME) String lastUpdateTime);

    @GET
    @Path("/package")
    MissionPackage getMissionPackageListById(
            @QueryParam(PARAM_MISSION_PACKAGE_ID) String missionPackageId);

    @GET
    @Path("/package")
    List<MissionPackage> getMissionPackageListByMinId(
            @QueryParam(PARAM_MISSION_MIN_PACKAGE_ID) String missionPackageMinId);

    @GET
    @Path("/package")
    List<MissionPackage> getMissionPackageListByTime(
            @QueryParam(PARAM_LAST_UPDATE_TIME) String lastUpdateTime);

    @GET
    @Path("/placepackage")
    List<MissionPlacePackage> getMissionPlacePackage(
            @QueryParam(PARAM_MISSION_PLACE_PACKAGE_ID) String missionPlacePackageId);

}
