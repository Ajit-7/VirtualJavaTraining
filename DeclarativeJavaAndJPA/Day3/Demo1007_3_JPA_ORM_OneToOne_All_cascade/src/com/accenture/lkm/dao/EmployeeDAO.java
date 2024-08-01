package com.accenture.lkm.dao;

import com.accenture.lkm.businessbean.AssetBean;
import com.accenture.lkm.businessbean.EmployeeBean;

public interface EmployeeDAO {
	
	public void removeEmployeeAndAsset(EmployeeBean employee) throws Exception;
	 public Integer insertAssetWithEmployee(EmployeeBean employeeBean, AssetBean assetBean) throws Exception;
}
