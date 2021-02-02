package com.fr.uha.ensisa.java.restapi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.fr.uha.ensisa.java.restapi.model.User;



public class ConnectUser{
	
	private static  EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("gvfc-api");
	

	public static List<User> getAllUsers() {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		String query = "SELECT u FROM User u";
		
		TypedQuery<User> tq = em.createQuery(query,User.class);
		List<User> users = null;
		
		try {
			users = tq.getResultList();
			//vols.forEach(vol -> System.out.println(vol.getNumVol()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
			em.close();
		}
		return users;
		
	}
	
	
	
	@Transactional
	public static void addUser(User user) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		String query = "INSERT INTO user (email,password,firstname,lastname) VALUES (?,?,?,?) ";
		EntityTransaction et = null;
		
		et = em.getTransaction();
		et.begin();
		em.createNativeQuery(query,User.class).
		setParameter(1,user.getEmail())
		.setParameter(2,user.getPassword())
		.setParameter(3,user.getFirstName())
		.setParameter(4,user.getLastName())
		.executeUpdate();
	    et.commit();
	}
	
//	public static Vol getVol(String numVol) {
//		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
//		String query = "SELECT v FROM Vol v WHERE v.numVol = :numVol ";
//		
//		TypedQuery<Vol> tq = em.createQuery(query,Vol.class);
//		tq.setParameter("numVol", numVol);
//		Vol v = null;
//		try {
//			v = tq.getSingleResult();
//			System.out.println(v.getNumVol());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			em.close();
//		}
//		return v;
//	}
//	
//	public static List<User> searchUser(String firstname, ){
//		
//		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
//		String query = "SELECT v FROM Vol v WHERE v.numVol = :numVol OR v.villeDepart = :departure OR v.villeArrivee = :arrival ";
//		
//		TypedQuery<Vol> tq = em.createQuery(query,Vol.class);
//		tq.setParameter("numVol", time);
//		tq.setParameter("departure",departure);
//		tq.setParameter("arrival",arrival);
//		List<Vol> vols = null;
//		try {
//			vols = tq.getResultList();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			em.close();
//		}
//		return vols;
//		
//	}
//	

//	
//	public static void putVol(String numVol,int heureDepart) {
//		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
//		EntityTransaction et = null;
//		Vol vol = null;
//		try {
//			et = em.getTransaction();
//			et.begin();
//			vol = em.find(Vol.class, numVol);
//			vol.setHeureDepart(heureDepart);
//			em.persist(vol);
//			et.commit();
//		} catch (Exception e) {
//			if (et != null)
//			{
//				et.rollback();
//			}
//			e.printStackTrace();
//		}
//		finally {
//			em.close();
//		}
//	
//	}
//	
//	public static void deleteVol(String numVol) {
//		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
//		EntityTransaction et = null;
//		Vol vol = null;
//		try {
//			et = em.getTransaction();
//			et.begin();
//			vol = em.find(Vol.class, numVol);
//			em.remove(vol);
//			em.persist(vol);
//			et.commit();;
//		} catch (Exception e) {
//			if (et != null)
//			{
//				et.rollback();
//			}
//			e.printStackTrace();
//		}
//		finally {
//			em.close();
//		}
//	
//	}

}
