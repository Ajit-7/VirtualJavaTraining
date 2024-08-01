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
			
			//getEmployeeDetails(1001, 301);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JPAUtility.closeEntityManagerFactory();
		}

	}

	static public void addEmployee() {
		int id = 0;
		EmployeeBean bean = new EmployeeBean();
		bean.setInsertTime(new Date());
		bean.setName("MSD2");
		bean.setRole("Analyst");
		bean.setSalary(100000.0);
		bean.setId(1100);
		bean.setDepartmentId(3001);
		bean.setName("Accenture");
		
		
		EmployeeService employeeService = Factory.createEmployeeService();
		try {
			id = employeeService.addEmployee(bean);
			System.out.println("Employee Registered Successfully: " + id);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	static public void getEmployeeDetails(int employeeId, int deptId) {
		
		EmployeeService employeeService = Factory.createEmployeeService();
		try {
			EmployeeBean bean = employeeService.getEmployeeDetails(employeeId, deptId);
			if(bean!=null){
				System.out.println("Employee Name:"+bean.getName());
			}
			else{
				System.out.println("Please try giving valid employeeId/ departmentId");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
