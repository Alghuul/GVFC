package com.fr.uha.ensisa.java.restapi.path;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.fr.uha.ensisa.java.restapi.controllers.PassagePointManager;
import com.fr.uha.ensisa.java.restapi.controllers.UserManager;
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
    public void AddUser(PassagePoint pp) {
    	PassagePointManager.createPassagePoint(pp);
    }
    
    @DELETE
   	@Produces(MediaType.APPLICATION_JSON)
       public Response deletePassagePoint(@QueryParam("id") String id)
       {
       	if(PassagePointManager.deletePassagePoint(Integer.parseInt(id)))
       		return Response.status(Status.CREATED).build();
   		return Response.status(Status.CONFLICT).build();

       }
    
    
}