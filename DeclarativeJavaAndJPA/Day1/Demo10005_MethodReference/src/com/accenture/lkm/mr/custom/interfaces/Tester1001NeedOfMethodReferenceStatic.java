package com.accenture.lkm.mr.custom.interfaces;

import com.accenture.lkm.Customer;
import com.accenture.lkm.Product;
import com.accenture.lkm.a.interfaces.OneParameterInterface;
import com.accenture.lkm.a.interfaces.TwoParameterInterface;

public class Tester1001NeedOfMethodReferenceStatic {

	// Need of MR for Static methods
	public static void req1() {
		/*
		 * Req1: Lambda Expression to invoke a static method
		 * printNameUpperStatic() of the class Product to print the product name in
		 * upper case
		 */
		// Product
		OneParameterInterface printProduct = (name) -> Product.printNameUpperStatic(name);
		printProduct.printNameInUpperCase("samsung");
		
		/*
		 * Req1: Method Reference to invoke a static method
		 * printNameUpperStatic() of the class Product to print the product name in
		 * upper case
		 */
		OneParameterInterface printProduct2 = Product::printNameUpperStatic;
		printProduct2.printNameInUpperCase("samsung");
		
		
		/*
		 * Req1: Lambda Expression to invoke a static method
		 * printNameUpperStatic() of the class Customer to print the customer name in
		 * upper case
		 */
		// Customer
		OneParameterInterface printCustomer = (name) -> Customer.printNameUpperStatic(name);
		printCustomer.printNameInUpperCase("Jack");
		
		
		/*
		 * Req1: Method Reference to invoke a static method
		 * printNameUpperStatic() of the class Customer to print the customer name in
		 * upper case
		 */
		OneParameterInterface printCustomer2 = Customer::printNameUpperStatic;
		printCustomer2.printNameInUpperCase("Jack");
	}

	public static void req2() {
		/*
		 * Req2: Lambda Expression to invoke a static method
		 * displayDetails() of the class Product to print the product details
		 */
		//Product
		TwoParameterInterface printProduct3 = (productId, name) -> Product.displayDetails(productId, name);
		printProduct3.display(11, "LG");

		/*
		 * Req2: Method Reference to invoke a static method
		 * displayDetails() of the class Product to print the product details
		 */
		TwoParameterInterface printProduct4 = Product::displayDetails;
		printProduct4.display(11, "LG");
		
		
		/*
		 * Req2: Lambda Expression to invoke a static method
		 * displayDetails() of the class Customer to print the customer details
		 */
		// customer
		TwoParameterInterface printCustomer3 = (customerId, name) -> Customer.displayDetails(customerId, name);
		printCustomer3.display(101, "Jack");
		
		/*
		 * Req2: Method Reference to invoke a static method
		 * displayDetails() of the class Customer to print the customer details
		 */
		TwoParameterInterface printCustomer4 = Customer::displayDetails;
		printCustomer4.display(101, "Jack");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		req1();
		
//		req2();

	}

}
