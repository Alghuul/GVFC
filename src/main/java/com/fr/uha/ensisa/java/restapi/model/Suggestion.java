package com.fr.uha.ensisa.java.restapi.model;

import java.io.Serializable;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "suggestion")
public class Suggestion implements Serializable{


	

	
	private static final long serialVersionUID = -2520286691081019294L;

	@Id
	//@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "suggestionID", unique = true)
	private int suggestionID;
	
	@Column(name="creatorID" , nullable = true)
	private int creatorID;
	
	@Column(name ="voterID" , nullable = true)
	private int voterID;
	
	@Column(name="theme" , nullable = true)
	private String theme;
	
	@Column(name="isValidated" , nullable = true)
	private int isValidated;
	
	

	public Suggestion() {
		
	}



	public int getSuggestionID() {
		return suggestionID;
	}



	public void setSuggestionID(int suggestionID) {
		this.suggestionID = suggestionID;
	}



	public int getCreatorID() {
		return creatorID;
	}



	public void setCreatorID(int creatorID) {
		this.creatorID = creatorID;
	}



	public int getVoterID() {
		return voterID;
	}



	public void setVoterID(int voterID) {
		this.voterID = voterID;
	}



	public String getTheme() {
		return theme;
	}



	public void setTheme(String theme) {
		this.theme = theme;
	}



	public int getIsValidated() {
		return isValidated;
	}



	public void setIsValidated(int isValidated) {
		this.isValidated = isValidated;
	}
	
	
}