package com.accenture.lkm.ui;

import com.accenture.lkm.service.EmployeeService;
import com.accenture.lkm.utility.Factory;
import com.accenture.lkm.utility.JPAUtility;

public class UITester {

	public static void main(String[] args) {
		try {
			removeEmployeeById();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JPAUtility.closeEntityManagerFactory();
		}

	}

	static public void removeEmployeeById() {
		EmployeeService employeeService = Factory.createEmployeeService();
		try {
			employeeService.removeEmployeeById(1002);
			System.out.println("Employee deleted successfully!!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
