package com.fr.uha.ensisa.java.restapi.path;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.fr.uha.ensisa.java.restapi.dao.ConnectUser;
import com.fr.uha.ensisa.java.restapi.model.User;



@Path("myresource")
public class UserResource {

	ConnectUser cu = new ConnectUser();
    
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
    public void deleteUser(@QueryParam("id") String id)
    {
    	cu.delete(Integer.parseInt(id));
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateUser(User user)
    {
    		cu.put(user);
    }
    	
    
    
}
