package com.accenture.lkm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.accenture.lkm.utility.JPAUtility;

public class EmployeeDAOIMPL implements EmployeeDAO {
;
	
	public Integer updateSalaryOfEmployeeWithName(Double salary,String employeeName) throws Exception{
		// TODO Auto-generated method stub
		EntityManager entityManager = null;
		Integer res =null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			
			Query query = entityManager.createQuery("update EmployeeEntity k set k.salary=?22 where k.employeeName= :p1");
			query.setParameter(22, salary);
			query.setParameter("p1", employeeName);
			
			entityManager.getTransaction().begin();
			res = query.executeUpdate();
			entityManager.getTransaction().commit();	
			
		} catch (Exception exception) {
			throw exception;
		}
		finally{
			if(entityManager!=null){
				entityManager.close();
			}
		}
		return res;

	}

	public Integer deleteEmployeeWithNameAs(String employeeName) throws Exception{
		// TODO Auto-generated method stub
		EntityManager entityManager = null;
		Integer res =null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			Query query = entityManager.createQuery("delete from EmployeeEntity k where k.employeeName= :p2");
			query.setParameter("p2", employeeName);
			entityManager.getTransaction().begin();
				res = query.executeUpdate();
			entityManager.getTransaction().commit();	
		} catch (Exception exception) {
			throw exception;
		}
		finally{
			if(entityManager!=null){
				entityManager.close();
			}
		}
		return res;

	}

}
