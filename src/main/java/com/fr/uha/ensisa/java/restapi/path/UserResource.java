package com.fr.uha.ensisa.java.restapi.path;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.fr.uha.ensisa.java.restapi.dao.ConnectPassagePoint;
import com.fr.uha.ensisa.java.restapi.dao.ConnectUser;
<<<<<<< HEAD:src/main/java/com/fr/uha/ensisa/java/restapi/path/MyResource.java
import com.fr.uha.ensisa.java.restapi.model.PassagePoint;
=======
import com.fr.uha.ensisa.java.restapi.dao.DAOAbstractFacade;
>>>>>>> c97d8f2ffb4c683e9d53139442be16642e205774:src/main/java/com/fr/uha/ensisa/java/restapi/path/UserResource.java
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
	 public List<User> getIt() {
	        return cu.getAll();
	    }
	
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void AddUser(User user) {
        cu.add(user);
       
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<PassagePoint> getAllPassagePoint(){
    	return ConnectPassagePoint.getAllPassagePoints();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addPassagePoint(PassagePoint pp) {
    	ConnectPassagePoint.addPassagePoint(pp);
    }
}
