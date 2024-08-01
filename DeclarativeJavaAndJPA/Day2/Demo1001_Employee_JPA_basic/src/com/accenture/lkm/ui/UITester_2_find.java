package com.accenture.lkm.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.accenture.lkm.entity.EmployeeEntity;

public class UITester_2_find {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EmployeeEntity employeeEntity =  entityManager.find(EmployeeEntity.class, 1004);
		System.out.println("Employee Id: "+employeeEntity.getEmployeeId()+"\n"+
				"Employee Name: "+employeeEntity.getEmployeeName()+"\n"+
				"Employee Role: "+employeeEntity.getRole()+"\n"+
				"Employee insert date: "+employeeEntity.getInsertTime()+"\n"+
				"Employee Salary: "+employeeEntity.getSalary()); 
		entityManager.close();
		entityManagerFactory.close();

		
	}
	
}
