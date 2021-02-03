package com.fr.uha.ensisa.java.restapi.controllers;

import java.util.List;

import com.fr.uha.ensisa.java.restapi.dao.DAOObstacle;
import com.fr.uha.ensisa.java.restapi.model.Obstacle;

public class ObstacleManager {

	static DAOObstacle daoObstacle = new DAOObstacle();
	
	public static List<Obstacle> getObstacles() {
		List<Obstacle> lo = daoObstacle.getAll();
		return lo;
	}

	public static Obstacle getObstacle(int id) {
		Obstacle o = daoObstacle.findByid(id);
		return o;
	}
	
	public static boolean createObstacle(Obstacle obstacle) {
		Obstacle o = daoObstacle.findByid(obstacle.getObstacleId());
		if (o == null) {
			daoObstacle.add(obstacle);
			return true;
		}
		return false;
	}
	
	public static boolean deleteObstacle(int obstacleID) {
		Obstacle o = daoObstacle.findByid(obstacleID);
		if (o != null) {
			daoObstacle.delete(obstacleID);
			return true;
		}
		return false;		
	}

}
