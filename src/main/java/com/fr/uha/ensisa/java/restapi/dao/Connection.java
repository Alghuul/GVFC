package com.fr.uha.ensisa.java.restapi.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class Connection {
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("gvfc-api");

	public static EntityManagerFactory getEntityManagerFactory() {
		return ENTITY_MANAGER_FACTORY;
	}
	
	
	

}
