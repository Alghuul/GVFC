package com.fr.uha.ensisa.java.restapi.path;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.fr.uha.ensisa.java.restapi.controllers.UserManager;
import com.fr.uha.ensisa.java.restapi.model.User;


@Path("myresource")
public class UserResource {

	@SuppressWarnings("unchecked")

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	 public List<User> getUsers() {
	        return UserManager.getUsers();
	    }
	
	@POST
	@Path("/signin")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response signin(@QueryParam("login") String login, @QueryParam("password") String password)
	{
		User u = UserManager.login(login, password);
		if (u != null)
			return Response.status(Status.ACCEPTED).build();
		return Response.status(Status.NOT_FOUND).build();
	}
	
	
	
    @POST
    @Path("/signup")
    @Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
    public boolean addUser(User user) {
       return UserManager.createUser(user);
    }
    
    
    
    @DELETE
    @Path("/delete")
	@Produces(MediaType.APPLICATION_JSON)
    public Response deleteUser(@QueryParam("id") String id)
    {
    	if(UserManager.deleteUser(Integer.parseInt(id)))
    		return Response.status(Status.CREATED).build();
		return Response.status(Status.CONFLICT).build();

    }
    
    @PUT
    @Path("/put")
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateUser(User user)
    {
    		UserManager.putUser(user);
    }

}
