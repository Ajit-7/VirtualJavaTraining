package com.accenture.lkm.dao;

import com.accenture.lkm.businessbean.DepartmentBean;
import com.accenture.lkm.businessbean.EmployeeBean;

public interface EmployeeDAO {
	
	public Integer insertEmployeeAndDepartment(EmployeeBean employee, EmployeeBean employee2, DepartmentBean d) throws Exception;
	public void removeEmployeeAndDepartment(EmployeeBean employee) throws Exception;
	
	
}
