package com.accenture.lkm.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.accenture.lkm.businessbean.CustomerBean;
import com.accenture.lkm.entity.CustomerEntity;
import com.accenture.lkm.utility.JPAUtility;

public class CustomerDAOIMPL implements CustomerDAO {

	public Integer addCustomer(CustomerBean customer) throws Exception {
		// TODO Auto-generated method stub
		Integer customerID = 0;
		EntityManager entityManager = null;
		try {

			// Your Code goes here
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();

			entityManager.getTransaction().begin();
			CustomerEntity customerEntity = new CustomerEntity();
			customerEntity.setCustomerName(customer.getCustomerName());
			customerEntity.setPurchaseDate(customer.getPurchaseDate());
			customerEntity.setBill(customer.getBill());

			entityManager.persist(customerEntity);
			entityManager.getTransaction().commit();
			
			customerID = customerEntity.getCustomerId();


		} catch (Exception exception) {

			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}

		return customerID;
	}

	public CustomerBean findCustomerById(Integer customerId) throws Exception {
		CustomerBean customer = null;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();

			CustomerEntity customerEntity = (CustomerEntity) entityManager.find(CustomerEntity.class, customerId);

			if (customerEntity != null) {
				customer = new CustomerBean();
				customer.setBill(customerEntity.getBill());
				customer.setCustomerId(customerEntity.getCustomerId());
				customer.setCustomerName(customerEntity.getCustomerName());
				customer.setPurchaseDate(customer.getPurchaseDate());
			}

		} catch (Exception exception) {

			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}

		return customer;
	}

	public CustomerBean updateCustomerBillById(CustomerBean customerBean) throws Exception {
		CustomerBean customerRet = null;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();

			CustomerEntity customerEntity = (CustomerEntity) entityManager.find(CustomerEntity.class,
					customerBean.getCustomerId());

			if (customerEntity != null) {

				entityManager.getTransaction().begin();
				customerEntity.setBill(customerBean.getBill());
				entityManager.getTransaction().commit();
				customerRet = new CustomerBean();
				customerRet.setBill(customerEntity.getBill());
				customerRet.setCustomerId(customerEntity.getCustomerId());
				customerRet.setCustomerName(customerEntity.getCustomerName());
				customerRet.setPurchaseDate(customerRet.getPurchaseDate());
			}

		} catch (Exception exception) {

			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}

		return customerRet;
	}

	public CustomerBean deleteCustomerById(Integer customerId) throws Exception {
		CustomerBean customerRet = null;
		EntityManager entityManager = null;
		try {

			// Your Code goes here
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			CustomerEntity customerEntity = (CustomerEntity) entityManager.find(CustomerEntity.class, customerId);
			if (customerEntity != null) {
				entityManager.getTransaction().begin();
				entityManager.remove(customerEntity);
				entityManager.getTransaction().commit();

				customerRet = new CustomerBean();
				customerRet.setCustomerId(customerEntity.getCustomerId());
				customerRet.setPurchaseDate(customerEntity.getPurchaseDate());
				customerRet.setBill(customerEntity.getBill());
				customerRet.setCustomerName(customerEntity.getCustomerName());
			}

		} catch (Exception exception) {

			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}

		return customerRet;
	}

	@Override
	public List<CustomerBean> getCustomersWithinDateRange(Date lowerBound, Date upperBound) throws Exception {
		List<CustomerBean> listCustomer = null;
		EntityManager entityManager = null;
		try {

			// Your Code goes here
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			
			Query query = entityManager.createNamedQuery("findAllCustomersWithinDateRange");
			query.setParameter(1, lowerBound);
			query.setParameter(2, upperBound);
			List<CustomerEntity> customerList = query.getResultList();
			listCustomer = new ArrayList<CustomerBean>();
			for(CustomerEntity c: customerList) {
				CustomerBean customerBean  = new CustomerBean();
				customerBean.setCustomerId(c.getCustomerId());
				customerBean.setCustomerName(c.getCustomerName());
				customerBean.setPurchaseDate(c.getPurchaseDate());
				customerBean.setBill(c.getBill());
				listCustomer.add(customerBean);
			}

		} catch (Exception exception) {

			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}

		return listCustomer;
	}

	@Override
	public Integer updateCustomerBillByName(String name, Double bill) throws Exception {
		Integer ret = null;
		EntityManager entityManager = null;
		try {

			// Your Code goes here
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			
			Query query = entityManager.createQuery("update CustomerEntity k set k.bill=?22 where k.customerName= :p1");
			query.setParameter(22, bill);
			query.setParameter("p1", name);
			
			entityManager.getTransaction().begin();
			ret = query.executeUpdate();
			entityManager.getTransaction().commit();	

		} catch (Exception exception) {

			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}

		return ret;
	}

}
