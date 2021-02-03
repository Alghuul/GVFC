package com.fr.uha.ensisa.java.restapi.controllers;

import java.util.List;

import com.fr.uha.ensisa.java.restapi.dao.DAORealisation;
import com.fr.uha.ensisa.java.restapi.model.Realisation;

public class RealisationManager {
	static DAORealisation daoRealisation = new DAORealisation();
	
	public static List<Realisation> getRealisations() {
		List<Realisation> lr = daoRealisation.getAll();
		return lr;
	}

	public static Realisation getRealisation(int id) {
		Realisation r = daoRealisation.findByid(id);
		return r;
	}
	
	public static boolean createRealisation(Realisation realisation) {
		//Realisation r = daoRealisation.findByid(s.getRealisationID());
		//if (r == null) {
			daoRealisation.add(realisation);
			return true;
		//}
		//return false;
	}
	
	public static boolean deleteRealisation(int RealisationID) {
		Realisation r = daoRealisation.findByid(RealisationID);
		if (r == null) {
			daoRealisation.delete(RealisationID);
			return true;
		}
		return false;		
	}

}
