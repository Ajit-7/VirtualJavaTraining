package com.accenture.lkm.mr.standard.interfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

import com.accenture.lkm.Customer;
import com.accenture.lkm.Product;

public class Tester1006NeedOfMethodReferenceStatic {

	// Need of MR for Static methods
	public static void req1() {
		// Product
		Consumer<String> printProduct = (name) -> Product.printNameUpperStatic(name);
		printProduct.accept("samsung");
		
		Consumer<String>  printProduct2 = Product::printNameUpperStatic;
		printProduct2.accept("samsung");
		
		// Customer
		Consumer<String>  printCustomer = (name) -> Customer.printNameUpperStatic(name);
		printCustomer.accept("Jack");
		
		Consumer<String>  printCustomer2 = Customer::printNameUpperStatic;
		printCustomer2.accept("Jack");
	}

	public static void req2() {
		//Product
		BiConsumer<Integer, String> printProduct3 = (productId, name) -> Product.displayDetails(productId, name);
		printProduct3.accept(11, "LG");

		BiConsumer<Integer, String> printProduct4 = Product::displayDetails;
		printProduct4.accept(11, "LG");
		
		// customer
		BiConsumer<Integer, String> printCustomer3 = (customerId, name) -> Customer.displayDetails(customerId, name);
		printCustomer3.accept(101, "Jack");
		
		BiConsumer<Integer, String> printCustomer4 = Customer::displayDetails;
		printCustomer4.accept(101, "Jack");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		req1();
		
//		req2();

	}

}
