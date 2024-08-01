package com.accenture.lkm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.accenture.lkm.entity.EmployeeEntity;
import com.accenture.lkm.utility.JPAUtility;

public class EmployeeDAOIMPL implements EmployeeDAO {


	@Override
	public void removeEmployeeById(int id) throws Exception {
		// TODO Auto-generated method stub
		EntityManager entityManager = null;
		 EmployeeEntity employeeEntity = null;
		try {
		EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
		 entityManager = entityManagerFactory.createEntityManager();
		 System.out.println("Employee entity before transaction begin, before find: "+entityManager.contains(employeeEntity));
		 entityManager.getTransaction().begin();
		 System.out.println("Employee entity after transaction begin, before find: "+entityManager.contains(employeeEntity));
		employeeEntity = entityManager.find(EmployeeEntity.class,id);
		System.out.println("Employee entity after transaction begin, after find: "+entityManager.contains(employeeEntity));
		System.out.println("Employee entity after transaction begin, before removing the enitity: "+entityManager.contains(employeeEntity));
		if(id ==employeeEntity.getEmployeeId()) {
		entityManager.remove(employeeEntity);
		System.out.println("Employee entity after transaction begin, after removing the enitity: "+entityManager.contains(employeeEntity));
		entityManager.getTransaction().commit();
		System.out.println("Employee entity after removing entity, transaction commited: "+entityManager.contains(employeeEntity));
		} else {
			System.out.println("employee id doesn't exist!!");
		}
 		
		}catch (Exception exception) {
			throw exception;
		}
		finally{
			if(entityManager!=null){
				entityManager.close();
			}
		}

	}
	
}
