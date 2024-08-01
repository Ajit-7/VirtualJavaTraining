package com.accenture.lkm.optionalmethods;

public class NoProductPresentException extends Exception  {
	public NoProductPresentException() {
		System.out.println("Product not present");
	}
}
