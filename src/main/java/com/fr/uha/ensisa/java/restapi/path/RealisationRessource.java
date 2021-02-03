package com.fr.uha.ensisa.java.restapi.path;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.fr.uha.ensisa.java.restapi.controllers.RealisationManager;
import com.fr.uha.ensisa.java.restapi.controllers.UserManager;
import com.fr.uha.ensisa.java.restapi.model.Realisation;
import com.fr.uha.ensisa.java.restapi.model.User;

@Path("realisation")
public class RealisationRessource {
	@SuppressWarnings("unchecked")

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	 public List<Realisation> getRealisations() {
	        return RealisationManager.getRealisations();
	    }
	
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
	  @Produces(MediaType.APPLICATION_JSON)
    public boolean addRealisation(Realisation realisation) {
       return RealisationManager.createRealisation(realisation);
       
    }
    
    @DELETE
	@Produces(MediaType.APPLICATION_JSON)
    public Response deleteRealisation(@QueryParam("id") String id)
    {
    	if(RealisationManager.deleteRealisation(Integer.parseInt(id)))
    		return Response.status(Status.CREATED).build();
		return Response.status(Status.CONFLICT).build();

    }
    
//    @PUT
//    @Consumes(MediaType.APPLICATION_JSON)
//    public void updateUser(User user)
//    {
//    		UserManager.putUser(user);
//    }

}
