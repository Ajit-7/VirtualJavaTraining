package com.accenture.lkm.standard.interfaces;

import java.util.function.Function;
import java.util.function.Supplier;

import com.accenture.lkm.a.pojo.Product;

public class Tester1009Supplier {
	public static void main(String[] args) {
		// Product
		// not good implementation as tied to the Object
		System.out.println("returnProductName");
		System.out.println("=================");
		Supplier<String> product2 = () -> new Product().returnProductName();
		// The method is invoked by get() of Supplier 
		System.out.println(product2.get());
		
		
		Function<Product, String>  funProduct= (product) -> product.returnProductName();
		String productName = funProduct.apply(new Product());
		
		System.out.println("Product Name: " + productName);
	}
}
