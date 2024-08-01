package com.accenture.lkm.standard.interfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

import com.accenture.lkm.a.pojo.Product;

public class Tester1006Consumer {
	public static void main(String[] args) {

		// Product - print Product Name in upper case
		Consumer<String> product4 = (pname) -> new Product().printProductNameUpper(pname);
		product4.accept("LG");

		// Its not a good practice to tie to an object
		// This can be resolved by using by using accept() of BiConsumer by passing object and data to the Lambda as below

		
		// Alternative:
		BiConsumer<Product, String> product5 = (productL, name) -> productL.printProductNameUpper(name);
		// class on which to invoke the method
		// parameter data type to be passed to function
		product5.accept(new Product(), "Samsung");
	}

}
