package com.accenture.lkm.ui;

import com.accenture.lkm.service.EmployeeService;
import com.accenture.lkm.utility.Factory;
import com.accenture.lkm.utility.JPAUtility;

public class UITester {

	public static void main(String[] args) {
		try {
			 getAllEmployeesWithAssetDetails();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JPAUtility.closeEntityManagerFactory();
		}

	}

	public static void getAllEmployeesWithAssetDetails() {

		EmployeeService employeeService = Factory.createEmployeeService();
		try {
			 employeeService.getAllEmployeesWithAssetDetails();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
