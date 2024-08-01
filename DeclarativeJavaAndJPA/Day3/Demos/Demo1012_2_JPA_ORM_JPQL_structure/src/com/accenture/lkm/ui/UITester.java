package com.accenture.lkm.ui;

import java.util.List;

import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.service.EmployeeService;
import com.accenture.lkm.utility.Factory;
import com.accenture.lkm.utility.JPAUtility;

public class UITester {

	public static void main(String[] args) {
		try {
			retrieveEmployeeDetails();
			System.out.println("===============using Hibernate provider=================");
			retrieveEmployeeDetailsUsingHibernateProvider();
			System.out.println("===============Retrieve employee by name================");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JPAUtility.closeEntityManagerFactory();
		}

	}

	static public void retrieveEmployeeDetails() {
		List<EmployeeBean> employees = null;
		
		EmployeeService employeeService = Factory.createEmployeeService();
		try {
			employees = employeeService.retrieveEmployeeDetails();
			for(EmployeeBean e: employees) {
				System.out.println(e.getEmployeeId()+","+e.getEmployeeName()+","+e.getRole()+","+e.getSalary());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static public void retrieveEmployeeDetailsUsingHibernateProvider() {
		List<EmployeeBean> employees = null;
		
		EmployeeService employeeService = Factory.createEmployeeService();
		try {
			employees = employeeService.retrieveEmployeeDetailsUsingHibernateProvider();
			
			for(EmployeeBean e: employees) {
				System.out.println(e.getEmployeeId()+","+e.getEmployeeName()+","+e.getRole()+","+e.getSalary());
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
