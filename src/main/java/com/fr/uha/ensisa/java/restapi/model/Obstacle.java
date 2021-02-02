package com.fr.uha.ensisa.java.restapi.model;

import javax.persistence.*;

@Entity
public class Obstacle {

	@Id
	private int id;
	
	private ObstacleType type;
	private String description;
	
}
