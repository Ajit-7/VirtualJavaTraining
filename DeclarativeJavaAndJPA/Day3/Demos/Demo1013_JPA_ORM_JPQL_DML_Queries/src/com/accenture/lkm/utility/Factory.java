package com.accenture.lkm.utility;

import com.accenture.lkm.dao.EmployeeDAO;
import com.accenture.lkm.dao.EmployeeDAOIMPL;
import com.accenture.lkm.service.EmployeeService;
import com.accenture.lkm.service.EmployeeServiceImpl;

public class Factory {
	
	public static EmployeeDAO createEmployeeDAO(){
		return new EmployeeDAOIMPL();
	}
	
	public static EmployeeService createEmployeeService(){
		return new EmployeeServiceImpl();
	}

}
