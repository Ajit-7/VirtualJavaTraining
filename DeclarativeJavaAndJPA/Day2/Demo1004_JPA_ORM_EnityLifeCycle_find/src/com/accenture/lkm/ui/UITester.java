package com.accenture.lkm.ui;

import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.service.EmployeeService;
import com.accenture.lkm.utility.Factory;
import com.accenture.lkm.utility.JPAUtility;

public class UITester {

	public static void main(String[] args) {
		try {
			findEmployeeById();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JPAUtility.closeEntityManagerFactory();
		}

	}

	static public void findEmployeeById() {
		int employeeId = 0;
		EmployeeBean employee = null;
		EmployeeService employeeService = Factory.createEmployeeService();
		try {
			employee = employeeService.findEmployeeById(1002);
			employeeId = employee.getEmployeeId(); 
			System.out.println(employeeId+", "+employee.getEmployeeName());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
