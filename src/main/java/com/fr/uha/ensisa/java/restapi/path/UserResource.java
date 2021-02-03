package com.fr.uha.ensisa.java.restapi.path;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.fr.uha.ensisa.java.restapi.dao.ConnectUser;
import com.fr.uha.ensisa.java.restapi.model.User;




/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class UserResource {

	ConnectUser cu = new ConnectUser();
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	@SuppressWarnings("unchecked")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	 public List<User> getUsers() {
	        return cu.getAll();
	    }
	
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addUser(User user) {
        cu.add(user);
       
    }
    
    @DELETE
    @Path("{id}")
    public void deleteUser(@PathParam("id") String id)
    {
    	cu.delete(Integer.parseInt(id));
    }
    
    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void updateUser(@PathParam("id") String id, User user)
    {
    	
    }
    
    
}
