package com.fr.uha.ensisa.java.restapi.path;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.fr.uha.ensisa.java.restapi.controllers.SuggestionManager;
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


//	    @POST
//	    @Path("/vote")
//	    @Produces(MediaType.APPLICATION_JSON)
//	    public boolean addVoter(@QueryParam("userid") String userid,@QueryParam("suggestionid") String suggestionid) {
//	        return SuggestionManager.addVoter(Integer.parseInt(userid), Integer.parseInt(suggestionid));
//
//	     }
}
