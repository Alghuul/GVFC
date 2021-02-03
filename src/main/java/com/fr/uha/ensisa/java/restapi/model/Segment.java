
package com.fr.uha.ensisa.java.restapi.model;


import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "segment")
public class Segment  implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "segmentID", unique = true)
	int  segmentID;
	
	@Column(name = "challengeID")
	private int challengeID;
	
	@Column(name = "beginPPointID")
	private int beginPPointID;
	
	@Column(name = "endPPointID") 
	private int endPPointID;
	
	@Column(name = "distance")
	private int distance;
	
	
	
	public Segment() {
		
	}



	public int getSegmentID() {
		return segmentID;
	}



	public void setSegmentID(int segmentID) {
		this.segmentID = segmentID;
	}



	public int getChallengeID() {
		return challengeID;
	}



	public void setChallengeID(int challengeID) {
		this.challengeID = challengeID;
	}



	public int getBeginPPointID() {
		return beginPPointID;
	}



	public void setBeginPPointID(int beginPPointID) {
		this.beginPPointID = beginPPointID;
	}



	public int getEndPPointID() {
		return endPPointID;
	}



	public void setEndPPointID(int endPPointID) {
		this.endPPointID = endPPointID;
	}



	public int getDistance() {
		return distance;
	}



	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	
}


