package com.accenture.lkm.service;

import com.accenture.lkm.businessbean.EmployeeBean;

public interface EmployeeService {
	EmployeeBean findEmployeeById(int employeeId) throws Exception;

}
