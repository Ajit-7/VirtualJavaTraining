package com.accenture.lkm.a.pojo;

public class Product {
	public void printProductNameUpper(String pname) {
		System.out.println(pname.toUpperCase());
	}
	public boolean productCategory(String category) {
		return (category.equals("electronics")) ? true : false;
	}
	public String returnProductName() {
		return "product name";
	}
	public Integer returnProductNameLength(String productName) {
		return productName.length();
	}
	public void printProductDetails(int productId, String productName) {
		System.out.println("Product Details");
		System.out.println("---------------");
		System.out.println("PID: " + productId);
		System.out.println("PName: " + productName);
	}

	public double returnDiscountedPrice(String productName, double price) {
		return productName.startsWith("A") ? (price * (15.0 / 100)) : price;
	}	

	public boolean productNameContains(String name, String str) {
		return name.contains(str);
	}

	public double computeFinalPriceAfterFixedDiscount(double price) {
		return price + (price * (15.0 / 100));
	}

	public double computeFinalPriceAfterCustomDiscount(double price, Double discount) {
		return price + (price * (discount / 100));
	}

}
