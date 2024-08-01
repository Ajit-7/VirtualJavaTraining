package com.accenture.lkm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.entity.EmployeeEntity;
import com.accenture.lkm.utility.JPAUtility;

public class EmployeeDAOIMPL implements EmployeeDAO {

	@Override
	public EmployeeBean findEmployeeById(int employeeId) throws Exception {
		// TODO Auto-generated method stub
		EntityManager entityManager = null;
		EmployeeBean employeeBean = null;
		EmployeeEntity employeeEntity = null;
		try {
			EntityManagerFactory entityManagerFactory  = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			System.out.println("EmployeeEntity  before transaction begin, before find: "+entityManager.contains(employeeEntity));
			entityManager.getTransaction().begin();
			System.out.println("EmployeeEntity  after transaction begin, before find: "+entityManager.contains(employeeEntity));
			employeeEntity =(EmployeeEntity) entityManager.find(EmployeeEntity.class, employeeId);
			System.out.println("EmployeeEntity  after transaction begin, after find: "+entityManager.contains(employeeEntity));
			entityManager.getTransaction().commit();
			System.out.println("EmployeeEntity  after transaction commit, after find: "+entityManager.contains(employeeEntity));
			
			if(employeeEntity!=null){
				employeeBean= new EmployeeBean();
				employeeBean.setEmployeeId(employeeEntity.getEmployeeId());
				employeeBean.setEmployeeName(employeeEntity.getEmployeeName());
				employeeBean.setInsertTime(employeeEntity.getInsertTime());
				employeeBean.setRole(employeeEntity.getRole());
				employeeBean.setSalary(employeeEntity.getSalary());
			} 
			employeeId = employeeBean.getEmployeeId();
			entityManager.clear();
			System.out.println("EmployeeEntity  after clearing entity manager: "+entityManager.contains(employeeEntity));
		} catch (Exception exception) {
			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
		
		return employeeBean;
	}

}
