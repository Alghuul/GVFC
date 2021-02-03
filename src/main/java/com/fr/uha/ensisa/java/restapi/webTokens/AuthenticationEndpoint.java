package com.fr.uha.ensisa.java.restapi.webTokens;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fr.uha.ensisa.java.restapi.controllers.UserManager;
import com.fr.uha.ensisa.java.restapi.model.User;

import jakarta.ws.rs.Produces;

@Path("/authentication")
public class AuthenticationEndpoint {
	
	private UserManager useManager = new UserManager(); 
	
	@POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response authenticateUser(User user) {
		
		String email = user.getEmail();
		String password = user.getPassword();

        try {

            // Authenticate the user using the credentials provided
            authenticate(email, password);

            // Issue a token for the user
            String token = issueToken(email);

            // Return the token on the response
            return Response.ok(token).build();

        } catch (Exception e) {
            return Response.status(Response.Status.FORBIDDEN).build();
        }      
    }

    private void authenticate(String email, String password) throws Exception {
    	useManager.login(email, password);
        // Authenticate against a database, LDAP, file or whatever
        // Throw an Exception if the credentials are invalid
    }

    private String issueToken(String email) {
    	String result = null ;
    	if (useManager.getUser(email) != null) {
    		result = email;
    	}
    	return result;
        // Issue a token (can be a random String persisted to a database or a JWT token)
        // The issued token must be associated to a user
        // Return the issued token
    }

}
