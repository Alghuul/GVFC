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

import com.fr.uha.ensisa.java.restapi.controllers.ChallengeManager;
import com.fr.uha.ensisa.java.restapi.controllers.UserManager;
import com.fr.uha.ensisa.java.restapi.model.Challenge;
import com.fr.uha.ensisa.java.restapi.model.User;

@Path("challenge")
public class ChallengeRessource {
	@SuppressWarnings("unchecked")

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	 public List<Challenge> getChallenges() {
	        return ChallengeManager.getChallenges();
	    }
	
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
	  @Produces(MediaType.APPLICATION_JSON)
    public boolean addChallenge(Challenge challenge) {
       return ChallengeManager.createChallenge(challenge);
       
    }
    
    @DELETE
	@Produces(MediaType.APPLICATION_JSON)
    public Response deleteChallenge(@QueryParam("id") String id)
    {
    	if(ChallengeManager.deleteChallenge(Integer.parseInt(id)))
    		return Response.status(Status.CREATED).build();
		return Response.status(Status.CONFLICT).build();

    }
   
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateUser(Challenge challenge)
    {
    		ChallengeManager.putChallenge(challenge);
    }

}
