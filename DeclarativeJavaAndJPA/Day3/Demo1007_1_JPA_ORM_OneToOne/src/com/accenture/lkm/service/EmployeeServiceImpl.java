package com.accenture.lkm.service;

import com.accenture.lkm.businessbean.AssetBean;
import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.dao.EmployeeDAO;
import com.accenture.lkm.utility.Factory;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Integer insertAssetWithEmployee(EmployeeBean employeeBean, AssetBean assetBean) throws Exception {
		int employeeId = 0;
		EmployeeDAO employeeDAO = Factory.createEmployeeDAO();
		try {
			employeeId = employeeDAO.insertAssetWithEmployee(employeeBean, assetBean);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
		return employeeId;
	}
}
