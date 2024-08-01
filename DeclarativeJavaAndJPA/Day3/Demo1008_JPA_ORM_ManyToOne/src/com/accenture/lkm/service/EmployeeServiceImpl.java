package com.accenture.lkm.service;

import com.accenture.lkm.businessbean.DepartmentBean;
import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.dao.EmployeeDAO;
import com.accenture.lkm.utility.Factory;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Integer insertEmployeeAndDepartment(EmployeeBean employee1, EmployeeBean employee2, DepartmentBean d)
			throws Exception {
		int count = 0;
		try {
			EmployeeDAO employeeDAO = Factory.createEmployeeDAO();
			count = employeeDAO.insertEmployeeAndDepartment(employee1, employee2, d);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
		return count;
	}
}
