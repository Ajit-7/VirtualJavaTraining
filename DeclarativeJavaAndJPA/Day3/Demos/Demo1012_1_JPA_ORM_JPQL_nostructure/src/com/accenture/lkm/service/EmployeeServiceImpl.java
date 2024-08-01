package com.accenture.lkm.service;

import com.accenture.lkm.dao.EmployeeDAO;
import com.accenture.lkm.utility.Factory;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void retrieveEmployeeDetails() throws Exception {

		try {
			EmployeeDAO employeeDAO = Factory.createEmployeeDAO();
			employeeDAO.retrieveEmployeeDetails();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void retrieveEmployeeDetailsUsingHibernateProvider() throws Exception {
		// TODO Auto-generated method stub
		try {
			EmployeeDAO employeeDAO = Factory.createEmployeeDAO();
			employeeDAO.retrieveEmployeeDetailsUsingHibernateProvider();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	
	

}
