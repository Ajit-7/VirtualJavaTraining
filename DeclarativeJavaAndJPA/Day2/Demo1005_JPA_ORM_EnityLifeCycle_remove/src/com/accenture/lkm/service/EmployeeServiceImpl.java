package com.accenture.lkm.service;

import com.accenture.lkm.dao.EmployeeDAO;
import com.accenture. lkm.utility.Factory;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void removeEmployeeById(int employeeId) throws Exception {
		// TODO Auto-generated method stub
		try {
		EmployeeDAO employeeDAO = Factory.createEmployeeDAO();
		employeeDAO.removeEmployeeById(employeeId);
		}catch (Exception exception) {
			throw exception;
		}
	}

}
