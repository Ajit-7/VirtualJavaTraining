package com.accenture.lkm.terminal;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.accenture.lkm.sampleclasses.Customer;
import com.accenture.lkm.sampleclasses.CustomerUtility;
import com.accenture.lkm.sampleclasses.Product;
import com.accenture.lkm.sampleclasses.ProductUtility;

/**
 * Summarizing info in Stream
 * @author deepali.shende
 *
 */
public class Tester1005Summarizing {
	public static void main(String[] args) {
		//summarizingInt();
		
		summarizingDouble();
	}
	
	//------------------------------------------------------------------------------------------------------------
	// Getting summary functions like min, max, average, count on customer age
	//------------------------------------------------------------------------------------------------------------
	private static void summarizingInt() {
		//Using lambda
		Stream<Customer> customers = CustomerUtility.getCustomerList().stream();
		IntSummaryStatistics intSummaryStatistics = customers.collect(Collectors.summarizingInt(customer -> customer.getAge()));
		System.out.println(intSummaryStatistics);
		
		System.out.println("-----------------------------------------------------------");
		
		//Using method reference
		IntSummaryStatistics intSummaryStatistics1 = CustomerUtility.getCustomerList().stream().collect(Collectors.summarizingInt(Customer::getAge));
		System.out.println(intSummaryStatistics1);
	}
	
	
	//------------------------------------------------------------------------------------------------------------
	// Getting summary functions like min, max, average, count on product price
	//------------------------------------------------------------------------------------------------------------
	private static void summarizingDouble() {
		//Using lambda
		Stream<Product> products = ProductUtility.getProductList().stream();
		DoubleSummaryStatistics doubleSummaryStatistics = products.collect(Collectors.summarizingDouble(product -> product.getProductPrice()));
		System.out.println(doubleSummaryStatistics);
		
		System.out.println("-----------------------------------------------------------");
		
		//Using method reference
		DoubleSummaryStatistics doubleSummaryStatistics1 = ProductUtility.getProductList().stream().collect(Collectors.summarizingDouble(Product :: getProductPrice));
		System.out.println(doubleSummaryStatistics1);
	}
}
