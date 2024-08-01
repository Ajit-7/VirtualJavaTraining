package com.accenture.lkm.service;

import java.util.List;

import com.accenture.lkm.businessbean.EmployeeBean;

public interface EmployeeService {
	public List<EmployeeBean> retrieveEmployeeDetails() throws Exception;
	public List<EmployeeBean> retrieveEmployeeDetailsUsingHibernateProvider() throws Exception;
}
