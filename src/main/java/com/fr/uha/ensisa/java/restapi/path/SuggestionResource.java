package com.fr.uha.ensisa.java.restapi.path;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.fr.uha.ensisa.java.restapi.controllers.SegmentManager;
import com.fr.uha.ensisa.java.restapi.controllers.SuggestionManager;
import com.fr.uha.ensisa.java.restapi.model.Segment;
import com.fr.uha.ensisa.java.restapi.model.Suggestion;

@Path("suggestion")
public class SuggestionResource {
	    @GET
	    @Produces(MediaType.APPLICATION_JSON)
	     public List<Suggestion> getSuggestions() {
	            return SuggestionManager.getSuggestions();
	        }

	    @POST
	    @Consumes(MediaType.APPLICATION_JSON)
	    @Produces(MediaType.APPLICATION_JSON)
	    public boolean addSuggestion(Suggestion suggestion) {
	       return SuggestionManager.createSuggestion(suggestion);

	    }

	    @DELETE
	    @Produces(MediaType.APPLICATION_JSON)
	    public boolean deleteSuggestion(@QueryParam("id") String id)
	    {
	        return SuggestionManager.deleteSuggestion(Integer.parseInt(id));
	    }
	    
	    @PUT
	    @Consumes(MediaType.APPLICATION_JSON)
	    public void updateUser(Suggestion challenge)
	    {
	    		SuggestionManager.putSuggestion(challenge);
	    }


}
