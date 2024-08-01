package com.accenture.lkm.custom.interfaces;

import com.accenture.lkm.a.pojo.Product;

interface ProductFunctionalInterface {
	Integer returnLengthOfName(String name);
}

public class Tester1004ProductFunctionClass {
	public static void main(String[] args) {
		ProductFunctionalInterface pfi = (name) -> new Product().returnProductNameLength(name);
		Integer result1 = pfi.returnLengthOfName("Samsung");
		System.out.println("Length of product name: " + result1); 
	}
}
