package com.greekadonis.jersey.resource

import com.greekadonis.jersey.domain.Day
import org.json.JSONArray

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("day")
class DayResource {
    @GET
    //@Path("/")
   @Produces(MediaType.APPLICATION_JSON)
    public JSONArray findAll() {
        new JSONArray([new Day(id: 1).id, new Day(id: 2).id, new Day(id: 3).id])
    }
}
