package com.accenture.lkm.ui;

import com.accenture.lkm.service.EmployeeService;
import com.accenture.lkm.utility.Factory;
import com.accenture.lkm.utility.JPAUtility;

public class UITester {

	public static void main(String[] args) {
		try {
			
			
			updateSalaryOfEmployeeWithName(90000.0,"Tim");
			deleteEmployeeWithNameAs("MSD");
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JPAUtility.closeEntityManagerFactory();
		}

	}

	static public void updateSalaryOfEmployeeWithName(Double salary, String employeeName) {
		
		EmployeeService employeeService = Factory.createEmployeeService();
		try {
			
			int res=employeeService.updateSalaryOfEmployeeWithName(salary, employeeName);
			System.out.println("Number of Rows successfully updated are: "+res);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static public void deleteEmployeeWithNameAs(String employeeName) {
		
		
		EmployeeService employeeService = Factory.createEmployeeService();
		try {
			int res=employeeService.deleteEmployeeWithNameAs(employeeName);
			System.out.println("Number of Rows successfully deleted are: "+res);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
