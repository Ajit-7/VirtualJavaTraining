package com.accenture.lkm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.entity.EmployeeEntity;
import com.accenture.lkm.utility.JPAUtility;

public class EmployeeDAOIMPL implements EmployeeDAO {

	public Integer addEmployeeTest1(EmployeeBean employee) throws Exception{
		// TODO Auto-generated method stub
		Integer employeeID = 0;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();

			EmployeeEntity employeeEntity = new EmployeeEntity();
			employeeEntity.setEmployeeName(employee.getEmployeeName());
			employeeEntity.setRole(employee.getRole());
			employeeEntity.setSalary(employee.getSalary());
			employeeEntity.setInsertTime(employee.getInsertTime());
			System.out.println("EmployeeEntity  before transaction: "+entityManager.contains(employeeEntity));
			entityManager.getTransaction().begin();
			System.out.println("EmployeeEntity  after transaction begin, before persist: "+entityManager.contains(employeeEntity));
			entityManager.persist(employeeEntity);
			
			System.out.println("EmployeeEntity  after transaction begin, after persist: "+entityManager.contains(employeeEntity));
			System.out.println("EmployeeEntity  after employee entity persist, Employee name: "+employeeEntity.getEmployeeName());
			employeeEntity.setEmployeeName("SDF");
			entityManager.getTransaction().commit();
			System.out.println("EmployeeEntity  after transaction commit: "+entityManager.contains(employeeEntity));
			System.out.println("EmployeeEntity  after transaction commit, Employee name: "+employeeEntity.getEmployeeName());
			System.out.println("Check in database record:"+employeeEntity.getEmployeeName()+", name will be udpated to SDF");
			employeeID = employeeEntity.getEmployeeId();
			entityManager.clear();
			System.out.println("EmployeeEntity  after clearing entity manager: "
					+ entityManager.contains(employeeEntity));
		
		} catch (Exception exception) {

			throw exception;
		}
		finally{
			if(entityManager!=null){
				entityManager.close();
			}
		}

		return employeeID;
	}
	
	public Integer addEmployeeTest2(EmployeeBean employee) throws Exception{
		// TODO Auto-generated method stub
		Integer employeeID = 0;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();

			EmployeeEntity employeeEntity = new EmployeeEntity();
			employeeEntity.setEmployeeName(employee.getEmployeeName());
			employeeEntity.setRole(employee.getRole());
			employeeEntity.setSalary(employee.getSalary());
			employeeEntity.setInsertTime(employee.getInsertTime());
			System.out.println("EmployeeEntity  before transaction: "+entityManager.contains(employeeEntity));
			entityManager.getTransaction().begin();
			System.out.println("EmployeeEntity  after transaction begin, before persist: "+entityManager.contains(employeeEntity));
			entityManager.persist(employeeEntity);
			
			System.out.println("EmployeeEntity  after transaction begin, after persist: "+entityManager.contains(employeeEntity));
			System.out.println("EmployeeEntity  after employee entity persist, Employee name: "+employeeEntity.getEmployeeName());
			entityManager.getTransaction().commit();
			System.out.println("EmployeeEntity  after transaction commit: "+entityManager.contains(employeeEntity));
			
			entityManager.getTransaction().begin();
			System.out.println("EmployeeEntity  after transaction commit New Transaction: "+entityManager.contains(employeeEntity));
				employeeEntity.setEmployeeName("SDF");
			entityManager.getTransaction().commit();
			System.out.println("EmployeeEntity  after transaction commit New Transaction: "+entityManager.contains(employeeEntity));
			System.out.println("EmployeeEntity  after transaction commit, Employee name: "+employeeEntity.getEmployeeName());
			employeeID = employeeEntity.getEmployeeId();
			System.out.println("Check in database record:"+employeeEntity.getEmployeeName()+", name will be udpated to SDF");
			
			entityManager.clear();
			System.out.println("EmployeeEntity  after clearing entity manager: "
					+ entityManager.contains(employeeEntity));
		
		} catch (Exception exception) {

			throw exception;
		}
		finally{
			if(entityManager!=null){
				entityManager.close();
			}
		}

		return employeeID;
	}
	
	public Integer addEmployeeTest3(EmployeeBean employee) throws Exception{
		// TODO Auto-generated method stub
		Integer employeeID = 0;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();

			EmployeeEntity employeeEntity = new EmployeeEntity();
			employeeEntity.setEmployeeName(employee.getEmployeeName());
			employeeEntity.setRole(employee.getRole());
			employeeEntity.setSalary(employee.getSalary());
			employeeEntity.setInsertTime(employee.getInsertTime());
			System.out.println("EmployeeEntity  before transaction: "+entityManager.contains(employeeEntity));
			entityManager.getTransaction().begin();
			System.out.println("EmployeeEntity  after transaction begin, before persist: "+entityManager.contains(employeeEntity));
			entityManager.persist(employeeEntity);
			
			System.out.println("EmployeeEntity  after transaction begin, after persist: "+entityManager.contains(employeeEntity));
			System.out.println("EmployeeEntity  after employee entity persist, Employee name: "+employeeEntity.getEmployeeName());
			entityManager.getTransaction().commit();
			System.out.println("EmployeeEntity  after transaction commit: "+entityManager.contains(employeeEntity));
			
			System.out.println("Entity  manager cleared...., all managed entities are detached");		
			entityManager.clear();
			System.out.println("EmployeeEntity  after clearing entity manager: "+ entityManager.contains(employeeEntity));
			entityManager.getTransaction().begin();
			System.out.println("EmployeeEntity  after transaction commit New Transaction: "+entityManager.contains(employeeEntity));
				employeeEntity.setEmployeeName("SDF");
			entityManager.getTransaction().commit();
			System.out.println("EmployeeEntity  after transaction commit New Transaction: "+entityManager.contains(employeeEntity));
			System.out.println("EmployeeEntity  after transaction commit, Employee name: "+employeeEntity.getEmployeeName()+", but check in DB....????");
			employeeID = employeeEntity.getEmployeeId();
			System.out.println("Check in database record:"+employeeEntity.getEmployeeName()+", name will not be udpated to SDF");
		} catch (Exception exception) {

			throw exception;
		}
		finally{
			if(entityManager!=null){
				entityManager.close();
			}
		}

		return employeeID;
	}

	
}
