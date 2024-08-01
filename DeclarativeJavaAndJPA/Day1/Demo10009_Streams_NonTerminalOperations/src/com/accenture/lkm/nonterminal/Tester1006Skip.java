package com.accenture.lkm.nonterminal;

import java.util.List;
import java.util.stream.Collectors;

import com.accenture.lkm.sampleclasses.Customer;
import com.accenture.lkm.sampleclasses.CustomerUtility;

/**
 * skip() of Stream
 * @author deepali.shende
 *
 */
public class Tester1006Skip {
	public static void main(String[] args) {
		// Req 1 : skip first 3 Customers
		req1();			   
	}

	
	//--------------------------------------------------------------------------------
	// Skip first 3 and get the list of remaining Customers 
	// Note: Passing negative value results in IllegalArgumentException
	//--------------------------------------------------------------------------------
	private static void req1() {
		List<Customer> customers =
				CustomerUtility.getCustomerList()
							   .stream()
							   .skip(3)
							   .collect(Collectors.toList());
		customers.forEach(System.out::println);	
	}
}

