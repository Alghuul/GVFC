package com.fr.uha.ensisa.java.restapi.path;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.fr.uha.ensisa.java.restapi.controllers.SegmentManager;
import com.fr.uha.ensisa.java.restapi.model.Segment;

@Path("segement")
public class SegmentResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	 public List<Segment> getIt() {
	        return SegmentManager.getSegments();
	    }
	
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void AddUser(Segment pp) {
    	SegmentManager.createSegment(pp);
    }
    
    @DELETE
   	@Produces(MediaType.APPLICATION_JSON)
       public Response deleteSegment(@QueryParam("id") String id)
       {
       	if(SegmentManager.deleteSegment(Integer.parseInt(id)))
       		return Response.status(Status.CREATED).build();
   		return Response.status(Status.CONFLICT).build();

       }
}
