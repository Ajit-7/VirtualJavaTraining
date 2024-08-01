package com.accenture.lkm.ui;

import com.accenture.lkm.businessbean.DepartmentBean;
import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.service.EmployeeService;
import com.accenture.lkm.utility.Factory;
import com.accenture.lkm.utility.JPAUtility;

public class UITester {

	public static void main(String[] args) {
		try {
			//insertEmployeeAndDepartment();
			
			// this removal gives error
			//removeEmployeeAndAsset(1001);
			
			// this removal will happen successfully 
			//removeEmployeeAndAsset(1003);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JPAUtility.closeEntityManagerFactory();
		}
	}

	static void insertEmployeeAndDepartment() {
		try {
		EmployeeService service = Factory.createEmployeeService();
		
		DepartmentBean department = new DepartmentBean();
		department.setDepartmentName("LKM");
		department.setCity("Hyderabad");
		
		EmployeeBean employee1 =  new EmployeeBean();
		employee1.setEmployeeName("Rohit");
		employee1.setRole("Sr.Analyst");
		
		EmployeeBean employee2 =  new EmployeeBean();
		employee2.setEmployeeName("Kumar");
		employee2.setRole("Analyst");
		
		service.insertEmployeeAndDepartment(employee1, employee2, department);
		System.out.println("success- done!!");		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void removeEmployeeAndAsset(int param) {
		try {
			EmployeeService service = Factory.createEmployeeService();
			EmployeeBean employee = new EmployeeBean();
			employee.setEmployeeId(param);
			service.removeEmployeeAndDepartment(employee);
			System.out.println("Employee removed successfully!!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
