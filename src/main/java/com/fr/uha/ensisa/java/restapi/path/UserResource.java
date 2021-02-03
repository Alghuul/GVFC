package com.fr.uha.ensisa.java.restapi.path;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.fr.uha.ensisa.java.restapi.controllers.UserManager;
import com.fr.uha.ensisa.java.restapi.dao.DAOUser;
import com.fr.uha.ensisa.java.restapi.model.User;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class UserResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	 public List<User> getUsers() {
	        return UserManager.getUsers();
	    }
	
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
    public boolean addUser(User user) {
       return UserManager.createUser(user);
       
    }
    
    @DELETE
    @Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
    public boolean deleteUser(@PathParam("id") String id)
    {
    	return UserManager.deleteUser(Integer.parseInt(id));
    }
    
    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void updateUser(@PathParam("id") String id, User user)
    {
    	
    }
    
    
}
