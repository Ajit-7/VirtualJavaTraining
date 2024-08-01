package com.accenture.lkm.ui;

import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.service.EmployeeService;
import com.accenture.lkm.utility.Factory;
import com.accenture.lkm.utility.JPAUtility;

public class UITester_merge_update {

	public static void main(String[] args) {
		try {
			addEmployee();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JPAUtility.closeEntityManagerFactory();
		}

	}

	static public void addEmployee() {
		int id = 0;
		EmployeeBean bean = new EmployeeBean();
		bean.setEmployeeId(1002);
		bean.setEmployeeName("updatedname");
		bean.setSalary(400000.0);
		EmployeeService employeeService = Factory.createEmployeeService();
		try {
			id = employeeService.addEmployee(bean);
			System.out.println("Employee Updated Successfully: " + id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
