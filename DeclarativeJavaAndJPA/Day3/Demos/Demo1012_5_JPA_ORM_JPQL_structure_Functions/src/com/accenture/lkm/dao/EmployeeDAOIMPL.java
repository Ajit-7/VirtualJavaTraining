package com.accenture.lkm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.accenture.lkm.utility.JPAUtility;

public class EmployeeDAOIMPL implements EmployeeDAO {

	public List<Object> stringFunctionsDemo()throws Exception{
		// TODO Auto-generated method stub
		EntityManager entityManager = null;
		List<Object> list =null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			
			Query query = entityManager.createQuery("select k.employeeName,uPpER(k.employeeName),LOWER(k.employeeName),SUBSTRING(k.employeeName,1,2),LENGTH(k.employeeName)from EmployeeEntity k"); 
			list = query.getResultList();
				
			
		} catch (Exception exception) {
			throw exception;
		}
		finally{
			if(entityManager!=null){
				entityManager.close();
			}
		}
		return list;

	}

	public List<Object> dateFunctionsDemo() throws Exception{
		// TODO Auto-generated method stub
		EntityManager entityManager = null;
		List<Object> list =null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			
			Query query = entityManager.createQuery("select k.insertTime,YEAR(k.insertTime), mOnTh(k.insertTime), DAY(k.insertTime)  from EmployeeEntity k"); 
			list = query.getResultList();
				
			
		} catch (Exception exception) {
			throw exception;
		}
		finally{
			if(entityManager!=null){
				entityManager.close();
			}
		}
		return list;

	}
	
	
	public List<Object> aggregateFunctionsDemo() throws Exception{
		// TODO Auto-generated method stub
		EntityManager entityManager = null;
		List<Object> list =null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			Query query = entityManager.createQuery("select avg(k.salary),max(k.salary),min(k.salary),count(k.salary),sum(k.salary) from EmployeeEntity k"); 
			list = query.getResultList();
			
		} catch (Exception exception) {
			throw exception;
		}
		finally{
			if(entityManager!=null){
				entityManager.close();
			}
		}
		return list;

	}

}
