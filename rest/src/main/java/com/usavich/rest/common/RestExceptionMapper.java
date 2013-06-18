package com.usavich.rest.common;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created with IntelliJ IDEA.
 * User: LeonLu
 * Date: 6/18/13
 * Time: 4:26 PM
 * To change this template use File | Settings | File Templates.
 */
@Provider
public class RestExceptionMapper implements ExceptionMapper {

    public class InvalidRequestMessage {
        private String message;

        public InvalidRequestMessage(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

    public Response toResponse(Throwable ex) {
        StackTraceElement[] trace = new StackTraceElement[1];
        trace[0] = ex.getStackTrace()[0];
        ex.setStackTrace(trace);
        Response.ResponseBuilder rb = Response.status(Response.Status.INTERNAL_SERVER_ERROR);
        rb.type("application/json;charset=UTF-8");
        InvalidRequestMessage entity = new InvalidRequestMessage(ex.getMessage());
        rb.entity(entity);
        return rb.build();
    }
}
