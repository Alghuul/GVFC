package com.fr.uha.ensisa.java.restapi.dao;

import com.fr.uha.ensisa.java.restapi.model.User;


public class DAOUser extends DAOAbstractFacade<User>{
	
	public DAOUser() {
		super(User.class);
	}
}