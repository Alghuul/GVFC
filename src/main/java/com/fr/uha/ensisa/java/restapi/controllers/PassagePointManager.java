package com.fr.uha.ensisa.java.restapi.controllers;

import java.util.List;

import com.fr.uha.ensisa.java.restapi.dao.DAOPassagePoint;
import com.fr.uha.ensisa.java.restapi.model.PassagePoint;
import com.fr.uha.ensisa.java.restapi.model.User;

public class PassagePointManager {
	static DAOPassagePoint daoPassagePoint = new DAOPassagePoint();
	
	public static List<PassagePoint> getPassagePoints() {
		List<PassagePoint> lpp = daoPassagePoint.getAll();
		return lpp;
	}

	public static PassagePoint getPassagePoint(int id) {

		PassagePoint pp = daoPassagePoint.findByid(id);
		return pp;
	}
	
	public static boolean createPassagePoint(PassagePoint pp) {
		PassagePoint p = daoPassagePoint.findByid(pp.getPassagepointID());
		if (p == null) {
			daoPassagePoint.add(pp);
			return true;
		}
		return false;
	}
	
	public static boolean deletePassagePoint(int ppID) {
		PassagePoint pp = daoPassagePoint.findByid(ppID);
		if (pp != null) {
			daoPassagePoint.delete(ppID);
			return true;
		}
		return false;		
	}

	public static void putPp(PassagePoint r) {
			daoPassagePoint.put(r);
		}
	
	

}
