package com.accenture.lkm.nonterminal;

import java.util.List;
import java.util.stream.Collectors;

import com.accenture.lkm.sampleclasses.Product;
import com.accenture.lkm.sampleclasses.ProductUtility;

/**
 * limit() of Stream
 * @author deepali.shende
 *
 */
public class Tester1005Limit {
	public static void main(String[] args) {
		// Req 1 : get first 5 products
		req1();
	}

	
	//---------------------------------------------------------------------------------------------------------
	// Get first 5 products
	// Note: Passing negative value results in IllegalArgumentException.
	//---------------------------------------------------------------------------------------------------------
	private static void req1() {
		List<Product> products =
				ProductUtility.getProductList()
							   .stream()
							   .limit(5)
							   .collect(Collectors.toList());
		products.forEach(System.out::println);
	}
}

