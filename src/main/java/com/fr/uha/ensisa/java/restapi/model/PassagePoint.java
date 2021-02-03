package com.fr.uha.ensisa.java.restapi.model;

import java.io.Serializable;


import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "passagepoint")
public class PassagePoint implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7714770575023878228L;

	@Id
	@Column(name="passagepointID", unique = true)
	private int passagepointID;
	
	@Column(name = "description" , nullable = false)
	private String description;
	
	public PassagePoint() {
		
	}

	public int getPassagepointID() {
		return passagepointID;
	}

	public void setPassagepointID(int passagepointID) {
		this.passagepointID = passagepointID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}