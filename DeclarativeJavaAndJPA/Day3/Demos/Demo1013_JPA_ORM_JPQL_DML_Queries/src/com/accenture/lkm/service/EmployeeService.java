package com.accenture.lkm.service;


public interface EmployeeService {
	public Integer updateSalaryOfEmployeeWithName(Double salary,String employeeName) throws Exception;
	public Integer deleteEmployeeWithNameAs(String employeeName) throws Exception;
}
