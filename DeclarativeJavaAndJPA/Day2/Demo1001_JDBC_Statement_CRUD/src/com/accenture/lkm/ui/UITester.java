package com.accenture.lkm.ui;

import java.sql.SQLException;
import java.util.Date;

import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.service.EmployeeService;
import com.accenture.lkm.service.EmployeeServiceImpl;

public class UITester {
	
	public static void main(String[] args) {
		insertEmployee();
//		readEmployee();
//		updateEmployee();
//		deleteEmployee();
	}
	public static void insertEmployee() {
		try {
			EmployeeService employeeService = new EmployeeServiceImpl();
			EmployeeBean bean = new EmployeeBean();
			bean.setEmployeeId(1004);
			bean.setEmployeeName("ABCD");
			bean.setRole("Sr.Analyst");
			bean.setSalary(300000.0);
			bean.setInsertTime(new Date());
			employeeService.insertEmployee(bean);
		} catch (ClassNotFoundException | SQLException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public static void readEmployee(){
		try {
			EmployeeService employeeService = new EmployeeServiceImpl();
			employeeService.readEmployee();
		} catch (ClassNotFoundException | SQLException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public static void updateEmployee(){
		try {
			EmployeeService employeeService = new EmployeeServiceImpl();
			EmployeeBean bean = new EmployeeBean();
			bean.setEmployeeId(1002);
			bean.setSalary(500000.0);
			employeeService.updateEmployee(bean);
		} catch (ClassNotFoundException | SQLException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public static void deleteEmployee(){
		try {
			EmployeeService employeeService = new EmployeeServiceImpl();
			EmployeeBean bean = new EmployeeBean();
			bean.setEmployeeId(1004);
			employeeService.deleteEmployee(bean);
		} catch (ClassNotFoundException | SQLException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
