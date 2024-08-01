package com.accenture.lkm.ui;

import com.accenture.lkm.service.EmployeeService;
import com.accenture.lkm.utility.Factory;
import com.accenture.lkm.utility.JPAUtility;

public class UITester {
	public static void main(String[] args) {

		try {
			//Case1
			//System.out.println("===============using JPQL=================");
			//retrieveEmployeeDetails();
			
			//Case2
			//System.out.println("===============using Hibernate provider=================");
			//retrieveEmployeeDetailsUsingHibernateProvider();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JPAUtility.closeEntityManagerFactory();
		}

	}

	static public void retrieveEmployeeDetails() {

		EmployeeService employeeService = Factory.createEmployeeService();
		try {
			employeeService.retrieveEmployeeDetails();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	static public void retrieveEmployeeDetailsUsingHibernateProvider() {

		EmployeeService employeeService = Factory.createEmployeeService();
		try {
			employeeService.retrieveEmployeeDetailsUsingHibernateProvider();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
