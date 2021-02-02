package com.fr.uha.ensisa.java.restapi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.fr.uha.ensisa.java.restapi.model.User;



public class ConnectUser extends Connection{
	
	public  static void main(String[] args)
	{
		addUser("amineihsane@gmail.com", "123456789", "Mohamed", "Ihsane");
	}
	
	public static void addUser(String email, String password, String firstname, String lastname) {
		EntityManager em = getEntityManagerFactory().createEntityManager();
		EntityTransaction et = null;
		try {
			et = em.getTransaction();
			et.begin();
			User user = new User();
			user.setEmail(email);
			user.setPassword(password);
			user.setFirstname(firstname);
			user.setLastname(lastname);
			em.persist(user);
			et.commit();
		} catch (Exception e) {
			if (et != null)
			{
				et.rollback();
			}
			e.printStackTrace();
		}
		finally {
			em.close();
		}
		
	
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
//	public static List<Vol> getAllVols() {
//		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
//		String query = "SELECT v FROM Vol v";
//		
//		TypedQuery<Vol> tq = em.createQuery(query,Vol.class);
//		List<Vol> vols = null;
//		
//		try {
//			vols = tq.getResultList();
//			//vols.forEach(vol -> System.out.println(vol.getNumVol()));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			
//			em.close();
//		}
//		return vols;
//		
//	}
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
