package com.accenture.lkm.standard.interfaces.exact.signature.match;

import java.util.function.BiPredicate;

import com.accenture.lkm.a.pojo.Product;

public class Tester1011BiPredicate {
	public static void main(String[] args) {

		// RHS Method signature matches with LHS
		BiPredicate<String, String> biPredicateLength = (pname, name) -> new Product().productNameContains(pname, name);
		System.out.println(biPredicateLength.test("Samsung", "sun"));
	}
}
