package com.accenture.lkm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.accenture.lkm.businessbean.AssetBean;
import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.entity.AssetEntity;
import com.accenture.lkm.entity.EmployeeEntity;
import com.accenture.lkm.utility.JPAUtility;

public class EmployeeDAOIMPL implements EmployeeDAO {

	public void removeEmployeeAndAsset(EmployeeBean employee) throws Exception{
		EntityManager entityManager = null;
		int employeeId = 0;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			entityManager.getTransaction().begin();
			employeeId = employee.getEmployeeId();
			EmployeeEntity e1 =  entityManager.find(EmployeeEntity.class,employeeId);
			System.out.println("Employee Entity "+e1);
			System.out.println("Asset Entity"+e1.getAssetEntity());
			entityManager.remove(e1);
			entityManager.getTransaction().commit();
		} catch (Exception exception) {
			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
	}
	public Integer insertAssetWithEmployee(EmployeeBean employeeBean, AssetBean assetBean) throws Exception {
		EntityManager entityManager = null;
		int employeeId = 0;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();

			AssetEntity assetEntity = new AssetEntity();
			assetEntity.setAssetName(assetBean.getAssetName());
			assetEntity.setAssetBrandName(assetBean.getAssetBrandName());
			assetEntity.setValidityYears(assetBean.getValidityYears());

			EmployeeEntity employeeEntity = new EmployeeEntity();
			employeeEntity.setEmployeeName(employeeBean.getEmployeeName());
			employeeEntity.setRole(employeeBean.getRole());
			employeeEntity.setSalary(employeeBean.getSalary());
			employeeEntity.setInsertTime(employeeBean.getInsertTime());
			employeeEntity.setAssetEntity(assetEntity);

			entityManager.getTransaction().begin();
				entityManager.persist(employeeEntity);
			entityManager.getTransaction().commit();

			employeeId = employeeEntity.getEmployeeId();
		} catch (Exception exception) {
			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
		return employeeId;
	}
	
	
	
}
