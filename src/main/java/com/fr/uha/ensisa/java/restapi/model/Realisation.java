package com.fr.uha.ensisa.java.restapi.model;

import java.io.Serializable;


import javax.persistence.*;


@Entity
@Table(name="realisation")
public class Realisation implements Serializable {

	private static final long serialVersionUID = -2153603343570801445L;


	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "realisationID", unique = true)
	private int realisationID;
	@Column(name = "user_id" , nullable = true)
	private int user_id;
	@Column(name = "challengeID", nullable = true)
	private int challengeID;
	@Column(name = "distance", nullable = true)
	private int km;
	@Column(name = "mmode", nullable = true)
	private String mmode;
	
	public Realisation() {
		
	}
	public int getRealisationID() {
		return realisationID;
	}

	public void setRealisationID(int realisationID) {
		this.realisationID = realisationID;
	}

	public int getUserID() {
		return user_id;
	}

	public void setUserID(int userID) {
		this.user_id = userID;
	}

	public int getChallengeID() {
		return challengeID;
	}

	public void setChallengeID(int challengeID) {
		this.challengeID = challengeID;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public String getMmode() {
		return mmode;
	}

	public void setMmode(String mmode) {
		this.mmode = mmode;
	}

	

	

}
