package com.accenture.lkm.dao;

import java.util.List;

import com.accenture.lkm.businessbean.EmployeeBean;

public interface EmployeeDAO {
	public List<EmployeeBean> retrieveEmployeeDetailsWithInSalaryRange1(Double lowerBound,Double upperBound) throws Exception;
	public List<EmployeeBean> retrieveEmployeeDetailsWithInSalaryRange2(Double lowerBound,Double upperBound) throws Exception;
}
