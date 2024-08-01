package com.accenture.lkm.standard.interfaces.exact.signature.match;

import java.util.function.BiFunction;

import com.accenture.lkm.a.pojo.Product;

public class Tester1012BiFunction {
	public static void main(String[] args) {		
		
		System.out.println("BiFunction Interface\n----------------------");
		// RHS Method signature matches with LHS
		BiFunction<String, Double, Double> product4 = (productName, price) -> new Product().returnDiscountedPrice(productName, price);
		Double total = product4.apply("Alexa", 500000.2);
		System.out.println(total);	
	}
}