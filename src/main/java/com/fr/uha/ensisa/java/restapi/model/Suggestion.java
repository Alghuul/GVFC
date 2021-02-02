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
	

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "suggestionID", unique = true)
	private int suggestionID;
	@Column(name="userID" , nullable = false)
	private String userID;
	//@Column()
	private List<String> voters;
	@Column(name="theme" , nullable = false)
	private String theme;
	@Column(name="isValidated" , nullable = false)
	private Boolean isValidated;
	
	public Suggestion(int suggestionID, String userID, List<String> voters, String theme, Boolean isValidated) {
		this.suggestionID = suggestionID;
		this.userID = userID;
		this.voters = voters;
		this.theme = theme;
		this.isValidated = isValidated;
	}

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

	public Boolean getIsValidated() {
		return isValidated;
	}

	public void setIsValidated(Boolean isValidated) {
		this.isValidated = isValidated;
	}
	
	public List<String> getVoters() {
		return voters;
	}

	public void setVoters(List<String> voters) {
		this.voters = voters;
	}

	
	public void addVoter(User user) {
		this.voters.add(user.getEmail());
	}
	
	public void deleteVoter(User user) {
		this.voters.remove(user.getEmail());
	}
}