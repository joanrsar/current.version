/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.co.myticket.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;

/**
 * REST Web Service
 *
 * @author joanrincon
 */
public class WsTiqueteResource {

    private String id;

    /**
     * Creates a new instance of WsTiqueteResource
     */
    private WsTiqueteResource(String id) {
        this.id = id;
    }

    /**
     * Get instance of the WsTiqueteResource
     */
    public static WsTiqueteResource getInstance(String id) {
        // The user may use some kind of persistence mechanism
        // to store and restore instances of WsTiqueteResource class.
        return new WsTiqueteResource(id);
    }

    /**
     * Retrieves representation of an instance of com.co.myticket.servicios.WsTiqueteResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of WsTiqueteResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }

    /**
     * DELETE method for resource WsTiqueteResource
     */
    @DELETE
    public void delete() {
    }
}
