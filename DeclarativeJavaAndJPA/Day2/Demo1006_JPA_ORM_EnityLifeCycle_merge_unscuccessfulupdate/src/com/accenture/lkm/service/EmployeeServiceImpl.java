package com.accenture.lkm.service;

import com.accenture.lkm.utility.Factory;
import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.dao.EmployeeDAO;

public class EmployeeServiceImpl implements EmployeeService {

	public Integer addEmployee(EmployeeBean employee) throws Exception {
		int employeeId = 0;
		try {
			EmployeeDAO employeeDAO = Factory.createEmployeeDAO();
			employeeId = employeeDAO.addEmployee(employee);
		} catch (Exception exception) {
			throw exception;
		}
		return employeeId;
	}
}
