package com.accenture.lkm.standard.interfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

import com.accenture.lkm.a.pojo.Product;

public class Tester1008Function {
	public static void main(String[] args) {

		System.out.println("Function Interface\n----------------------");
		Function<String, Integer> product1 = (name) -> new Product().returnProductNameLength(name);
		Integer result1 = product1.apply("Samsung");
		System.out.println(result1);
		
		
		// Its not a good practice to tie Lambda to an object
		// This can be resolved by using accept() of Function by passing the object and
		// data to the Lambda as below		
		
		System.out.println("BiFunction Interface\n----------------------");
		BiFunction<Product, String, Integer> product5 = (product, productName) -> product.returnProductNameLength(productName);
		int total = product5.apply(new Product(), "Alexa");
		System.out.println(total);
	}

}
