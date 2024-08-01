package com.accenture.lkm.service;

import com.accenture.lkm.businessbean.AssetBean;
import com.accenture.lkm.businessbean.EmployeeBean;

public interface EmployeeService {
	public Integer insertAssetWithEmployee(EmployeeBean employeeBean, AssetBean assetBean) throws Exception;

}
