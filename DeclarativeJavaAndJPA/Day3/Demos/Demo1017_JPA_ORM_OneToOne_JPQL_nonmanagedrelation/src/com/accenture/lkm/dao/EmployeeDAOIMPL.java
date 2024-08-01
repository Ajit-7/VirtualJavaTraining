package com.accenture.lkm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.accenture.lkm.entity.AssetEntity;
import com.accenture.lkm.entity.EmployeeEntity;
import com.accenture.lkm.utility.JPAUtility;

public class EmployeeDAOIMPL implements EmployeeDAO {


	public void getAllEmployeesWithAssetDetails() throws Exception {
		// TODO Auto-generated method stub
		EntityManager entityManager = null;
		List<Object> listEmployee = null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();

			Query query = entityManager.createQuery("select emp, ast from EmployeeEntity emp, AssetEntity ast where emp.assetId=ast.assetId");
					listEmployee = query.getResultList();
			for(Object obj: listEmployee) {
				Object[] objarr = (Object[])obj;
				EmployeeEntity employee = (EmployeeEntity)objarr[0];
				AssetEntity asset = (AssetEntity)objarr[1];
				 
				System.out.print(employee.getEmployeeId() + ", "	+ employee.getEmployeeName()+ ", "+ employee.getRole() + ", "+ employee.getSalary()+",");
				System.out.println(asset.getAssetId()+", "+asset.getAssetBrandName()+", "+asset.getValidityYears());
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

// to explain joins, and to keep the example simple, data is printed in DAO
// otherwise it is bad practice to print data in DAO
