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

import com.fr.uha.ensisa.java.restapi.controllers.ObstacleManager;
import com.fr.uha.ensisa.java.restapi.controllers.UserManager;
import com.fr.uha.ensisa.java.restapi.model.Obstacle;
import com.fr.uha.ensisa.java.restapi.model.User;

public class ObstacleRessource {
	
	@Path("obstacle")
	public class UserResource {

		@SuppressWarnings("unchecked")

		@GET
		@Produces(MediaType.APPLICATION_JSON)
		 public List<Obstacle> getObstacles() {
		        return ObstacleManager.getObstacles();
		    }
		
	    @POST
	    @Consumes(MediaType.APPLICATION_JSON)
		  @Produces(MediaType.APPLICATION_JSON)
	    public boolean addObstacle(Obstacle obstacle) {
	       return ObstacleManager.createObstacle(obstacle);
	       
	    }
	    
	    @DELETE
		@Produces(MediaType.APPLICATION_JSON)
	    public Response deleteObstacle(@QueryParam("id") String id)
	    {
	    	if(ObstacleManager.deleteObstacle(Integer.parseInt(id)))
	    		return Response.status(Status.CREATED).build();
			return Response.status(Status.CONFLICT).build();

	    }
	    
//	    @PUT
//	    @Consumes(MediaType.APPLICATION_JSON)
//	    public void updateObstacle(Obstacle obstacle)
//	    {
//	    	ObstacleManager.putObstacle(obstacle);
//	    }

	}


}
