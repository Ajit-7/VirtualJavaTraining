package com.accenture.lkm.ui;

import com.accenture.lkm.service.EmployeeService;
import com.accenture.lkm.utility.Factory;
import com.accenture.lkm.utility.JPAUtility;

public class UITester {

	public static void main(String[] args) {
		try {
			//getAllEmployeesAndAssetCascade();
			
			
			//getAllEmployeesAndAssetInnerJoin();
			
			
			getEmployeesWithAssetAs("laptop");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JPAUtility.closeEntityManagerFactory();
		}

	}

	public static void getAllEmployeesAndAssetCascade() {
		try {
			EmployeeService service = Factory.createEmployeeService();
			service.getAllEmployeesAndAssetCascade();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}	

	public static void getAllEmployeesAndAssetInnerJoin() {
		try {
			EmployeeService service = Factory.createEmployeeService();
			service.getAllEmployeesAndAssetInnerJoin();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void getEmployeesWithAssetAs(String assetName) {
		try {
			EmployeeService service = Factory.createEmployeeService();
			service.getEmployeesWithAssetAs(assetName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
