package com.accenture.lkm.ui;

import java.util.List;

import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.service.EmployeeService;
import com.accenture.lkm.utility.Factory;
import com.accenture.lkm.utility.JPAUtility;

public class UITester {

	public static void main(String[] args) {
		try {
			retrieveEmployeeNames();
			
			retrieveEmployeeIdAndNameDetails();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JPAUtility.closeEntityManagerFactory();
		}

	}

	static public void retrieveEmployeeNames() {
		List<String> employees = null;
		
		EmployeeService employeeService = Factory.createEmployeeService();
		try {
			employees = employeeService.retrieveEmployeeNames();
			for(String e: employees) {
				System.out.println(e);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static public void retrieveEmployeeIdAndNameDetails() {
		List<EmployeeBean> employees = null;
		
		EmployeeService employeeService = Factory.createEmployeeService();
		try {
			employees = employeeService.retrieveEmployeeIdAndNameColumns();
			
			for(EmployeeBean e: employees) {
				System.out.println(e.getEmployeeId()+","+e.getEmployeeName()+","+e.getRole()+","+e.getSalary());
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
