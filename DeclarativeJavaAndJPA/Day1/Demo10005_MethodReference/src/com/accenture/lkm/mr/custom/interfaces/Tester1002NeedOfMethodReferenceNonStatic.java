package com.accenture.lkm.mr.custom.interfaces;

import com.accenture.lkm.Customer;
import com.accenture.lkm.Product;
import com.accenture.lkm.a.interfaces.OneParameterInterface;
import com.accenture.lkm.a.interfaces.TwoParameterInterface;

public class Tester1002NeedOfMethodReferenceNonStatic {

	// Need of MR for Instance methods
	public static void req1() {
		/*
		 * Req1: Lambda Expression to invoke a instance method
		 * printNameUpper() of the class Product to print the product name in
		 * upper case
		 */
		OneParameterInterface printProduct = (name) -> new Product().printNameUpper(name);
		printProduct.printNameInUpperCase("samsung");
		
		/*
		 * Req1: Method Reference to invoke a instance method
		 * printNameUpper() of the class Product to print the product name in
		 * upper case
		 */
		OneParameterInterface printProduct2 = new Product()::printNameUpper;
		printProduct2.printNameInUpperCase("samsung");
		
		
		/*
		 * Req1: Lambda Expression to invoke a instance method
		 * printNameUpper() of the class Customer to print the customer name in
		 * upper case
		 */
		OneParameterInterface printCustomer = (name) -> new Customer().printNameUpper(name);
		printCustomer.printNameInUpperCase("Jack");
		
		/*
		 * Req1: Method Reference  to invoke a instance method
		 * printNameUpper() of the class Customer to print the customer name in
		 * upper case
		 */
		OneParameterInterface printCustomer2 = new Customer()::printNameUpper;
		printCustomer2.printNameInUpperCase("Jack");
	}

	public static void req2() {
		/*
		 * Req2: Lambda Expression to invoke a instance method
		 * printProductDetails() of the class Product to print the product details
		 */
		TwoParameterInterface printProduct3 = (productId, name) -> new Product().printProductDetails(productId, name);
		printProduct3.display(11, "Jackson");
		
		/*
		 * Req2: Method Reference to invoke a instance method
		 * printProductDetails() of the class Product to print the product details
		 */
		TwoParameterInterface printProduct4 = new Product()::printProductDetails;
		printProduct4.display(11, "Jackson");
		
		/*
		 * Req2: Lambda Expression to invoke a instance method
		 * printCustomerDetails() of the class Customer to print the customer details
		 */
		TwoParameterInterface printCustomer3 = (customerId, name) -> new Customer().printCustomerDetails(customerId, name);
		printCustomer3.display(101, "Jackson");
		
		/*
		 * Req2: Method Reference to invoke a instance method
		 * printCustomerDetails() of the class Customer to print the customer details
		 */
		TwoParameterInterface printCustomer4 = new Customer()::printCustomerDetails;
		printCustomer4.display(101, "Jackson");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		req1();
		
//		req2();

	}

}
