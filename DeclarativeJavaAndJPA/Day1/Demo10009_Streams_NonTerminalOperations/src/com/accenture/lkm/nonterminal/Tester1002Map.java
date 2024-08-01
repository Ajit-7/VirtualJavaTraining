package com.accenture.lkm.nonterminal;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import com.accenture.lkm.sampleclasses.Product;
import com.accenture.lkm.sampleclasses.ProductUtility;

/**
 * map() of Stream
 * @author deepali.shende
 *
 */
public class Tester1002Map {
	public static void main(String[] args) {
		// Req 1 : get list of product prices
		//req1();
		
		// Req 2 : get the product names having price 90000
		// Sequence of filter and map can not be changed as both filter and map work on different types
		//req2();
		
		// Req 3 : get the prices of all products having price >= 30000
		// Sequence of filter and map can be changed as both filter and map work on product prices
		//req3();
				
		// Req 4 : get max price
		//req4();
		
		// Req 5 : get the list of years of the product manufacturing dates
		req5();
	}

	
	//---------------------------------------------------------------------------------------------------------
	// Get list of product prices
	//---------------------------------------------------------------------------------------------------------
	private static void req1() {
		Stream<Product> products = ProductUtility.getProductList().stream();
		// using lambda
		List<Double> productPrices1 =
				 products.map(product -> product.getProductPrice())
				         .collect(Collectors.toList());
		productPrices1.forEach(price -> System.out.println(price));
		
		System.out.println("--------------------------------------------------------------");
		
		// using method reference
		List<Double> productPrices2 = ProductUtility.getProductList()
												    .stream()
												    .map(Product::getProductPrice)	
												    .collect(Collectors.toList());
		productPrices2.forEach(System.out::println);
		
		System.out.println("--------------------------------------------------------------");
		
		// using mapToDouble
		DoubleStream prices = ProductUtility.getProductList()
				                            .stream()
				                            .mapToDouble(Product::getProductPrice);
		prices.forEach(System.out::println);
	}
	
	
	//---------------------------------------------------------------------------------------------------------
	// Get the product names having price 90000.
	// Sequence of filter and map can not be changed as both filter and map work on different types.
	//---------------------------------------------------------------------------------------------------------
	private static void req2() {
		// Using Lambda
		ProductUtility.getProductList()
					  .stream()
					  .filter(product -> product.getProductPrice() == 90000)
					  .map(product -> product.getProductName())
					  .forEach(name -> System.out.println(name));
		
		System.out.println("--------------------------------------------------------------");
		
		// Using method reference
		ProductUtility.getProductList()
					  .stream()
					  .filter(Tester1002Map::checkProductForPrice1)
					  .map(Product::getProductName)
					  .forEach(System.out::println);
	}
	
	public static boolean checkProductForPrice1(Product product) {
		return product.getProductPrice() == 90000;
	}
	
	
	//---------------------------------------------------------------------------------------------------------
	// Get the prices of all products having price >= 30000.
	// Sequence of filter and map can be changed as both filter and map work on product prices.
	//---------------------------------------------------------------------------------------------------------
	private static void req3() {
		// Using Lambda
		List<Double> productPrices1 = 
		ProductUtility.getProductList()
					  .stream()
					  .filter(product -> product.getProductPrice() >= 30000)
					  .map(product -> product.getProductPrice())
					  .collect(Collectors.toList());
		productPrices1.forEach(price -> System.out.println(price));
		
		System.out.println("--------------------------------------------------------------");
		
		// Using Lambda. Sequence of filter() and map() is changed
		List<Double> productPrices2 = 
				ProductUtility.getProductList()
							  .stream()
							  .map(product -> product.getProductPrice())
							  .filter(price -> price >= 30000)
							  .collect(Collectors.toList());
		productPrices2.forEach(price -> System.out.println(price));
		
		System.out.println("--------------------------------------------------------------");
		
		// Using method reference
		List<Double> productPrices3 = 
				ProductUtility.getProductList()
							  .stream()
							  .filter(Tester1002Map::checkProductForPrice2)
							  .map(Product::getProductPrice)
							  .collect(Collectors.toList());
		productPrices3.forEach(System.out::println);
	}
	
	public static boolean checkProductForPrice2(Product product) {
		return product.getProductPrice() >= 30000;
	}
	
	
	//---------------------------------------------------------------------------------------------------------
	// Get max price
	//---------------------------------------------------------------------------------------------------------
	private static void req4() {
		// First
		double maxPrice1 = 
			ProductUtility.getProductList()
				          .stream()
				          .map(Product::getProductPrice)
				          .max((price1, price2) -> {
				        	  	int res = 0;
					            if(price1 < price2) {
					            	res = -1;
					            } else {
					            	res = 1;
					            }
					            return res;
				          	})
				          .orElse(0.0);
		System.out.println("Maximum: " + maxPrice1);
		
		System.out.println("----------------------------------------------------------");
		
		// second
		double maxPrice2 =
				ProductUtility.getProductList()
		          .stream()
		          .map(Product::getProductPrice)
		          .collect(Collectors.maxBy((price1, price2) -> {
		        	  	int res = 0;
			            if(price1 < price2) {
			            	res = -1;
			            } else {
			            	res = 1;
			            }
			            return res;
		          	 }))
		          .orElse(0.0);
		System.out.println("Maximum: " + maxPrice2);
		
		System.out.println("----------------------------------------------------------");
		
		// third
		double maxPrice3 = 
				ProductUtility.getProductList()
				.stream()
				.mapToDouble(Product::getProductPrice)
				.max()
				.orElse(0.0);
		System.out.println("Maximum : " + maxPrice3);
	}
	
	
	//---------------------------------------------------------------------------------------------------------
	// Get the list of years from the product manufacturing dates.
	//---------------------------------------------------------------------------------------------------------
	private static void req5() {
		// Using lambda
		Stream<Integer> yearList1 = 
		 ProductUtility.getProductList()
					  .stream()
					  .map(product -> product.getDateOfManufacture())
					  .map(localDate -> localDate.getYear());
		yearList1.forEach(year -> System.out.println(year));
		
		System.out.println("----------------------------------------------------------");
		
		// Using method reference
		Stream<Integer> yearList2 = 
				 ProductUtility.getProductList()
							  .stream()
							  .map(Product::getDateOfManufacture)
							  .map(LocalDate::getYear);
		yearList2.forEach(System.out::println);
	}
}
