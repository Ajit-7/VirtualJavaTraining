package com.accenture.lkm.a.interfaces;

import com.accenture.lkm.Customer;

public interface ParameterizedCustomerConstructorInterface {
	Customer getCustomerObject(Integer id, String name);
}
