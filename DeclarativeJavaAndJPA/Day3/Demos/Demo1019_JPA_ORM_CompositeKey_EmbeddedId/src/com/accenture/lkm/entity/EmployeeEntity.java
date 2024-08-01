package com.accenture.lkm.entity;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Employee_Composite_Key")
public class EmployeeEntity {

	@EmbeddedId
	private EmployeeCmpPK employeeCmpPK;
	private String name;	
	private String role;
	
	@Temporal(TemporalType.DATE)
	private Date insertTime;
	
	private Double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Date getInsertTime() {
		return insertTime;
	}
	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public EmployeeCmpPK getEmployeeCmpPK() {
		return employeeCmpPK;
	}
	public void setEmployeeCmpPK(EmployeeCmpPK employeeCmpPK) {
		this.employeeCmpPK = employeeCmpPK;
	}
	
	
}
