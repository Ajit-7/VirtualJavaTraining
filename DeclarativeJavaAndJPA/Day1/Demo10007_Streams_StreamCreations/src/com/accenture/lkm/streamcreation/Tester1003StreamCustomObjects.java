package com.accenture.lkm.streamcreation;

import java.util.List;
import java.util.stream.Stream;

import com.accenture.lkm.sampleclasses.Product;
import com.accenture.lkm.sampleclasses.ProductUtility;

/**
 * Stream creation of Custom objects
 * @author deepali.shende
 *
 */
public class Tester1003StreamCustomObjects {
	public static void main(String[] args) {
		List<Product> productList = ProductUtility.getProductList();
		Stream<Product> allProducts = productList.stream();
		allProducts.forEach(p -> p.printDetails());
	}
}
