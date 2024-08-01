package com.accenture.lkm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.accenture.lkm.businessbean.EmployeeBean;
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

			entityManager.getTransaction().begin();
			EmployeeEntity employeeEntityBean = new EmployeeEntity();
			employeeEntityBean.setEmployeeName(employee.getEmployeeName());
			employeeEntityBean.setRole(employee.getRole());
			employeeEntityBean.setSalary(employee.getSalary());
			employeeEntityBean.setInsertTime(employee.getInsertTime());

			entityManager.persist(employeeEntityBean);
			entityManager.getTransaction().commit();

			employeeID = employeeEntityBean.getEmployeeId();
		} catch (Exception exception) {

			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}

		return employeeID;
	}

	public EmployeeBean findEmployeeById(Integer employeeId) throws Exception {
		EmployeeBean employee = null;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();

			EmployeeEntity employeeEntityBean = (EmployeeEntity) entityManager.find(EmployeeEntity.class, employeeId);

			if (employeeEntityBean != null) {
				// Object to return
				employee = new EmployeeBean();
				employee.setEmployeeId(employeeEntityBean.getEmployeeId());
				employee.setInsertTime(employeeEntityBean.getInsertTime());
				employee.setRole(employeeEntityBean.getRole());
				employee.setSalary(employeeEntityBean.getSalary());
				employee.setEmployeeName(employeeEntityBean.getEmployeeName());
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

	public EmployeeBean updateEmployee(EmployeeBean employeeBean) throws Exception {
		EmployeeBean employee = null;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();

			EmployeeEntity employeeEntityBean = (EmployeeEntity) entityManager.find(EmployeeEntity.class,
					employeeBean.getEmployeeId());
			if (employeeEntityBean != null) {
				entityManager.getTransaction().begin();
				employeeEntityBean.setSalary(employeeBean.getSalary());
				entityManager.getTransaction().commit();

				// Object to return
				employee = new EmployeeBean();
				employee.setEmployeeId(employeeEntityBean.getEmployeeId());
				employee.setInsertTime(employeeEntityBean.getInsertTime());
				employee.setRole(employeeEntityBean.getRole());
				employee.setSalary(employeeEntityBean.getSalary());
				employee.setEmployeeName(employeeEntityBean.getEmployeeName());
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

	public EmployeeBean deleteEmployeeById(Integer employeeId) throws Exception {
		EmployeeBean employee = null;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();

			EmployeeEntity employeeEntityBean = (EmployeeEntity) entityManager.find(EmployeeEntity.class, employeeId);
			if (employeeEntityBean != null) {
				entityManager.getTransaction().begin();
				entityManager.remove(employeeEntityBean);
				entityManager.getTransaction().commit();

				// Object to return
				employee = new EmployeeBean();
				employee.setEmployeeId(employeeEntityBean.getEmployeeId());
				employee.setInsertTime(employeeEntityBean.getInsertTime());
				employee.setRole(employeeEntityBean.getRole());
				employee.setSalary(employeeEntityBean.getSalary());
				employee.setEmployeeName(employeeEntityBean.getEmployeeName());
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
