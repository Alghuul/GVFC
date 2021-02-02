
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


//@Entity
//@Table(name = "segment")
public class Segment  implements Serializable{
/*	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "segmentID", unique = true)
	int  segmentID;
	@Column(name = "challengeID")
	private int challengeID;
	@Column(name = "beginPPoint")
	private PassagePoint beginPPoint;
	@Column(name = "endPPoint") 
	private PassagePoint endPPoint;
	private Map<Integer, Integer> obstacles ;
	@Column(name = "km")
	private long km;
	
	public Segment(int segmentID, int challengeID, PassagePoint beginPPoint, PassagePoint endPPoint,
			Map<Integer, Integer> obstacles, int km) {
		this.segmentID = segmentID;
		this.challengeID = challengeID;
		this.beginPPoint = beginPPoint;
		this.endPPoint = endPPoint;
		this.obstacles = obstacles;
		this.km = km;
	}
	
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
	
	public PassagePoint getBeginPPoint() {
		return beginPPoint;
	}
	
	public void setBeginPPoint(PassagePoint beginPPoint) {
		this.beginPPoint = beginPPoint;
	}
	
	public PassagePoint getEndPPoint() {
		return endPPoint;
	}
	
	public void setEndPPoint(PassagePoint endPPoint) {
		this.endPPoint = endPPoint;
	}
	
	public long getKm() {
		return km;
	}
	
	public void setKm(long km) {
		this.km = km;
	}
	
	public Map<Integer, Integer> getObstacles() {
		return obstacles;
	}
	
	public void setObstacles(Map<Integer, Integer> obstacles) {
		this.obstacles = obstacles;
	}
	
	public void addObstacle(Obstacle o, Integer km) {
		this.obstacles.put(o.getObstacleId(),km );
	}

	public void deleteObstacle(Obstacle o) {
		this.obstacles.remove(o.getObstacleId());
	}

	
*/
}


