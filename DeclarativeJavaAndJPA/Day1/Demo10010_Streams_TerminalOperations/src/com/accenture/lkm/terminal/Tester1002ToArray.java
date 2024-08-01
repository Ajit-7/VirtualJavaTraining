package com.accenture.lkm.terminal;

import java.util.stream.Stream;

import com.accenture.lkm.sampleclasses.Product;
import com.accenture.lkm.sampleclasses.ProductUtility;

/**
 * Conversion of Stream to Array
 * @author deepali.shende
 *
 */
public class Tester1002ToArray {
	public static void main(String[] args) {
		Stream<Product> products1 = ProductUtility.getProductList().stream();
		// toArray converts to array of objects, not to specific type. Type casting would give ClassCaseException
		Object[] allProducts = products1.toArray();
		System.out.println("No of products = " + allProducts.length);
		
		System.out.println("-----------------------------------------------");
		
		// A function passed to toArray() takes an integer, which is the size of the desired array, 
		// and produces an array of the desired size. 
		Stream<Product> products2 = ProductUtility.getProductList().stream();
		Product[] myProducts = products2.toArray(size -> new Product[size]);
		System.out.println("No of products = " + myProducts.length);
		
		System.out.println("-----------------------------------------------");
		
		//This can expressed with an array constructor reference:
		Stream<Product> products3 = ProductUtility.getProductList().stream();
		Product[] myProducts1 = products3.toArray(Product[]::new);
		System.out.println("No of products = " + myProducts1.length);
	}
}
