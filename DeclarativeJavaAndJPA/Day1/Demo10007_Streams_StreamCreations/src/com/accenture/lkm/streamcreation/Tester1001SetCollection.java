package com.accenture.lkm.streamcreation;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.accenture.lkm.sampleclasses.Product;

/**
 * Set creation
 * @author deepali.shende
 *
 */
public class Tester1001SetCollection {
	public static void main(String[] args) {
		//unordered, unique elements
		Set<Integer> productIds1 = new HashSet<>();
		
		// ordered, unique elements
		Set<Integer> productIds2 = new LinkedHashSet<>();
		
		// sorted, unique elements
		Set<Integer> productIds3 = new TreeSet<>();
		productIds3.add(101);
		productIds3.add(106);
		productIds3.add(103);
		productIds3.add(102);
		productIds3.add(105);
		
		productIds3.forEach(productId -> System.out.println(productId));
		
		System.out.println("--------------------------------------------");
		
		Set<Product> products = new HashSet<>();
		products.add(new Product(1, "Phone", "N", 20000.0, LocalDate.now()));
		products.add(new Product(2, "Fan", "N", 5000.0, LocalDate.now()));
		products.add(new Product(3, "Mouse", "N", 2000.0, LocalDate.now()));
		products.forEach(product -> System.out.println(product));
	}
}
