package com.accenture.lkm.standard.interfaces.exact.signature.match;

import java.util.function.BiConsumer;

import com.accenture.lkm.a.pojo.Product;

public class Tester1010BiConsumer {
	public static void main(String[] args) {

		// Product
		// printProductDetails
		// RHS Method signature matches with LHS
		System.out.println("printProductDetails");
		System.out.println("===================");
		BiConsumer<Integer, String> product = (productId, productName) -> new Product().printProductDetails(productId,
				productName);
		product.accept(12, "Sony");

	}

}
