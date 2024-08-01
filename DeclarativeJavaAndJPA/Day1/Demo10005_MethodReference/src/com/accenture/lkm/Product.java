package com.accenture.lkm;

public class Product {
	private int productId;
	private String productName;
	
	public Product() {	}

	public Product(int productId, String productName) {
		this.productId = productId;
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	//**********************************************************
	//******************Static**************************
	
	public static void printNameUpperStatic(String pname) {
		System.out.println(pname.toUpperCase());
	}

	public static void displayDetails(int productId, String productName){
		System.out.println("Product Details Static");
		System.out.println("---------------");
		System.out.println("PID: " + productId);
		System.out.println("PName: " + productName);
	}
	
	// **********************************************************
	//******************non-Static**************************
	public void printProductDetails(int productId, String productName) {
		System.out.println("Product Details");
		System.out.println("---------------");
		System.out.println("PID: " + productId);
		System.out.println("PName: " + productName);
	}

	public void printNameUpper(String pname) {
		System.out.println(pname.toUpperCase());
	}

	// ***********************************************************
}
