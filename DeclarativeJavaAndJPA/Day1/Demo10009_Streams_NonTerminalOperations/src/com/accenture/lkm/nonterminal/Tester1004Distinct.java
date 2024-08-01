package com.accenture.lkm.nonterminal;

import java.util.List;
import java.util.stream.Collectors;

import com.accenture.lkm.sampleclasses.Customer;
import com.accenture.lkm.sampleclasses.CustomerUtility;
import com.accenture.lkm.sampleclasses.Product;
import com.accenture.lkm.sampleclasses.ProductUtility;

/**
 * distinct() of Stream
 * @author deepali.shende
 */
public class Tester1004Distinct {
	public static void main(String[] args) {
		// Req 1 : get distinct product categories
		//req1();
		
		// Req 2 : Get no of distinct customer names
		req2();					   
	}

	
	//-----------------------------------------------------------------------------------------------------------
	// Get distinct product categories
	//-----------------------------------------------------------------------------------------------------------
	private static void req1() {
		// using lambda
		List<String> distinctProductTypes1 =
				ProductUtility.getProductList()
							   .stream()
							   .map(product -> product.getProductCategory())
							   .distinct()
							   .collect(Collectors.toList());
		distinctProductTypes1.forEach(category -> System.out.println(category));
		
		System.out.println("---------------------------------------------");
		
		// using method reference
		List<String> distinctProductTypes2 =
				ProductUtility.getProductList()
							   .stream()
							   .map(Product::getProductCategory)
							   .distinct()
							   .collect(Collectors.toList());
		distinctProductTypes2.forEach(System.out::println);
	}
	
	
	//-----------------------------------------------------------------------------------------------------------
	// Get no of distinct customer names.
	//-----------------------------------------------------------------------------------------------------------
	private static void req2() {
		// using lambda
		long count1 =
				CustomerUtility.getCustomerList()
							   .stream()
							   .map(customer -> customer.getCustomerName())
							   .distinct()
							   .count();
		System.out.println("No of distinct customer namers = " + count1);
		
		// using method reference
		long count2 =
				CustomerUtility.getCustomerList()
							   .stream()
							   .map(Customer::getCustomerName)
							   .distinct()
							   .count();
		System.out.println("No of distinct customer namers = " + count2);
	}
}

