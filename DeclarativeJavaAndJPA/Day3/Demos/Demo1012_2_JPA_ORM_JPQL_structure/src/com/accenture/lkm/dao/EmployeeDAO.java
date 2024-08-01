package com.accenture.lkm.dao;

import java.util.List;

import com.accenture.lkm.businessbean.EmployeeBean;

public interface EmployeeDAO {
	public List<EmployeeBean> retrieveEmployeeDetails() throws Exception;
	public List<EmployeeBean> retrieveEmployeeDetailsUsingHibernateProvider() throws Exception;
}
