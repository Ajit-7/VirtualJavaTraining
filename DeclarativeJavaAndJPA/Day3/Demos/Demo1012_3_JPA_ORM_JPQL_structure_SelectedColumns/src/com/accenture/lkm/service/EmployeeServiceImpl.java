package com.accenture.lkm.service;

import java.util.List;

import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.dao.EmployeeDAO;
import com.accenture.lkm.utility.Factory;

public class EmployeeServiceImpl implements EmployeeService {

	
	@Override
	public List<String> retrieveEmployeeNames() throws Exception {
		List<String> employeeNames = null;
		try {
			EmployeeDAO employeeDAO = Factory.createEmployeeDAO();
			employeeNames =employeeDAO.retrieveEmployeeNames();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
		return employeeNames;
	}
	@Override
	public List<EmployeeBean> retrieveEmployeeIdAndNameColumns() throws Exception {
		// TODO Auto-generated method stub
		List<EmployeeBean> employees = null;
		try {
			EmployeeDAO employeeDAO = Factory.createEmployeeDAO();
			employees =employeeDAO.retrieveEmployeeIdAndNameColumns();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
		return employees;
	}

}
