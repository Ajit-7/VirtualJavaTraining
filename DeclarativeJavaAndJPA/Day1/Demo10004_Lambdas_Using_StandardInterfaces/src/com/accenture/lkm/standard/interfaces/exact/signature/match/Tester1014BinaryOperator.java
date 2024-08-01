package com.accenture.lkm.standard.interfaces.exact.signature.match;

import java.util.function.BinaryOperator;

import com.accenture.lkm.a.pojo.Product;

public class Tester1014BinaryOperator {
	public static void main(String[] args) {
		BinaryOperator<Double> finalPrice = (price, discount) -> new Product().computeFinalPriceAfterCustomDiscount(price, discount);
		System.out.println(finalPrice.apply(1000.0,10.0));
	}
}