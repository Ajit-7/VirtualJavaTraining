package com.accenture.lkm.sampleclasses;

public class Customer {
	private Integer customerId;
	private String customerName;
	private Integer age;

	public Customer(Integer customerId, String customerName, Integer age) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.age = age;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", age=" + age + "]";
	}

	public void printDetails() {
		System.out.println("CustomerId= " + customerId + "    " + "CustomerName= " + customerName + "   " + "Age= " + age);
	}
}
