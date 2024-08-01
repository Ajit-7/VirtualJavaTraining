package com.accenture.lkm.ui;

import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.businessbean.MeetingBean;
import com.accenture.lkm.service.EmployeeService;
import com.accenture.lkm.utility.Factory;
import com.accenture.lkm.utility.JPAUtility;

public class UITester {

	public static void main(String[] args) {
		try {
			//insertEmployeeAndMeetings();
			
			//deletingEmployeeAndMeeting(1001);
			
			//deletingEmployeeAndMeeting(1004);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JPAUtility.closeEntityManagerFactory();
		}
	}

	static void insertEmployeeAndMeetings() {
		try {
			EmployeeService service = Factory.createEmployeeService();

			EmployeeBean employee1 = new EmployeeBean();
			employee1.setEmployeeName("Rohit");
			employee1.setRole("Sr.Analyst");

			EmployeeBean employee2 = new EmployeeBean();
			employee2.setEmployeeName("Jhony");
			employee2.setRole("Analyst");
			
			MeetingBean m1 = new MeetingBean();
			m1.setTimeSlot("10:30AM to 11:30AM");

			MeetingBean m2 = new MeetingBean();
			m2.setTimeSlot("12:30PM to 1:00PM");

			service.insertEmployeeAndMeetings(employee1,employee2, m1, m2);
			System.out.println("Employees and meetings inserted successfully!!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

	static void deletingEmployeeAndMeeting(int employeeId) {
		try {
			EmployeeService service = Factory.createEmployeeService();
			EmployeeBean employee1 = new EmployeeBean();
			employee1.setEmployeeId(employeeId);
			service.deletingEmployeeAndMeeting(employee1);;
			System.out.println("Employees and meetings deleted successfully!!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
