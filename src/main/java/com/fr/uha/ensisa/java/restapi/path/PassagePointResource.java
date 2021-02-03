package com.fr.uha.ensisa.java.restapi.path;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fr.uha.ensisa.java.restapi.controllers.PassagePointManager;

import com.fr.uha.ensisa.java.restapi.model.PassagePoint;


@Path("passagepoint")
public class PassagePointResource {
	   
	@SuppressWarnings("unchecked")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	 public List<PassagePoint> getIt() {
	        return PassagePointManager.getPassagePoints();
	    }
	
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
    public boolean AddUser(PassagePoint pp) {
    	return PassagePointManager.createPassagePoint(pp);
    }
    
    
}
