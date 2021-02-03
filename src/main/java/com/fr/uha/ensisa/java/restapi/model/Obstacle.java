package com.fr.uha.ensisa.java.restapi.model;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table( name = "obstacle")
public class Obstacle implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "obstacleID", unique = true)
	private int obstacleID;
	
	@Column(name ="pos", nullable = false)
	private int pos;
	
	@Column(name ="segementID", nullable = false)
	private int segementID;
	
	@Column(name ="type", nullable = false)
	private String type;
	
	@Column(name ="description", nullable = false)
	private String description;
	
	public Obstacle() {
		
	}

	public int getObstacleID() {
		return obstacleID;
	}

	public void setObstacleID(int obstacleID) {
		this.obstacleID = obstacleID;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public int getSegementID() {
		return segementID;
	}

	public void setSegementID(int segementID) {
		this.segementID = segementID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}