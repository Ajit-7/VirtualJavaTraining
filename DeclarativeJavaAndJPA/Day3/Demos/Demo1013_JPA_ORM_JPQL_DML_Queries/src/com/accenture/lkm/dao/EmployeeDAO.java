package com.accenture.lkm.dao;


public interface EmployeeDAO {
	public Integer updateSalaryOfEmployeeWithName(Double salary,String employeeName) throws Exception;
	public Integer deleteEmployeeWithNameAs(String employeeName) throws Exception;
	
}
