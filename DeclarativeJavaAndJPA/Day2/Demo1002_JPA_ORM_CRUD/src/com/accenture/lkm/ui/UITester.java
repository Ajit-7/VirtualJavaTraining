package com.accenture.lkm.ui;

import java.util.Date;

import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.service.EmployeeService;
import com.accenture.lkm.utility.Factory;
import com.accenture.lkm.utility.JPAUtility;

public class UITester {

	public static void main(String[] args) {
		try {
			
			//addEmployee();
			//findEmployeeById();
			//updateEmployee();
			//deleteEmployeeById();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} finally {
			JPAUtility.closeEntityManagerFactory();
		}

	}
		
	static public void addEmployee(){
		EmployeeBean bean = new EmployeeBean();
		bean.setInsertTime(new Date());
		bean.setEmployeeName("MSD1");
		bean.setRole("Analyst");
		bean.setSalary(100000.0);
		EmployeeService employeeService = Factory.createEmployeeService();
		try {
			int id = employeeService.addEmployee(bean);
			System.out.println("Employee Registered Successfully: " + id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	static public void findEmployeeById(){
		EmployeeService employeeService = Factory.createEmployeeService();
		try {
			EmployeeBean emp = employeeService.findEmployeeById(1004);
			System.out.println(emp.getEmployeeName());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static public void updateEmployee(){
		EmployeeService employeeService = Factory.createEmployeeService();
		try {
			EmployeeBean employeeBean1= new EmployeeBean();
			employeeBean1.setEmployeeId(1002);
			employeeBean1.setSalary(12000.0);
			EmployeeBean emp = employeeService.updateEmployee(employeeBean1);
			System.out.println(emp.getEmployeeName()+", new salary is: "+emp.getSalary());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static public void deleteEmployeeById(){
		EmployeeService employeeService = Factory.createEmployeeService();
		try {
			EmployeeBean emp = employeeService.deleteEmployeeById(1004);
			System.out.println(emp.getEmployeeName());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
