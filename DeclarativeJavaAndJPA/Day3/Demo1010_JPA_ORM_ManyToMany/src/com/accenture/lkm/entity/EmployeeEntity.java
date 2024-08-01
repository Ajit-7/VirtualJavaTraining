package com.accenture.lkm.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "employee")
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer employeeId;
	
	@Column(name = "name")
	private String employeeName;

	private String role;

	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="employee_meeting", 
	                joinColumns={@JoinColumn(name="my_db_employee_id") }, 
	                inverseJoinColumns={@JoinColumn(name="my_db_meeting_id")}) 
	private List<MeetingEntity> meetings;

	public List<MeetingEntity> getMeetings() {
		return meetings;
	}

	public void setMeetings(List<MeetingEntity> meetings) {
		this.meetings = meetings;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
