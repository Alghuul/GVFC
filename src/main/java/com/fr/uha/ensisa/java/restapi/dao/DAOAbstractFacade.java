package com.fr.uha.ensisa.java.restapi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;



public abstract class DAOAbstractFacade<T> {

	private static  EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("gvfc-api");

	private Class<T> classEntities;
	
	public DAOAbstractFacade(Class<T> entity) {
		
		this.setClassEntities(entity);
	}
	@SuppressWarnings("unchecked")
	@Transactional
	public List<T> getAll() {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		String query = "SELECT u FROM " +getClassEntities().getSimpleName()+" u";
		TypedQuery<T> tq = em.createQuery(query,this.classEntities);
		List<T> nentity = null;
		
		try {
			nentity = tq.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
			em.close();
		}
		return nentity;
	}
	
	@Transactional
	public void add(T entity) {
		
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = null;
		try {
			et = em.getTransaction();
			et.begin();
			em.persist(entity);
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
	
	
	
	
	
	public Class<T> getClassEntities() {
		return classEntities;
	}
	public void setClassEntities(Class<T> classEntities) {
		this.classEntities = classEntities;
	}
}
