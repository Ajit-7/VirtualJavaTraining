package com.accenture.lkm.ui;

import com.accenture.lkm.businessbean.CompanyBean;
import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.service.EmployeeService;
import com.accenture.lkm.utility.Factory;
import com.accenture.lkm.utility.JPAUtility;

public class UITester {

	public static void main(String[] args) {
		try {
			createCompanyAndEmployeeRecords();
			
			//deleteCompanyAndEmployeeRecords();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JPAUtility.closeEntityManagerFactory();
		}
	}

	static void createCompanyAndEmployeeRecords() {
		try {
			EmployeeService service = Factory.createEmployeeService();

			EmployeeBean employee1 = new EmployeeBean();
			employee1.setEmployeeName("Tim");
			employee1.setRole("Sr.Analyst");

			EmployeeBean employee2 = new EmployeeBean();
			employee2.setEmployeeName("Dan");
			employee2.setRole("Lead");
			
			CompanyBean companyBean = new CompanyBean();
			companyBean.setCompanyName("James Corp");

			service.createCompanyAndEmployeeRecords(companyBean,employee1,employee2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void deleteCompanyAndEmployeeRecords() {
		try {
			EmployeeService service = Factory.createEmployeeService();
			
			CompanyBean companyBean = new CompanyBean();
			companyBean.setCompanyId(2001);
			service.deleteCompanyAndEmployeeRecords(companyBean);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
