package com.accenture.lkm.dao;

import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.businessbean.MeetingBean;

public interface EmployeeDAO {
	
	public Integer insertEmployeeAndMeetings(EmployeeBean employeeBean1,EmployeeBean employeeBean2, MeetingBean m1, MeetingBean m2) throws Exception;

	public void deletingEmployeeAndMeeting(EmployeeBean employeeBean1)
			throws Exception;
	
}
