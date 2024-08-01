package com.accenture.lkm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.accenture.lkm.entity.EmployeeEntity;
import com.accenture.lkm.utility.JPAUtility;

public class EmployeeDAOIMPL implements EmployeeDAO {

	public void retrieveEmployeeDetails() throws Exception{
		// TODO Auto-generated method stub
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			System.out.println("Retrieve results using JPQL");
			Query query = entityManager.createQuery("SELECT e FROM EmployeeEntity e");
			List<EmployeeEntity> employeeList = query.getResultList();
			for(EmployeeEntity e: employeeList) {
				System.out.println(e.getEmployeeId()+","+e.getEmployeeName()+","+e.getRole()+","+e.getSalary());
			}
		} catch (Exception exception) {
			throw exception;
		}
		finally{
			if(entityManager!=null){
				entityManager.close();
			}
		}

	}

	public void retrieveEmployeeDetailsUsingHibernateProvider() throws Exception{
		// TODO Auto-generated method stub
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			
			System.out.println("Retrieve results using JPQL");
			Query query = entityManager.createQuery("FROM EmployeeEntity");
			List<EmployeeEntity> employeeList = query.getResultList();
			for(EmployeeEntity e: employeeList) {
				System.out.println(e.getEmployeeId()+","+e.getEmployeeName()+","+e.getRole()+","+e.getSalary());
			}
			
			entityManager.clear();
		} catch (Exception exception) {
			throw exception;
		}
		finally{
			if(entityManager!=null){
				entityManager.close();
			}
		}

	}

	
}
