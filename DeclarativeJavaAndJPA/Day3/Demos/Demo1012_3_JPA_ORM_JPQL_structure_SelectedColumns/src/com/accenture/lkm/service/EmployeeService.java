package com.accenture.lkm.service;

import java.util.List;

import com.accenture.lkm.businessbean.EmployeeBean;

public interface EmployeeService {
	public List<String> retrieveEmployeeNames() throws Exception;
	public List<EmployeeBean> retrieveEmployeeIdAndNameColumns() throws Exception;
}
