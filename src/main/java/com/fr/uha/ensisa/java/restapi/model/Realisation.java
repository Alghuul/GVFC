package com.fr.uha.ensisa.java.restapi.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.xml.xsom.impl.scd.Iterators.Map;

@Entity
public class Realisation implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "realisationID", unique = true)
	private int realisationID;
	@Column(name = "userID" , nullable = false)
	private int userID;
	@Column(name = "ChallengeID", nullable = false)
	private int challengeID;
	//@Column()
	private HashMap<Integer/*idSegement*/, String> segmentDateRealisation; // tempsDeRealisationParSegment ;
	@Column(name = "endTime", nullable =false)
	private Date endTime;
	@Column(name ="realisationObstacle", nullable = false)
	private HashMap<Integer /*ObstacleID*/, Boolean /* verif realisation obstacle*/> realisationObstacle;
	@Column(name = "endTime", nullable = false)
	private long km;
	@Column(name = "mouvementMode", nullable = false)
	private MovementMode movementMode;
	
	public Realisation(int realisationID, int userID, int challengeID, Map<Integer, Date> segmentDateRealisation,
			Date endTime, Map<Integer, Boolean> realisationObstacle, long km, MovementMode movementMode) {
		this.realisationID = realisationID;
		this.userID = userID;
		this.challengeID = challengeID;
		this.segmentDateRealisation = new HashMap<Integer,String>();
		this.endTime = endTime;
		this.realisationObstacle = new HashMap<Integer, Boolean>();
		this.km = km;
		this.movementMode = movementMode;
	}
	
	public Realisation() {
		
	}
	
	public int getRealisationID() {
		return realisationID;
	}
	
	public void setRealisationID(int realisationID) {
		this.realisationID = realisationID;
	}
	
	public int getUserID() {
		return userID;
	}
	
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	public int getChallengeID() {
		return challengeID;
	}
	
	public void setChallengeID(int challengeID) {
		this.challengeID = challengeID;
	}
	
	public Map<Integer, Date> getSegmentDateRealisation() {
		return null;//segmentDateRealisation;
	}
	
	public void setSegmentDateRealisation(Map<Integer, Date> segmentDateRealisation) {
		//this.segmentDateRealisation = segmentDateRealisation;
	}
	
	public Date getEndTime() {
		return endTime;
	}
	
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	public HashMap<Integer, Boolean> getRealisationObstacle() {
		return realisationObstacle;
	}
	
	public void setRealisationObstacle(HashMap<Integer, Boolean> realisationObstacle) {
		this.realisationObstacle = realisationObstacle;
	}
	
	public long getKm() {
		return km;
	}
	
	public void setKm(long km) {
		this.km = km;
	}
	
	public MovementMode getMovementMode() {
		return movementMode;
	}
	
	public void setMovementMode(MovementMode movementMode) {
		this.movementMode = movementMode;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public void addSegment(Integer s , Date d) {
		this.segmentDateRealisation.put(s, d.toString());
	}
	
	public void addObstacle(Integer o) {
		realisationObstacle.put(o , false);
	}
	
	public void deleteObstacle(Integer o) {
		realisationObstacle.remove(o);
	}
	
	public boolean verifObstacle(Segment s) {
		boolean resultVerifExistenceObstacle = true;
		boolean resultVerifRealisationObstacle = true;
		boolean finalResult = (Boolean) true;
		for (Integer i : this.segmentDateRealisation.keySet()) {
			Integer segmentID = Integer.valueOf(s.getSegmentID());
			if(segmentID ==  i) {
				for(Integer o : s.getObstacles().keySet()) {
					if(realisationObstacle.containsKey(o)){
						resultVerifExistenceObstacle = true;
					}else {
						resultVerifExistenceObstacle = false;
					}
				}
			}
		}
		for(Boolean realisee  : realisationObstacle.values()) {
			if(realisee == false) {
				resultVerifRealisationObstacle = false;
			}
		}
		if( resultVerifExistenceObstacle != true || resultVerifRealisationObstacle != true) {
			finalResult = false;
		}
		return finalResult;
	}


}
