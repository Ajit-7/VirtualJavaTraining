package com.accenture.lkm.nonterminal;

import java.util.Set;
import java.util.stream.Collectors;

import com.accenture.lkm.sampleclasses.Product;
import com.accenture.lkm.sampleclasses.ProductUtility;

/**
 * Stream Filter
 * @author deepali.shende
 *
 */
public class Tester1001Filter {
	public static void main(String[] args) {
		//Req 1 : get the products having price  more than 30000
		req1();
		
		//Req 2 : get the products starting with I
		//req2();
		
		//Req 3 : get the products starting with I and price greater than 30000
		//req3();
		
		//Req 4 : get the products having manufacturing date before 2020
		//req4();
		
		//Req 5 : get the products having product category as 'N' in a Set
		//req5();
	}

	//----------------------------------------------------------------------------------------------------------
	// Req 1 : get the products having price greater than 30000
	//----------------------------------------------------------------------------------------------------------
	private static void req1() {
		// using lambda
		ProductUtility.getProductList()
					  .stream()
					  .filter(product -> product.getProductPrice() > 30000)
					  .forEach(product -> System.out.println(product));
		
		System.out.println("--------------------------------------");
		
		// using method reference
		ProductUtility.getProductList()
					  .stream()
					  .filter(Tester1001Filter::checkProductPrice)
					  .forEach(product -> System.out.println(product));
	}
	
	public static boolean checkProductPrice(Product product) {
		return product.getProductPrice() > 30000;
	}
	
	// -----------------------------------------------------------------------------------------------------------
	// Get the products starting with I
	// ---------------------------------------------------------------------------------------------------------
	private static void req2() {
		// Using Lambda
		ProductUtility.getProductList()
		  			  .stream()
		  			  .filter(product -> product.getProductName().startsWith("I"))
		  			  .forEach(product -> System.out.println(product));
		
		System.out.println("--------------------------------------");
		
		// Using method reference
		ProductUtility.getProductList()
					  .stream()
					  .filter(Tester1001Filter::checkProductName)
					  .forEach(System.out::println);
	}
	
	public static boolean checkProductName(Product product) {
		return product.getProductName().startsWith("I");
	}
	

	// -----------------------------------------------------------------------------------------------------------
	// Get the products starting with I and price greater than 30000
	// ---------------------------------------------------------------------------------------------------------
	private static void req3() {
		// Using Lambda
		ProductUtility.getProductList()
					  .stream()
					  .filter(product -> product.getProductName().startsWith("I") && product.getProductPrice() > 30000)
					  .forEach(product -> System.out.println(product));
		
		System.out.println("--------------------------------------");
		
		// Using Method reference
		ProductUtility.getProductList()
					  .stream()
					  .filter(Tester1001Filter::checkProductNameAndPrice)
					  .forEach(System.out::println);
		
		System.out.println("--------------------------------------");
		
		// Nesting of filter using Lambda
		ProductUtility.getProductList()
					  .stream()
					  .filter(product -> Tester1001Filter.checkProductName(product))
					  .filter(product -> product.getProductPrice() > 30000)
					  .forEach(product -> System.out.println(product));
		
		System.out.println("--------------------------------------");
		
		// Nesting of filter using method reference
		ProductUtility.getProductList()
					  .stream()
					  .filter(Tester1001Filter::checkProductName)
					  .filter(Tester1001Filter::checkProductPrice)
					  .forEach(System.out::println);
	}
	
	public static boolean checkProductNameAndPrice(Product product) {
		return product.getProductName().startsWith("I") && product.getProductPrice() > 30000;
	}
	
	
	// -----------------------------------------------------------------------------------------------------------
	// Get the products having manufacturing date  before 2020
	// ---------------------------------------------------------------------------------------------------------
	private static void req4() {
		// Using Lambda
		ProductUtility.getProductList()
					  .stream()
					  .filter(product -> product.getDateOfManufacture().getYear() < 2020)
					  .forEach(product -> System.out.println(product));
		
		System.out.println("-----------------------------------------------------");
		
		// Using method reference
		ProductUtility.getProductList()
		  			  .stream()
		  			  .filter(Tester1001Filter::checkProductManufacturingYear)
		  			  .forEach(System.out::println);
	}
	
	public static boolean checkProductManufacturingYear(Product product) {
		return product.getDateOfManufacture().getYear() < 2020;
	}
	
	
	// -----------------------------------------------------------------------------------------------------------
	// Get the products having product category as 'N' in a Set
	// ---------------------------------------------------------------------------------------------------------
	private static void req5() {
		// Using Lambda
		Set<Product> products1 = 
				ProductUtility.getProductList()
				              .stream()
				              .filter(product -> product.getProductCategory().equals("N"))
				              .collect(Collectors.toSet());
		products1.forEach(product -> System.out.println(product));
		
		System.out.println("-----------------------------------------------------");
		
		// Using method reference
		Set<Product> products2 = 
				ProductUtility.getProductList()
				              .stream()
				              .filter(Tester1001Filter::filterCategories)
				              .collect(Collectors.toSet());
		products2.forEach(System.out::println);
	}
	
	public static boolean filterCategories(Product product) {
		return product.getProductCategory().equals("N");
	}
}
