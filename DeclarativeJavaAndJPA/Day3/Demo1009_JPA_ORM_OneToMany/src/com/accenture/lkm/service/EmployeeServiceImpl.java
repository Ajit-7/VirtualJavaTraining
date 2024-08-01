package com.accenture.lkm.service;

import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.businessbean.CompanyBean;
import com.accenture.lkm.dao.EmployeeDAO;
import com.accenture.lkm.utility.Factory;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Integer createCompanyAndEmployeeRecords(CompanyBean companyBean1,EmployeeBean employeeBean1,EmployeeBean employeeBean2) throws Exception {
		int employeeId = 0;
		EmployeeDAO employeeDAO = Factory.createEmployeeDAO();
		try {
			employeeId = employeeDAO.createCompanyAndEmployeeRecords(companyBean1,employeeBean1,employeeBean2);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
		return employeeId;
	}

	@Override
	public void deleteCompanyAndEmployeeRecords(CompanyBean companyBean)
			throws Exception {
		EmployeeDAO employeeDAO = Factory.createEmployeeDAO();
		try {
			 employeeDAO.deleteCompanyAndEmployeeRecords(companyBean);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}
}
