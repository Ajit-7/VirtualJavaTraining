package com.accenture.lkm.businessbean;

import java.util.Date;

public class EmployeeBean {

	private Integer employeeId;
	private String employeeName;
	private String role;
	private Date insertTime;
	private Double salary;
	
	

	public Integer getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public Date getInsertTime() {
		return insertTime;
	}

	public String getRole() {
		return role;
	}

	public Double getSalary() {
		return salary;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

}
