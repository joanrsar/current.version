/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.co.myticket.servicios;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author joanrincon
 */
@Path("/ws")
public class WsTiquetesResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of WsTiquetesResource
     */
    public WsTiquetesResource() {
    }

    /**
     * Retrieves representation of an instance of com.co.myticket.servicios.WsTiquetesResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * POST method for creating an instance of WsTiqueteResource
     * @param content representation for the new resource
     * @return an HTTP response with content of the created resource
     */
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Response postJson(String content) {
        //TODO
        return Response.created(context.getAbsolutePath()).build();
    }

    /**
     * Sub-resource locator method for {id}
     */
    @Path("{id}")
    public WsTiqueteResource getWsTiqueteResource(@PathParam("id") String id) {
        return WsTiqueteResource.getInstance(id);
    }
}
