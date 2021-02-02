package com.fr.uha.ensisa.java.restapi.model;


import java.util.List;
import java.util.Map;

import javax.persistence.Id;

public class Segment {

	
	@Id
	private String challengeID;
	
	
	private PassagePoint beginPPoint;
	private PassagePoint endPPoint;
	private Map<Obstacle, Integer> obstacles ;
	private int km;

	
	//addObstacle
}
