package com.fr.uha.ensisa.java.restapi.path;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fr.uha.ensisa.java.restapi.dao.ConnectPassagePoint;

import com.fr.uha.ensisa.java.restapi.model.PassagePoint;


@Path("passagepoint")
public class PassagePointResource {
	ConnectPassagePoint cu = new ConnectPassagePoint();
	   
	@SuppressWarnings("unchecked")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	 public List<PassagePoint> getIt() {
	        return cu.getAll();
	    }
	
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void AddUser(PassagePoint pp) {
        cu.add(pp);
       
    }
}
