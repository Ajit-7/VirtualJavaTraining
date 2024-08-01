package com.accenture.lkm.standard.interfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

import com.accenture.lkm.a.pojo.Product;

public class Tester1007Predicate {
	public static void main(String[] args) {

		// Product
		// checks the name of product contains minimum of 5 characters or not
		System.out.println("Product name contains minimum of 5 characters");
		System.out.println("==============================================");
		
		Predicate<String> predicateLength = (pName) ->  new Product().returnProductNameLength(pName) >= 5 ;
		System.out.println(predicateLength.test("Samsung"));
		
		// Its not a good practice to tie to an object
		// This can be resolved by using by using accept() of BiConsumer by passing object and data to the Lambda as below

		// Alternative:
		BiPredicate<Product, String> biPredicateLength = (productL, name) -> productL.returnProductNameLength(name) >= 5;
		// class on which to invoke the method
		// parameter data type to be passed to function
		System.out.println(biPredicateLength.test(new Product(), "Samsung"));
		

	}

}
