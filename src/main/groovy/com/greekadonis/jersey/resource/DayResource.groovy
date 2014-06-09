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
    public int[] findAll() {
        findAllDays().collect { Day day ->
            day.id
        }
    }

    public List<Day> findAllDays() {
        [new Day(id: 1), new Day(id: 2), new Day(id: 3)]
    }
}
