package com.accenture.lkm.service;

import com.accenture. lkm.utility.Factory;
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

	
	public EmployeeBean findEmployeeById(Integer employeeId) throws Exception {
		EmployeeBean employee =null;
		try {
			
			EmployeeDAO employeeDAO = Factory.createEmployeeDAO();

			employee = employeeDAO.findEmployeeById(employeeId);

			if(employee==null){
				throw new Exception("Given EmployeeId is invalid, please try with a valid EmployeeId");
			}
		} catch (Exception exception) {
			throw exception;
		}
		return employee;
	}


	@Override
	public EmployeeBean updateEmployee(EmployeeBean employeeBean)throws Exception {
		EmployeeBean employee =null;
		try {
			
			EmployeeDAO employeeDAO = Factory.createEmployeeDAO();

			employee = employeeDAO.updateEmployee(employeeBean);

			if(employee==null){
				throw new Exception("Given EmployeeId is invalid, please try with a valid EmployeeId");
			}
		} catch (Exception exception) {
			throw exception;
		}
		return employee;
	}


	@Override
	public EmployeeBean deleteEmployeeById(Integer employeeId) throws Exception {
		EmployeeBean employee =null;
		try {
			
			EmployeeDAO employeeDAO = Factory.createEmployeeDAO();

			employee = employeeDAO.deleteEmployeeById(employeeId);

			if(employee==null){
				throw new Exception("Given EmployeeId is invalid, please try with a valid EmployeeId");
			}
		} catch (Exception exception) {
			throw exception;
		}
		return employee;
	}
	
}
