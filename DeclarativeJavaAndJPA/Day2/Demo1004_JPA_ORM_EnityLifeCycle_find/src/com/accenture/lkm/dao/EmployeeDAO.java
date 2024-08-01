package com.accenture.lkm.dao;

import com.accenture.lkm.businessbean.EmployeeBean;

public interface EmployeeDAO {
	
	EmployeeBean findEmployeeById(int employeeId) throws Exception;
	
}
