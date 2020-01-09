package com.learning;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/pay")
public interface IPayRestService {

    @GET
    @Path("/{info}")
    String pay(@PathParam("info") String info);
}
