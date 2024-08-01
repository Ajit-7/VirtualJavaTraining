package com.accenture.lkm.dao;


public interface EmployeeDAO {
	
	public void getAllEmployeesAndAssetCascade() throws Exception;
	public void getAllEmployeesAndAssetInnerJoin()throws Exception;
	public void getEmployeesWithAssetAs(String assetName) throws Exception;
}
