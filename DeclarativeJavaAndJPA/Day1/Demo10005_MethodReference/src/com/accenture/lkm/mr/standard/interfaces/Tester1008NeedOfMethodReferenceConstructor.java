package com.accenture.lkm.mr.standard.interfaces;

import java.util.function.BiFunction;
import java.util.function.Supplier;

import com.accenture.lkm.Customer;
import com.accenture.lkm.Product;

public class Tester1008NeedOfMethodReferenceConstructor {

	// Need of MR for Constructor
	public static void req1() {
		// write the LE for the Default Constructor
		Supplier<Product> productObj = () -> new Product();
		Product p = productObj.get();
		
		Supplier<Product> productObj2 = Product::new;
		Product p2 = productObj2.get();
		
		// Customer
		Supplier<Customer> customerObj = () -> new Customer();
		Customer c = customerObj.get();
		
		Supplier<Customer> customerObj2 = Customer::new;
		Customer c2 = customerObj2.get();
	}
	
	public static void req2() {
		// write the LE for the parameterized Constructor
		BiFunction<Integer, String, Product> productObj2 = (id, name) -> new Product(id, name);
		Product p2 = productObj2.apply(11, "Jackson");
		
		BiFunction<Integer, String, Product> productObj3 = Product::new;
		Product p3 = productObj3.apply(11, "Jackson");
		
		// Customer
		BiFunction<Integer, String, Customer> customerObj2 = (id, name) -> new Customer(id, name);
		Customer c2 = customerObj2.apply(101, "Jackson");
		
		BiFunction<Integer, String, Customer> customerObj3 = Customer::new;
		Customer c3 = customerObj3.apply(101, "Jackson");
	}
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		req1();
		
//		req2();
				
	}

}
