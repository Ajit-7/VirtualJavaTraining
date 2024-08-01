package com.accenture.lkm.service;

import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.businessbean.CompanyBean;

public interface EmployeeService {
	public Integer createCompanyAndEmployeeRecords(CompanyBean companyBean1,EmployeeBean employeeBean1,EmployeeBean employeeBean2) throws Exception ;
	void deleteCompanyAndEmployeeRecords(CompanyBean companyBean)
			throws Exception;
}
