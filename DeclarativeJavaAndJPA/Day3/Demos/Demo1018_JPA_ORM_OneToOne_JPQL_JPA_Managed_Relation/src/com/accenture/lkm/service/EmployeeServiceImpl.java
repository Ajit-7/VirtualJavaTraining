package com.accenture.lkm.service;

import com.accenture.lkm.dao.EmployeeDAO;
import com.accenture.lkm.utility.Factory;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void getAllEmployeesAndAssetCascade() throws Exception{
		EmployeeDAO employeeDAO = Factory.createEmployeeDAO();
		try {
			employeeDAO.getAllEmployeesAndAssetCascade();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}
	public void getAllEmployeesAndAssetInnerJoin()throws Exception {
		EmployeeDAO employeeDAO = Factory.createEmployeeDAO();
		try {
			employeeDAO.getAllEmployeesAndAssetInnerJoin();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}
	public void getEmployeesWithAssetAs(String assetName) throws Exception{
		EmployeeDAO employeeDAO = Factory.createEmployeeDAO();
		try {
			employeeDAO.getEmployeesWithAssetAs(assetName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}
}
