package com.accenture.lkm.dao;

import java.util.List;

import com.accenture.lkm.businessbean.EmployeeBean;

public interface EmployeeDAO {
	public List<String> retrieveEmployeeNames() throws Exception;
	public List<EmployeeBean> retrieveEmployeeIdAndNameColumns() throws Exception;
}
