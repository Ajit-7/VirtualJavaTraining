package com.accenture.lkm.terminal;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.accenture.lkm.sampleclasses.Product;
import com.accenture.lkm.sampleclasses.ProductUtility;

/**
 * aggregate functions in Stream
 * @author deepali.shende
 *
 */
public class Tester1004MaxMinCount {
	public static void main(String[] args) {
		//getMinProductPrice();
		
		//getMaxProductPrice();
		
		//getProductHavingMaxPrice();
		
		//getOldestProduct();
		
		getTotalProducts();
	}

	//-------------------------------------------------------------------------------------------------------------
	// Get the min product price. Introduce Comparator in brief.
	//-------------------------------------------------------------------------------------------------------------
	private static void getMinProductPrice() {
		List<Double> productPrices = ProductUtility.getProductPriceList();
		Double minPrice = 
				productPrices.stream()
							 .min(
									(price1, price2) ->
									{
										int result = 0;
										if(price1 > price2) {
											result = 1;
										}
										else if(price1 < price2) {
											result = -1;
										}
										return result;
									}
								  )
							 .orElse(0.0);
		System.out.println("Min product price = " + minPrice);
	}
		
	//-------------------------------------------------------------------------------------------------------------
	// Get the max product price. Introduce Comparator in brief.
	//-------------------------------------------------------------------------------------------------------------
	private static void getMaxProductPrice() {
		List<Double> productPrices = ProductUtility.getProductPriceList();
		Double maxPrice = 
				productPrices.stream()
							 .max(
									(price1, price2) ->
									{
										int result = 0;
										if(price1 > price2) {
											result = 1;
										}
										else if(price1 < price2) {
											result = -1;
										}
										return result;
									}
								  )
							 .orElse(0.0);
		System.out.println("Max product price = " + maxPrice);
		
		System.out.println("-----------------------------------------------------");
		
		Double maxPrice1 = 
				productPrices.stream()
							 .collect(Collectors.maxBy((price1, price2) ->
									{
										int result = 0;
										if(price1 > price2) {
											result = 1;
										}
										else if(price1 < price2) {
											result = -1;
										}
										return result;
									}))
							 .orElse(0.0);
		System.out.println("Max product price = " + maxPrice1);
	}
	
	
	//-------------------------------------------------------------------------------------------------------------
	// Get the product having maximum price. comparing method will be discussed in details with sorting.
	//-------------------------------------------------------------------------------------------------------------
	private static void getProductHavingMaxPrice() {
		// Using Lambda
		Optional<Product> expensiveProduct = ProductUtility.getProductList().stream()
			    .max(Comparator.comparing(product -> product.getProductPrice()));
		System.out.println("Max price of product : " + expensiveProduct.get());
		
		System.out.println("------------------------------------------------------------------");
		
		// Using method reference
		Optional<Product> expensiveProduct1 = ProductUtility.getProductList().stream()
					    .max(Comparator.comparing(Product::getProductPrice));
				
		System.out.println("Max price of product : " + expensiveProduct1.get());
	}
	
	
	//-------------------------------------------------------------------------------------------------------------
	// Get the oldest product. comparing method will be discussed in details with sorting.
	//-------------------------------------------------------------------------------------------------------------
	private static void getOldestProduct() {
		// Using Lambda
		Optional<Product> oldProduct = ProductUtility.getProductList().stream()
			    .min(Comparator.comparing(product -> product.getDateOfManufacture()));
		System.out.println("Old product : " + oldProduct.get());
		
		System.out.println("------------------------------------------------------------------");
		
		// Using method reference
		Optional<Product> oldProduct1 = ProductUtility.getProductList().stream()
			    .min(Comparator.comparing(Product::getDateOfManufacture));
		System.out.println("Old product : " + oldProduct1.get());
	}

	
	//-------------------------------------------------------------------------------------------------------------
	// Get total product count.
	//-------------------------------------------------------------------------------------------------------------
	private static void getTotalProducts() {
		long totalProducts = ProductUtility.getProductList().stream().count();
		System.out.println("No of products : " + totalProducts);
	}
}
