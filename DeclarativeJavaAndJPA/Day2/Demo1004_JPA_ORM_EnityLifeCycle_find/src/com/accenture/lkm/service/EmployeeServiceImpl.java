package com.accenture.lkm.service;

import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.dao.EmployeeDAO;
import com.accenture. lkm.utility.Factory;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public EmployeeBean findEmployeeById(int employeeId) throws Exception {
		EmployeeBean employeeBean = null;
		try {
		EmployeeDAO employeeDAO = Factory.createEmployeeDAO();
		employeeBean=employeeDAO.findEmployeeById(employeeId);
		}catch (Exception exception) {
			throw exception;
		}
		return employeeBean;
	}



}
