package com.accenture.lkm.service;

import com.accenture.lkm.dao.EmployeeDAO;
import com.accenture.lkm.utility.Factory;

public class EmployeeServiceImpl implements EmployeeService {

	
	

	@Override
	public Integer updateSalaryOfEmployeeWithName(Double salary,String employeeName) throws Exception{
		Integer res= null;
		try {
			EmployeeDAO employeeDAO = Factory.createEmployeeDAO();
			res =employeeDAO.updateSalaryOfEmployeeWithName(salary, employeeName);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
		return res;
	}

	@Override
	public Integer deleteEmployeeWithNameAs(String employeeName) throws Exception{
		Integer res= null;
		try {
			EmployeeDAO employeeDAO = Factory.createEmployeeDAO();
			res =employeeDAO.deleteEmployeeWithNameAs(employeeName);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
		return res;
	}


}
