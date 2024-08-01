package com.accenture.lkm.ui;

import java.util.Date;

import com.accenture.lkm.businessbean.AssetBean;
import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.service.EmployeeService;
import com.accenture.lkm.utility.Factory;
import com.accenture.lkm.utility.JPAUtility;

public class UITester {

	public static void main(String[] args) {
		try {
			insertAssetWithEmployee();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JPAUtility.closeEntityManagerFactory();
		}
	}

	static void insertAssetWithEmployee() {
		int employeeId = 0;
		try {
			EmployeeService service = Factory.createEmployeeService();
			EmployeeBean employee = new EmployeeBean();
			employee.setEmployeeName("Rohit");
			employee.setInsertTime(new Date());
			employee.setRole("Sr.Analyst");
			employee.setSalary(200000.00);

			AssetBean asset = new AssetBean();
			asset.setAssetName("Laptop");
			asset.setAssetBrandName("Dell");
			asset.setValidityYears(3);

			employeeId = service.insertAssetWithEmployee(employee, asset);
			System.out.println("Employee inserted successfully!!" + employeeId);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
