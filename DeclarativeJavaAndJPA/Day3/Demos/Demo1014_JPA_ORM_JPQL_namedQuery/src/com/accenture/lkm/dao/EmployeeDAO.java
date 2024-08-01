package com.accenture.lkm.dao;

import java.util.List;

import com.accenture.lkm.businessbean.EmployeeBean;

public interface EmployeeDAO {
	public List<EmployeeBean> retrieveEmployeeDetailsWithInSalaryRange(Double lowerBound,Double upperBound) throws Exception;
}
