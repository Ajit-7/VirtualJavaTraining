package com.accenture.lkm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.entity.EmployeeEntity;
import com.accenture.lkm.utility.JPAUtility;

public class EmployeeDAOIMPL implements EmployeeDAO {

	public Integer addEmployee(EmployeeBean employee) throws Exception {
		// TODO Auto-generated method stub
		Integer employeeID = 0;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();

			EmployeeEntity employeeEntity1 = new EmployeeEntity();
			employeeEntity1.setEmployeeName(employee.getEmployeeName());
			employeeEntity1.setSalary(employee.getSalary());
			employeeEntity1.setEmployeeId(employee.getEmployeeId());
			entityManager.getTransaction().begin();
			EmployeeEntity employeeEntity2 = entityManager.merge(employeeEntity1);
			employeeEntity2.setEmployeeName("dummy"); // entity2 is the reference of managed copy, hence successful
														// update
			entityManager.getTransaction().commit();
			employeeID = employeeEntity2.getEmployeeId();
		} catch (Exception exception) {
			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}

		return employeeID;
	}

	public static void peristEmployee(EmployeeBean employee) {

	}

}
