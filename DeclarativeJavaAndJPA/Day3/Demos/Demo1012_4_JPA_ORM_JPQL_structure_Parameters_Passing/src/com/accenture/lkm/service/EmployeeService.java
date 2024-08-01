package com.accenture.lkm.service;

import java.util.List;

import com.accenture.lkm.businessbean.EmployeeBean;

public interface EmployeeService {
	public List<EmployeeBean> retrieveEmployeeDetailsWithInSalaryRange1(Double lowerBound,Double upperBound) throws Exception;
	public List<EmployeeBean> retrieveEmployeeDetailsWithInSalaryRange2(Double lowerBound,Double upperBound) throws Exception;
}
