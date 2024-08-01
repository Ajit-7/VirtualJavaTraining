package com.accenture.lkm.service;


public interface EmployeeService {

	public void getAllEmployeesAndAssetCascade() throws Exception;
	public void getAllEmployeesAndAssetInnerJoin()throws Exception;
	public void getEmployeesWithAssetAs(String assetName) throws Exception;
}
