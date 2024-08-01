package com.accenture.lkm.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.utility.JPAUtility;

public class EmployeeDAOIMPL implements EmployeeDAO {

	public List<String> retrieveEmployeeNames() throws Exception{
		// TODO Auto-generated method stub
		EntityManager entityManager = null;
		List<String> listOfNames=null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			
			Query query = entityManager.createQuery("SELECT e.employeeName FROM EmployeeEntity e");
			listOfNames = query.getResultList();
			
		} catch (Exception exception) {
			throw exception;
		}
		finally{
			if(entityManager!=null){
				entityManager.close();
			}
		}
		return listOfNames;

	}

	
	public List<EmployeeBean> retrieveEmployeeIdAndNameColumns() throws Exception{
		// TODO Auto-generated method stub
		EntityManager entityManager = null;
		List<EmployeeBean> listEmployeeBean = null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			Query query = entityManager.createQuery("select k.employeeId, k.employeeName FROM EmployeeEntity k");
			List<Object> nameAndIdList = query.getResultList();
			listEmployeeBean = new ArrayList<EmployeeBean>();
			for(Object e: nameAndIdList) {
				Object[] obj = (Object[])e;
				EmployeeBean employeeBean  = new EmployeeBean();
				employeeBean.setEmployeeId((Integer)obj[0]);
				employeeBean.setEmployeeName((String)obj[1]);
				listEmployeeBean.add(employeeBean);
			}
			
		} catch (Exception exception) {
			throw exception;
		}
		finally{
			if(entityManager!=null){
				entityManager.close();
			}
		}
		return listEmployeeBean;

	}
}
