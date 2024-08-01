package com.accenture.lkm.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.businessbean.MeetingBean;
import com.accenture.lkm.entity.EmployeeEntity;
import com.accenture.lkm.entity.MeetingEntity;
import com.accenture.lkm.utility.JPAUtility;

public class EmployeeDAOIMPL implements EmployeeDAO {

	@Override
	public Integer insertEmployeeAndMeetings(EmployeeBean employeeBean1,EmployeeBean employeeBean2, MeetingBean m1, MeetingBean m2) throws Exception {
		EntityManager entityManager = null;
		int employeeId = 0;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			
			MeetingEntity meetingSlot1 = convertMeetingBeanToEntity(m1);
			MeetingEntity meetingSlot2 = convertMeetingBeanToEntity(m2);
			
			//List of Meetings for the Employees
			List<MeetingEntity>  meetings = new ArrayList<MeetingEntity>();
			meetings.add(meetingSlot1);
			meetings.add(meetingSlot2);
			
			EmployeeEntity employeeEntity1 = convertEmployeeBeanToEntity(employeeBean1);
			EmployeeEntity employeeEntity2 = convertEmployeeBeanToEntity(employeeBean2);
			
			//Employee1 and Employee2 sharing the same list of meeting
			employeeEntity1.setMeetings(meetings);
			employeeEntity2.setMeetings(meetings);
			
			// Persisting employees will persist the related meetings
			// due to cascade type all 
			entityManager.getTransaction().begin();
				entityManager.persist(employeeEntity1);
				entityManager.persist(employeeEntity2);
			entityManager.getTransaction().commit();
		} catch (Exception exception) {
			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
		return employeeId;
	}
	
	@Override
	public void deletingEmployeeAndMeeting(EmployeeBean employeeBean1) throws Exception {
		EntityManager entityManager = null;
		
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			
			//Finding/Managing EmployeeEntity manages the All associated MeetingEntities due to cascadetype.all 
			EmployeeEntity employeeEntity = entityManager.find(EmployeeEntity.class, employeeBean1.getEmployeeId());
			
			
			// Removing EmployeeEntity will remove all the related MeetingEntity
			// due to cascade type all 
			entityManager.getTransaction().begin();
				entityManager.remove(employeeEntity);
			entityManager.getTransaction().commit();
		} catch (Exception exception) {
			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
	}
	
	public static MeetingEntity convertMeetingBeanToEntity(MeetingBean meetingBean) {
		MeetingEntity meetingEntity = new MeetingEntity();
		meetingEntity.setTimeSlot(meetingBean.getTimeSlot());
		return meetingEntity;
	}

	public static EmployeeEntity convertEmployeeBeanToEntity(EmployeeBean employeeBean) {
		EmployeeEntity e1 = new EmployeeEntity();
		e1.setEmployeeName(employeeBean.getEmployeeName());
		e1.setRole(employeeBean.getRole());
		return e1;
	}
}



