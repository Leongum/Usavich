package com.usavich.rest.product;

import com.usavich.entity.product.Product;
import com.usavich.rest.common.RestDef;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 6/21/13
 * Time: 6:29 PM
 * To change this template use File | Settings | File Templates.
 */
@Path("/missions")
@Consumes({"*/xml", MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public interface ProductRestDef extends RestDef{

    @GET
    @Path("/mission")
    List<Product> getProducts(
            @QueryParam(PARAM_PRODUCT_ID) String productId,
            @QueryParam(PARAM_MIN_ID) String minId,
            @QueryParam(PARAM_LAST_UPDATE_TIME) String lastUpdateTime);
}
