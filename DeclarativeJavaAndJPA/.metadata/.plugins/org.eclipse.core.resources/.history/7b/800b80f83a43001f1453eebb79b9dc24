package com.accenture.lkm.streamcreation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.accenture.lkm.sampleclasses.Product;
import com.accenture.lkm.sampleclasses.ProductUtility;

/**
 * List creation
 * @author deepali.shende
 *
 */
public class Tester1001ListCollection {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//ordered, duplicates are allowed
		List<Integer> productIds1 = new ArrayList<>();
		
		// ordered, duplicates are allowed. Thread safe
		List<Integer> productIds2 = new Vector<>();
		
		// ordered, duplicates are allowed. Doubly linkedlist
		List<Integer> productId3 = new LinkedList<>();
		productId3.add(101);
		productId3.add(102);
		productId3.add(103);
		productId3.add(104);
		productId3.add(101);
		productId3.forEach(productId -> System.out.println(productId));
		
		System.out.println("--------------------------------------------");
		
		List<Product> products = ProductUtility.getProductList();
		products.forEach(product -> System.out.println(product.getProductName()));
	}
}
