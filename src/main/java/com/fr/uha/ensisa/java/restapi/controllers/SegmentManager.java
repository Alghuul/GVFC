package com.fr.uha.ensisa.java.restapi.controllers;

import java.util.List;

import com.fr.uha.ensisa.java.restapi.dao.DAOSegment;
import com.fr.uha.ensisa.java.restapi.model.Segment;
import com.fr.uha.ensisa.java.restapi.model.Suggestion;
import com.fr.uha.ensisa.java.restapi.model.User;

public class SegmentManager {
	static DAOSegment daoSegment = new DAOSegment();
	
	public static List<Segment> getSegments() {
		List<Segment> lv = daoSegment.getAll();
		return lv;
	}

	public static Segment getSegment(int id) {
		if (id < 0)
			return null;

		Segment u = daoSegment.findByid(id);
		return u;
	}
	
	public static boolean createSegment(Segment Segment) {
		Segment u = daoSegment.findByid(Segment.getSegmentID());
		if (u == null) {
			daoSegment.add(Segment);
			return true;
		}
		return false;
	}

	public static boolean deleteSegment(int SegmentID) {
		Segment s = daoSegment.findByid(SegmentID);
		if (s != null) {
			daoSegment.delete(SegmentID);
			return true;
		}
		return false;		
	}	
	
	public static void putSegment(Segment segment) {
		
		daoSegment.put(segment);
	}

}
