package com.fr.uha.ensisa.java.restapi.dao;

import java.util.List;

import javax.naming.InitialContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.transaction.SystemException;
import javax.transaction.Transactional;
import javax.transaction.UserTransaction;

import com.fr.uha.ensisa.java.restapi.model.User;



public class ConnectUser implements ServletContextListener {
	
	private static  EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("gvfc-api");
	
	@PersistenceContext(unitName = "gvfc-api")
	private static EntityManager em;
	
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
	
	
	
	
	public static User addUser(User user) {
		EntityManager em = getEntityManager();
		UserTransaction et = null;
		try {
			et = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
			et.begin();
			em.persist(user);
			et.commit();
		} catch (Exception e) {
			if (et != null)
			{
				try {
					et.rollback();
				} catch (IllegalStateException e1) {
					
					e1.printStackTrace();
				} catch (SecurityException e1) {
					
					e1.printStackTrace();
				} catch (SystemException e1) {
					e1.printStackTrace();
				}
			}
			e.printStackTrace();
		}
		finally {
			em.close();
		}
		return user;
		
	}




	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
	
	}




	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		ENTITY_MANAGER_FACTORY.close();
		
	}
	
	@Transactional(dontRollbackOn = Exception.class)
	private static EntityManager getEntityManager() {
		em = ENTITY_MANAGER_FACTORY.createEntityManager();
		return em;
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
