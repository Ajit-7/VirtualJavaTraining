package com.accenture.lkm.service;

import java.util.List;

import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.dao.EmployeeDAO;
import com.accenture.lkm.utility.Factory;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public List<EmployeeBean> retrieveEmployeeDetailsWithInSalaryRange1(Double lowerBound,Double upperBound) throws Exception {
		List<EmployeeBean> employees = null;
		try {
			EmployeeDAO employeeDAO = Factory.createEmployeeDAO();
			employees =employeeDAO.retrieveEmployeeDetailsWithInSalaryRange(lowerBound, upperBound);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
		return employees;
	}
	public List<EmployeeBean> retrieveEmployeeDetailsWithNameLike(String namePattern) throws Exception{
		List<EmployeeBean> employees = null;
		try {
			EmployeeDAO employeeDAO = Factory.createEmployeeDAO();
			employees =employeeDAO.retrieveEmployeeDetailsWithNameLike(namePattern);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
		return employees;
	}
}
