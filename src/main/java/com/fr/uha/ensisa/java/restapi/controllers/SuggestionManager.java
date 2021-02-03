package com.fr.uha.ensisa.java.restapi.controllers;

import java.util.List;

import com.fr.uha.ensisa.java.restapi.dao.DAOSuggestion;
import com.fr.uha.ensisa.java.restapi.model.Suggestion;
import com.fr.uha.ensisa.java.restapi.model.User;

public class SuggestionManager {
	static DAOSuggestion daoSuggestion = new DAOSuggestion();
	
	public static List<Suggestion> getSuggestions() {
		List<Suggestion> lpp = daoSuggestion.getAll();
		return lpp;
	}

	public static Suggestion getSuggestion(int id) {
		Suggestion u = daoSuggestion.findByid(id);
		return u;
	}
	
	public static boolean createSuggestion(Suggestion s) {
		//Suggestion u = daoSuggestion.findByid(s.getSuggestionID());
		//if (u == null) {
			daoSuggestion.add(s);
			return true;
		//}
		//return false;
	}
	
	public static boolean deleteSuggestion(int suggestionID) {
		Suggestion s = daoSuggestion.findByid(suggestionID);
		if (s == null) {
			daoSuggestion.delete(suggestionID);
			return true;
		}
		return false;		
	}

}
