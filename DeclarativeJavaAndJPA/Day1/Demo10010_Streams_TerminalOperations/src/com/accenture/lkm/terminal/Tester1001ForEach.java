package com.accenture.lkm.terminal;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import com.accenture.lkm.sampleclasses.Product;
import com.accenture.lkm.sampleclasses.ProductUtility;

/**
 * forEach()
 * @author deepali.shende
 *
 */
public class Tester1001ForEach {
	public static void main(String[] args) {
		List<Product> products = ProductUtility.getProductList();
		
		// makes code lengthy. More lines in byte code. Compilation takes time.
		//displayUsingIterator(products);
		
		// forEach method
		displayUsingForEachMethod(products);
	}
	
	
	//-------------------------------------------------------------------------------------------------------
	// Using iterator, makes code lengthy. More lines in byte code. Compilation takes time. More assembly code.
	// Poor performance
	//-------------------------------------------------------------------------------------------------------
	public static void displayUsingIterator(List<Product> products) {
		Stream<Product> stream = products.stream();
		Iterator<Product> iterator = stream.iterator();
		while(iterator.hasNext()) {
			Product product = iterator.next();
			product.printDetails();
		}
	}
	
	
	//-------------------------------------------------------------------------------------------------------
	// Using forEach method
	//-------------------------------------------------------------------------------------------------------
	public static void displayUsingForEachMethod(List<Product> products) {
		// using Lambda expression
		Stream<Product> productStream1 = products.stream();
		productStream1.forEach(product -> product.printDetails());
		
		// Using method reference
		Stream<Product> productStream2 = products.stream();
		productStream2.forEach(System.out::println);
	}
}
