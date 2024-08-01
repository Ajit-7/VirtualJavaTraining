package com.accenture.lkm.a.pojo;

public class Customer {
	public void printCustomerNameInUpper(String cname) {
		System.out.println(cname.toUpperCase());
	}
	public String returnCustomerName() {
		return "customer name";
	}
	public Integer returnCustomerNameLength(String customerName) {
		return customerName.length();
	}
	public void printCustomerDetails(int customerId, String customerName) {
		System.out.println("Customer Details");
		System.out.println("---------------");
		System.out.println("CID: " + customerId);
		System.out.println("Customer Name: " + customerName);
	}	
}