package com.fr.uha.ensisa.java.restapi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.fr.uha.ensisa.java.restapi.model.PassagePoint;


public class ConnectPassagePoint {
private static  EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("gvfc-api");
	

	public static List<PassagePoint> getAllPassagePoints() {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		String query = "SELECT pp FROM passagepoint pp";
		
		TypedQuery<PassagePoint> tq = em.createQuery(query,PassagePoint.class);
		List<PassagePoint> pps = null;
		
		try {
			pps = tq.getResultList();
			//vols.forEach(vol -> System.out.println(vol.getNumVol()));
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				
				em.close();
			}
			return pps;
	}
	
	@Transactional
	public static void addPassagePoint(PassagePoint pp) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		String query = "INSERT INTO passagepoint (challengeID,level,description) VALUES (?,?,?) ";
		EntityTransaction et = null;
	
		et = em.getTransaction();
		et.begin();
		em.createNativeQuery(query,PassagePoint.class).
		setParameter(1,pp.getChallengeID())
		.setParameter(2,pp.getLevel())
		.setParameter(3,pp.getDescription())
		.executeUpdate();
	    et.commit();	
	}
}