package com.accenture.lkm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.accenture.lkm.entity.AssetEntity;
import com.accenture.lkm.entity.EmployeeEntity;
import com.accenture.lkm.utility.JPAUtility;

public class EmployeeDAOIMPL implements EmployeeDAO {


	
	
	public void getAllEmployeesAndAssetCascade() throws Exception{
		EntityManager entityManager = null;
		
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			Query query =  entityManager.createQuery("select k from EmployeeEntity k");
			List<EmployeeEntity> listEntity = query.getResultList();
			// All the related target/AssetEntity records will fetched automatically due to CasecadeType.ALL
			for (EmployeeEntity employeeEntity : listEntity) {
				AssetEntity assetEntity = employeeEntity.getAssetEntity();
				System.out.print("Employee: "+employeeEntity.getEmployeeId()+", "+employeeEntity.getEmployeeName());
				System.out.println(", Asset: "+assetEntity.getAssetId()+", "+assetEntity.getAssetName());
			}
			
		} catch (Exception exception) {
			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
	}
	public void getAllEmployeesAndAssetInnerJoin()throws Exception {
		EntityManager entityManager = null;
		
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			
			Query query =  entityManager.createQuery("Select e from EmployeeEntity e INNER JOIN e.assetEntity a");
			List<EmployeeEntity> listEntity = query.getResultList();
			// All the related target/AssetEntity records will fetched automatically due to CasecadeType.ALL
			for (EmployeeEntity employeeEntity : listEntity) {
				AssetEntity assetEntity = employeeEntity.getAssetEntity();
				System.out.print("Employee: "+employeeEntity.getEmployeeId()+", "+employeeEntity.getEmployeeName());
				System.out.println(", Asset: "+assetEntity.getAssetId()+", "+assetEntity.getAssetName());
			}
			
		} catch (Exception exception) {
			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
	}
	
	
	public void getEmployeesWithAssetAs(String assetName)throws Exception {
		EntityManager entityManager = null;
		
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			
			Query query =  entityManager.createQuery("Select e from EmployeeEntity e where e.assetEntity.assetName=?1");
			query.setParameter(1, assetName);
			List<EmployeeEntity> listEntity = query.getResultList();
			// All the related target/AssetEntity records will fetched automatically due to CasecadeType.ALL
			for (EmployeeEntity employeeEntity : listEntity) {
				AssetEntity assetEntity = employeeEntity.getAssetEntity();
				System.out.print("Employee: "+employeeEntity.getEmployeeId()+", "+employeeEntity.getEmployeeName());
				System.out.println(", Asset: "+assetEntity.getAssetId()+", "+assetEntity.getAssetName());
			}
			
		} catch (Exception exception) {
			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
	}
	
	
}


//to explain joins, and to keep the example simple, data is printed in DAO
//otherwise it is bad practice to print data in DAO
