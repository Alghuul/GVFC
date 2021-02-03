package com.fr.uha.ensisa.java.restapi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "suggestion")
public class Suggestion implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "suggestionID", unique = true)
	private int suggestionID;
	@Column(name="userID" , nullable = false)
	private String userID;
	@Column(name="theme" , nullable = false)
	private String theme;
	@Column(name="isValidated", nullable = true)
	private boolean isValidated;

	public Suggestion() {
		
	}
	
	public int getSuggestionID() {
		return suggestionID;
	}

	public void setSuggestionID(int suggestionID) {
		this.suggestionID = suggestionID;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public boolean getIsValidated() {
		return isValidated;
	}

	public void setIsValidated(boolean isValidated) {
		this.isValidated = isValidated;
	}

}