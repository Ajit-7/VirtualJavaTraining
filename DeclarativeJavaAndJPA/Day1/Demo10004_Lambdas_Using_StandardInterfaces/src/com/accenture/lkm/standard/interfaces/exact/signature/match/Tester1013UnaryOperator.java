package com.accenture.lkm.standard.interfaces.exact.signature.match;

import java.util.function.UnaryOperator;

import com.accenture.lkm.a.pojo.Product;


public class Tester1013UnaryOperator {

	public static void main(String[] args) {
		UnaryOperator<Double> finalPrice = (price) -> new Product().computeFinalPriceAfterFixedDiscount(price);
		System.out.println(finalPrice.apply(1000.0));
	}
}
