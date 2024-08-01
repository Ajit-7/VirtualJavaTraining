package com.accenture.lkm.nonterminal;

import java.util.stream.Collectors;

import com.accenture.lkm.sampleclasses.Product;
import com.accenture.lkm.sampleclasses.ProductUtility;

/**
 * peek() of Stream
 * @author deepali.shende
 *
 */
public class Tester1003Peek {
	public static void main(String[] args) {
		// using lambda
		ProductUtility.getProductList()
					  .stream()
					  .filter(product -> product.getProductName().length() > 5)
					  .peek(product -> System.out.println("Filtered value: " + product.getProductName()))
					  .map(product -> product.getProductName().toUpperCase())
					  .peek(productName -> System.out.println("Mapped value: " + productName))
					  .collect(Collectors.toList());
		
		System.out.println("------------------------------------------------------");
		
		// using method reference
		ProductUtility.getProductList()
					  .stream()
					  .filter(Tester1003Peek::checkProductNameLength)
					  .peek(Tester1003Peek::printProductOnNameLength)
					  .map(Tester1003Peek::convertProductNameToUpperCase)
					  .peek(Tester1003Peek::printProductNamesInUpperCase)
					  .collect(Collectors.toList());
	}
	
	public static boolean checkProductNameLength(Product product) {
		return product.getProductName().length() > 5;
	}
	
	public static void printProductOnNameLength(Product product) {
		System.out.println("Filtered value: " + product.getProductName());
	}
	
	public static String convertProductNameToUpperCase(Product product) {
		return product.getProductName().toUpperCase();
	}
	
	public static void printProductNamesInUpperCase(String productName) {
		System.out.println("Mapped value: " + productName);
	}
}

/** 
 * Instead of peek() in above example, we could have use forEach() also. As as forEach() is terminal operation,
 * we can not have any operation further.
 */