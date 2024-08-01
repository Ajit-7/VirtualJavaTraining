package com.accenture.lkm.service;

import com.accenture.lkm.businessbean.DepartmentBean;
import com.accenture.lkm.businessbean.EmployeeBean;

public interface EmployeeService {
	public Integer insertEmployeeAndDepartment(EmployeeBean employee1, EmployeeBean employee2, DepartmentBean d) throws Exception;

}
