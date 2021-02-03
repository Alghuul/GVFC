package com.fr.uha.ensisa.java.restapi.model;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fr.uha.ensisa.java.restapi.model.ObstacleType;

@Entity
public class Obstacle implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "obstacleID", unique = true)
	private int obstacleID;
	@Column(name ="type", nullable = false)
	private ObstacleType type;
	@Column(name ="description", nullable = false)
	private String description;
	
	public Obstacle(int obstacleID, ObstacleType type, String description) {
		this.obstacleID = obstacleID;
		this.type = type;
		this.description = description;
	}
	
	public Obstacle() {
		
	}

	public int getObstacleId() {
		return obstacleID;
	}

	public void ObstacleId(int obstacleID) {
		this.obstacleID = obstacleID;
	}

	public ObstacleType getType() {
		return type;
	}

	public void setType(ObstacleType type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}