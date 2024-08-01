package com.accenture.lkm.ui;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.accenture.lkm.entity.EmployeeEntity;

public class UITester_1_persist {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EmployeeEntity employee = new EmployeeEntity();
		employee.setEmployeeId(1004);
		employee.setEmployeeName("ABCDE");
		employee.setRole("Analyst");
		employee.setSalary(200000.0);
		employee.setInsertTime(new Date());
		
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		System.out.println("Employee registered successfully!!");
		
		entityManager.close();
		entityManagerFactory.close();
	}
	
}
