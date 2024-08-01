package com.accenture.lkm.utility;

import com.accenture.lkm.dao.CustomerDAO;
import com.accenture.lkm.dao.CustomerDAOIMPL;
import com.accenture.lkm.service.CustomerService;
import com.accenture.lkm.service.CustomerServiceIMPL;

public class Factory {
	
	public static CustomerDAO createCustomerDAO(){
		return new CustomerDAOIMPL();
	}
	
	public static CustomerService createCustomerService(){
		return new CustomerServiceIMPL();
	}

}
