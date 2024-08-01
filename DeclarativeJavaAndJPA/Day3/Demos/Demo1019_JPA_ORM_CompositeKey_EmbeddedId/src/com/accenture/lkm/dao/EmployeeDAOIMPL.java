package com.accenture.lkm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.entity.EmployeeCmpPK;
import com.accenture.lkm.entity.EmployeeEntity;
import com.accenture.lkm.utility.JPAUtility;

public class EmployeeDAOIMPL implements EmployeeDAO {

	public Integer addEmployee(EmployeeBean employee) throws Exception {
		// TODO Auto-generated method stub
		Integer employeeID = 0;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			
			EmployeeCmpPK cmpPk = new EmployeeCmpPK();
			cmpPk.setId(employee.getId());
			cmpPk.setDepartmentId(employee.getDepartmentId());
			
			EmployeeEntity employeeEntity = new EmployeeEntity();
			employeeEntity.setName(employee.getName());
			employeeEntity.setRole(employee.getRole());
			employeeEntity.setSalary(employee.getSalary());
			employeeEntity.setInsertTime(employee.getInsertTime());
			employeeEntity.setEmployeeCmpPK(cmpPk);
			
			entityManager.getTransaction().begin();
				entityManager.persist(employeeEntity);
			entityManager.getTransaction().commit();
			employeeID = employee.getId();
		} catch (Exception exception) {
			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}

		return employeeID;
	}

	@Override
	public EmployeeBean getEmployeeDetails(int employeeId, int deptId) {
		// TODO Auto-generated method stub
		EmployeeBean employee = null;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			
			EmployeeCmpPK cmpPk = new EmployeeCmpPK();
			cmpPk.setId(employeeId);
			cmpPk.setDepartmentId(deptId);
			
			EmployeeEntity entity= entityManager.find(EmployeeEntity.class, cmpPk);
			
			if(entity!=null){
				employee = new EmployeeBean();
				employee.setDepartmentId(entity.getEmployeeCmpPK().getDepartmentId());
				employee.setId(entity.getEmployeeCmpPK().getId());
				employee.setInsertTime(entity.getInsertTime());
				employee.setName(entity.getName());
				employee.setRole(entity.getRole());
				employee.setSalary(entity.getSalary());
			}
			
			
		} catch (Exception exception) {
			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}

		return employee;
	}

}
