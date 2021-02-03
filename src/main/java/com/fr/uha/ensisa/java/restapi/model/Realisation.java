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
	@Column(name = "uder_id" , nullable = false)
	private int user_id;
	@Column(name = "ChallengeID", nullable = false)
	private int challengeID;
	@Column(name = "distance", nullable = false)
	private int km;
	@Column(name = "mmode", nullable = false)
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
