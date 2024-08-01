package com.accenture.lkm.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.accenture.lkm.entity.EmployeeEntity;

public class UITester_4_remove {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EmployeeEntity employeeEntity = entityManager.find(EmployeeEntity.class, 1004);
		if(employeeEntity != null) {
		entityManager.getTransaction().begin();
		entityManager.remove(employeeEntity);
		entityManager.getTransaction().commit();
		System.out.println("Employee deleted successfully!!");
		} else {
			System.out.println("Please give a valid ID!!");	
		}
		entityManager.close();
		entityManagerFactory.close();
	}

}
