package com.accenture.lkm.sampleclasses;

import java.util.ArrayList;
import java.util.List;

public class CustomerUtility {
	public static List<Customer> getCustomerList() {
		List<Customer> customers = new ArrayList<>();
		
		customers.add(new Customer(1, "Sara", 45));
		customers.add(new Customer(2, "John", 23));
		customers.add(new Customer(3, "Rian", 56));
		customers.add(new Customer(4, "Jack", 54));
		customers.add(new Customer(12, "Jill", 34));
		customers.add(new Customer(5, "Soloman", 24));
		customers.add(new Customer(6, "Ziva", 56));
		customers.add(new Customer(7, "Rian", 32));
		customers.add(new Customer(8, "Sara", 74));
		customers.add(new Customer(9, "Adam", 27));
		customers.add(new Customer(10, "Eve", 63));
		
		return customers;
	}
}
