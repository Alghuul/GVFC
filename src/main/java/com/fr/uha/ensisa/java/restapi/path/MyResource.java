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
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	 public List<User> getIt() {
	        return ConnectUser.getAllUsers();
	    }
	
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void AddUser(User user) {
        ConnectUser.addUser(user);
       
    }
}
