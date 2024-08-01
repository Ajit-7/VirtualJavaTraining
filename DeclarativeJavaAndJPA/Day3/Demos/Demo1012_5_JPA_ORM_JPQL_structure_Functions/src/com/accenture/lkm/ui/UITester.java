package com.accenture.lkm.ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.accenture.lkm.service.EmployeeService;
import com.accenture.lkm.utility.Factory;
import com.accenture.lkm.utility.JPAUtility;

public class UITester {

	public static void main(String[] args) {
		try {
			stringFunctionsDemo();
			
			
			dateFunctionsDemo();
			
			aggregateFunctionsDemo();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JPAUtility.closeEntityManagerFactory();
		}

	}

	static public void stringFunctionsDemo() {
		List<Object> list = null;
		
		EmployeeService employeeService = Factory.createEmployeeService();
		try {
			list = employeeService.stringFunctionsDemo();
			for(Object object: list) {
				Object[]  objArr= (Object[])object;
				System.out.println(objArr[0]+", "+objArr[1]+", "+objArr[2]+", "+objArr[3]+", "+objArr[4]);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static public void dateFunctionsDemo() {
		List<Object> list = null;
		
		EmployeeService employeeService = Factory.createEmployeeService();
		try {
			list = employeeService.dateFunctionsDemo();
			SimpleDateFormat dateFormat =  new SimpleDateFormat("dd-MMM-yyyy");
			for (Object obj : list) {
				Object[] objArr = (Object[])obj;
				System.out.println(dateFormat.format(((Date)objArr[0])) + ", "	+ objArr[1] + ", "+ objArr[2] + ", "+ objArr[3]);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	static public void aggregateFunctionsDemo() {
		List<Object> list = null;
		
		EmployeeService employeeService = Factory.createEmployeeService();
		try {
			list = employeeService.aggregateFunctionsDemo();
			for (Object obj: list) {
				Object[] objArr= (Object[])obj;
				System.out.println(objArr[0]+", "+ objArr[1]+", "+objArr[2]+", "+ objArr[3]+","+objArr[4]);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
