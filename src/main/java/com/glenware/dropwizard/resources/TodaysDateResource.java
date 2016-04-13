package com.glenware.dropwizard.resources;

import org.joda.time.DateTime;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/todaysdate")
@Produces(MediaType.APPLICATION_JSON)
public class TodaysDateResource {
	@GET
	public String todaysDate() {
        return "{\"todaysdate\": " + new DateTime().toString("dd/MM/yyyy") + "}";
	}
}