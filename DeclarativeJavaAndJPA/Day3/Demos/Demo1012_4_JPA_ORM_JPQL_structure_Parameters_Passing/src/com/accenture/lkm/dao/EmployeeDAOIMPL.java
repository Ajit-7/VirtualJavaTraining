package com.accenture.lkm.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.entity.EmployeeEntity;
import com.accenture.lkm.utility.JPAUtility;

public class EmployeeDAOIMPL implements EmployeeDAO {

	public List<EmployeeBean> retrieveEmployeeDetailsWithInSalaryRange1(Double lowerBound,Double upperBound) throws Exception{
		// TODO Auto-generated method stub
		EntityManager entityManager = null;
		List<EmployeeBean> listEmployeeBean = null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			
			Query query = entityManager.createQuery("SELECT e FROM EmployeeEntity e where e.salary>=?1 and e.salary<=?2");
			query.setParameter(1, lowerBound);
			query.setParameter(2, upperBound);
			List<EmployeeEntity> employeeList = query.getResultList();
			listEmployeeBean = new ArrayList<EmployeeBean>();
			for(EmployeeEntity e: employeeList) {
				EmployeeBean employeeBean  = new EmployeeBean();
				employeeBean.setEmployeeId(e.getEmployeeId());
				employeeBean.setEmployeeName(e.getEmployeeName());
				employeeBean.setInsertTime(e.getInsertTime());
				employeeBean.setRole(e.getRole());
				employeeBean.setSalary(e.getSalary());
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

	
	public List<EmployeeBean> retrieveEmployeeDetailsWithInSalaryRange2(Double lowerBound,Double upperBound) throws Exception{
		// TODO Auto-generated method stub
		EntityManager entityManager = null;
		List<EmployeeBean> listEmployeeBean = null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			

			Query query = entityManager.createQuery("SELECT e FROM EmployeeEntity e where e.salary>= :lb and e.salary<= :ub");
			query.setParameter("lb", lowerBound);
			query.setParameter("ub", upperBound);
			List<EmployeeEntity> employeeList = query.getResultList();
			listEmployeeBean = new ArrayList<EmployeeBean>();
			for(EmployeeEntity e: employeeList) {
				
				EmployeeBean employeeBean  = new EmployeeBean();
				employeeBean.setEmployeeId(e.getEmployeeId());
				employeeBean.setEmployeeName(e.getEmployeeName());
				employeeBean.setInsertTime(e.getInsertTime());
				employeeBean.setRole(e.getRole());
				employeeBean.setSalary(e.getSalary());
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
