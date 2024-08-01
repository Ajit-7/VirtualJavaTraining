package com.accenture.lkm.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.utility.DBUtility;

public class EmployeeDAOImpl implements EmployeeDAO {

	private static Connection connection = null;
	private static Statement statement = null;

	public int insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		try {
			int rowsUpdateCount = 0;
			int id = bean.getEmployeeId();
			String ename = bean.getEmployeeName();
			String role = bean.getRole();
			Date insertTime = new java.sql.Date(bean.getInsertTime().getTime());
			double salary = bean.getSalary();

			String insertdata = "insert into employee values('" + id + "','" + ename + "','" + role + "','" + insertTime
					+ "','" + salary + "')";
			connection = DBUtility.getDBConnection();
			statement = connection.createStatement();
			rowsUpdateCount = statement.executeUpdate(insertdata);
			if (rowsUpdateCount > 0) {
				System.out.println("Employee Registered Successfully: " + rowsUpdateCount);
			} else {
				System.out.println("OOps some thing went wrong!! we are on process..");
			}
			return rowsUpdateCount;
		} catch (Exception e) {
			throw e;
		} finally {
			DBUtility.getDBConnectionClose();
		}
	}

	@Override
	public void readEmployee() throws ClassNotFoundException, SQLException {
		try {
			String retrievedata = "select * from employee";
			connection = DBUtility.getDBConnection();
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(retrievedata);

			System.out.println("Retrieveing Query executed!!");
			while (resultSet.next()) {
				System.out.println("Employee ID: " + resultSet.getInt("employeeId") + "\nEmployee name: "
						+ resultSet.getString("employeeName") + "\nRole: " + resultSet.getString("role")
						+ "\nInsert Time: " + resultSet.getString("insertTime") + "\nSalary: "
						+ resultSet.getDouble("salary"));
				System.out.println("===========================================");
			}
		} catch (Exception e) {
			throw e;
		} finally {
			DBUtility.getDBConnectionClose();
		}
	}

	@Override
	public void updateEmployee(EmployeeBean bean) throws SQLException, ClassNotFoundException {
		try {
			int id = bean.getEmployeeId();
			double modifiedsalary = bean.getSalary();
			String updatedata = "update employee set salary=" + modifiedsalary + "where employeeId= '" + id + "'";
			connection = DBUtility.getDBConnection();
			statement = connection.createStatement();
			int rowsUpdateCount = statement.executeUpdate(updatedata);
			if (rowsUpdateCount > 0) {
				System.out.println("Employee Updated Successfully: " + rowsUpdateCount);
			} else {
				System.out.println("OOps some thing went wrong!! we are on process..");
			}
		} catch (Exception e) {
			throw e;
		} finally {
			DBUtility.getDBConnectionClose();
		}

	}

	@Override
	public void deleteEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		try {
			int id = bean.getEmployeeId();
			String deletedata = "DELETE from employee WHERE employeeId = '" + id + "'";
			connection = DBUtility.getDBConnection();
			statement = connection.createStatement();
			int deleteRowsUpdateCount = statement.executeUpdate(deletedata);
			if (deleteRowsUpdateCount > 0) {
				System.out.println("Employee deleted Successfully: " + deleteRowsUpdateCount);
			} else {
				System.out.println("OOps some thing went wrong!! we are on process..");
			}
		} catch (Exception e) {
			throw e;
		} finally {

			DBUtility.getDBConnectionClose();
		}
	}

}
