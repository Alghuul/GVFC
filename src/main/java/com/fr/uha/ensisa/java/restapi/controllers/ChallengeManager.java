package com.fr.uha.ensisa.java.restapi.controllers;

import java.util.List;

import com.fr.uha.ensisa.java.restapi.dao.DAOChallenge;
import com.fr.uha.ensisa.java.restapi.model.Challenge;

public class ChallengeManager {

	static DAOChallenge daoChallenge = new DAOChallenge();
	
	public static List<Challenge> getChallenges() {
		List<Challenge> lc = daoChallenge.getAll();
		return lc;
	}

	public static Challenge getChallenge(int id) {
		Challenge c = daoChallenge.findByid(id);
		return c;
	}
	
	public static boolean createChallenge(Challenge challenge) {
		Challenge c = daoChallenge.findByid(challenge.getChallengeID());
		if (c == null) {
			daoChallenge.add(challenge);
			return true;
		}
		return false;
	}
	
	public static boolean deleteChallenge(int ChallengeID) {
		Challenge c = daoChallenge.findByid(ChallengeID);
		if (c != null) {
			daoChallenge.delete(ChallengeID);
			return true;
		}
		return false;		
	}

	public static void putChallenge(Challenge challenge) {
		daoChallenge.put(challenge);
		
	}

}
