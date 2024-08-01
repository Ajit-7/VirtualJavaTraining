package com.accenture.lkm.dao;

import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.businessbean.CompanyBean;

public interface EmployeeDAO {
	
	public Integer createCompanyAndEmployeeRecords(CompanyBean companyBean1,EmployeeBean employeeBean1,EmployeeBean employeeBean2) throws Exception ;

	public void deleteCompanyAndEmployeeRecords(CompanyBean companyBean) throws Exception;
	
}
