package com.accenture.lkm.streamcreation;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.accenture.lkm.sampleclasses.Product;

/**
 * Map creation
 * @author deepali.shende
 *
 */
public class Tester1001Map {
	public static void main(String[] args) {
		//unordered keys, unique keys
		//Map<Integer, String> products = new HashMap<Integer, String>();
		
		//ordered keys, unique keys
		//Map<Integer, String> products = new LinkedHashMap<Integer, String>();
		
		//sorted keys, unique keys
		Map<Integer, String> products = new TreeMap<Integer, String>();
		
		products.put(1, "Fan");
		products.put(20, "Washing machine");
		products.put(3, "TV");
		
		products.forEach((id, name) -> System.out.println("ID = " + id + " Name = " + name));
		
		System.out.println("-------------------------------------------------------");
		
		// custom objects
		Map<Integer, Product> allProducts = new HashMap<Integer, Product>();
		allProducts.put(112233, new Product(1, "Fan", "N", 4000.0, LocalDate.now()));
		allProducts.put(445566, new Product(2, "TV", "N", 14000.0, LocalDate.now()));
		allProducts.put(778899, new Product(3, "Washing machine", "N", 24000.0, LocalDate.now()));
		allProducts.forEach( (orderNumber, product) -> 
							System.out.println("Order no number = " + orderNumber + " -> Product = " + product.getProductName())
						);
	} 
}
