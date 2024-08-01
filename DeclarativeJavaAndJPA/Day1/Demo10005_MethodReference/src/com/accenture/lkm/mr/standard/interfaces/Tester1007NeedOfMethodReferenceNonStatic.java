package com.accenture.lkm.mr.standard.interfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

import com.accenture.lkm.Customer;
import com.accenture.lkm.Product;

public class Tester1007NeedOfMethodReferenceNonStatic {

	// Need of MR for Instance methods
	public static void req1() {
		// write the LE for the methods which take 1 parameter and does not return anything
		// Product
		Consumer<String> printProduct = (name) -> new Product().printNameUpper(name);
		printProduct.accept("samsung");
		
		Consumer<String> printProduct2 = new Product()::printNameUpper;
		printProduct2.accept("samsung");
		
		// Customer
		Consumer<String> printCustomer = (name) -> new Customer().printNameUpper(name);
		printCustomer.accept("Jack");
		
		Consumer<String> printCustomer2 = new Customer()::printNameUpper;
		printCustomer2.accept("Jack");
	}

	public static void req2() {
		// write the LE for the methods which take 2 parameters and does not return anything
		//Product
		BiConsumer<Integer, String> printProduct3 = (productId, name) -> new Product().printProductDetails(productId, name);
		printProduct3.accept(11, "Jackson");
		
		BiConsumer<Integer, String> printProduct4 = new Product()::printProductDetails;
		printProduct4.accept(11, "Jackson");

		// customer
		BiConsumer<Integer, String> printCustomer3 = (customerId, name) -> new Customer().printCustomerDetails(customerId, name);
		printCustomer3.accept(101, "Jackson");
		
		BiConsumer<Integer, String> printCustomer4 = new Customer()::printCustomerDetails;
		printCustomer4.accept(101, "Jackson");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		req1();
		
//		req2();

	}

}
