package com.accenture.lkm.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeeCmpPK implements Serializable{
	
	private Integer id;
	
	private Integer departmentId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	
	

}
