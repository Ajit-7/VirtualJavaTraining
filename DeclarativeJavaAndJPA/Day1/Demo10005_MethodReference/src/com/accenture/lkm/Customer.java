package com.accenture.lkm;

public class Customer {
	private int customerID;
	private String customerName;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerID, String customerName) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	//**********************************************************
		//******************Static**************************
		
		public static void printNameUpperStatic(String cname) {
			System.out.println(cname.toUpperCase());
		}

		public static void displayDetails(int customerId, String customerName){
			System.out.println("Customer Details Static");
			System.out.println("---------------");
			System.out.println("CID: " + customerId);
			System.out.println("CName: " + customerName);
		}
		
		// **********************************************************
		//******************non-Static**************************
		public void printCustomerDetails(int customerId, String customerName) {
			System.out.println("Customer Details");
			System.out.println("---------------");
			System.out.println("CID: " + customerId);
			System.out.println("CName: " + customerName);
		}

		public void printNameUpper(String cname) {
			System.out.println(cname.toUpperCase());
		}

		// ***********************************************************

}
