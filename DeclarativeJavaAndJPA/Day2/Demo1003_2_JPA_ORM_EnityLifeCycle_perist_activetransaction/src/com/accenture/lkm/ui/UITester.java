package com.accenture.lkm.ui;

import java.util.Date;

import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.service.EmployeeService;
import com.accenture.lkm.utility.Factory;
import com.accenture.lkm.utility.JPAUtility;

public class UITester {

	public static void main(String[] args) {
		try {
			addEmployeeTest1();
			//addEmployeeTest2();
			//addEmployeeTest3();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JPAUtility.closeEntityManagerFactory();
		}

	}
	
	static public void addEmployeeTest1() {
		int id = 0;
		EmployeeBean bean = new EmployeeBean();
		bean.setInsertTime(new Date());
		bean.setEmployeeName("MSD1");
		bean.setRole("Analyst");
		bean.setSalary(200000.0);
		EmployeeService employeeService = Factory.createEmployeeService();
		try {
			id = employeeService.addEmployeeTest1(bean);
			System.out.println("Employee Registered Successfully: "+id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static public void addEmployeeTest2() {
		int id = 0;
		EmployeeBean bean = new EmployeeBean();
		bean.setInsertTime(new Date());
		bean.setEmployeeName("MSD1");
		bean.setRole("Analyst");
		bean.setSalary(200000.0);
		EmployeeService employeeService = Factory.createEmployeeService();
		try {
			id = employeeService.addEmployeeTest2(bean);
			System.out.println("Employee Registered Successfully: "+id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static public void addEmployeeTest3() {
		int id = 0;
		EmployeeBean bean = new EmployeeBean();
		bean.setInsertTime(new Date());
		bean.setEmployeeName("MSD1");
		bean.setRole("Analyst");
		bean.setSalary(200000.0);
		EmployeeService employeeService = Factory.createEmployeeService();
		try {
			id = employeeService.addEmployeeTest3(bean);
			System.out.println("Employee Registered Successfully: "+id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
