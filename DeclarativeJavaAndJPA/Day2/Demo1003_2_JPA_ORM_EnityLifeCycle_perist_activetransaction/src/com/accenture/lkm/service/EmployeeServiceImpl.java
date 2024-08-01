package com.accenture.lkm.service;

import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.dao.EmployeeDAO;
import com.accenture.lkm.utility.Factory;
public class EmployeeServiceImpl implements EmployeeService {

	public Integer addEmployeeTest1(EmployeeBean employee) throws Exception {
		int employeeId = 0;
		try {
			EmployeeDAO employeeDAO = Factory.createEmployeeDAO();
			employeeId = employeeDAO.addEmployeeTest1(employee);
		} catch (Exception exception) {
			throw exception;
		}
		return employeeId;
	}
	public Integer addEmployeeTest2(EmployeeBean employee) throws Exception {
		int employeeId = 0;
		try {
			EmployeeDAO employeeDAO = Factory.createEmployeeDAO();
			employeeId = employeeDAO.addEmployeeTest2(employee);
		} catch (Exception exception) {
			throw exception;
		}
		return employeeId;
	}
	
	public Integer addEmployeeTest3(EmployeeBean employee) throws Exception {
		int employeeId = 0;
		try {
			EmployeeDAO employeeDAO = Factory.createEmployeeDAO();
			employeeId = employeeDAO.addEmployeeTest3(employee);
		} catch (Exception exception) {
			throw exception;
		}
		return employeeId;
	}
}

