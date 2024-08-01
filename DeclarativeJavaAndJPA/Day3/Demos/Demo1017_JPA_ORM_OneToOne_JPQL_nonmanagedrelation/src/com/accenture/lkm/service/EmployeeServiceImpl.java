package com.accenture.lkm.service;

import com.accenture.lkm.dao.EmployeeDAO;
import com.accenture.lkm.utility.Factory;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void getAllEmployeesWithAssetDetails() throws Exception {
		try {
			EmployeeDAO employeeDAO = Factory.createEmployeeDAO();
			employeeDAO.getAllEmployeesWithAssetDetails();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}

}
