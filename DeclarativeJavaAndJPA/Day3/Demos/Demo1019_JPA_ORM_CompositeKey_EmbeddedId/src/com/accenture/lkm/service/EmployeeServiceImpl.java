package com.accenture.lkm.service;

import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.dao.EmployeeDAO;
import com.accenture.lkm.utility.Factory;

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

	@Override
	public EmployeeBean getEmployeeDetails(int employeeId, int deptId) {
		EmployeeBean employee = null;
		try {
			EmployeeDAO employeeDAO = Factory.createEmployeeDAO();
			employee = employeeDAO.getEmployeeDetails(employeeId, deptId);
		} catch (Exception exception) {
			throw exception;
		}
		return employee;
	}
}
