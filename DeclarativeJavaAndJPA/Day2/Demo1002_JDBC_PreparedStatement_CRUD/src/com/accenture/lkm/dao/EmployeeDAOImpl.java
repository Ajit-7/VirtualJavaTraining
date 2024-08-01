package com.accenture.lkm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.accenture.lkm.businessbean.EmployeeBean;
import com.accenture.lkm.utility.DBUtility;

public class EmployeeDAOImpl implements EmployeeDAO {

	private static Connection connection = null;
	private static PreparedStatement pstatement = null;

	@Override
	public int insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException, Exception {
		try {
			int rowsInsertCount = 0;
			int id = bean.getEmployeeId();
			String ename = bean.getEmployeeName();
			String role = bean.getRole();
			java.sql.Date insertTime = new java.sql.Date(bean.getInsertTime().getTime());
			double salary = bean.getSalary();
			String insertdata = "insert into employee (employeeId, employeeName, role, insertTime, salary) values(?,?,?,?,?)";
			connection = DBUtility.getDBConnection();
			PreparedStatement pstatement = connection.prepareStatement(insertdata);
			pstatement.setInt(1, id);
			pstatement.setString(2, ename);
			pstatement.setString(3, role);
			pstatement.setDate(4, insertTime);
			pstatement.setDouble(5, salary);
			rowsInsertCount = pstatement.executeUpdate();
			// Remaining Code goes here
			return rowsInsertCount;
		} catch (Exception e) {
			throw e;
		} finally {
			DBUtility.getDBCloseConnection();
		}
	}

	@Override
	public void readEmployee() throws ClassNotFoundException, SQLException {
		try {
			String retrievedata = "select * from employee";
			connection = DBUtility.getDBConnection();
			PreparedStatement pstatement = connection.prepareStatement(retrievedata);
			ResultSet resultSet = pstatement.executeQuery();
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
			DBUtility.getDBCloseConnection();
		}
	}

	@Override
	public void updateEmployee(EmployeeBean bean) throws SQLException, ClassNotFoundException {
		try {
			int id = bean.getEmployeeId();
			double modifiedsalary = bean.getSalary();
			String updatedata = "update employee set salary=? where employeeId= ?";
			connection = DBUtility.getDBConnection();
			pstatement = connection.prepareStatement(updatedata);
			pstatement.setInt(1, id);
			pstatement.setDouble(2, modifiedsalary);
			boolean rowsUpdateCount = pstatement.execute();
			if (rowsUpdateCount != true) {
				System.out.println("Employee update successfully!!");
			} else {
				System.out.println("OOps some thing went wrong!! we are on process..");
			}
		} catch (Exception e) {
			throw e;
		} finally {

			DBUtility.getDBCloseConnection();
		}
	}

	@Override
	public void deleteEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		try {
			int id = bean.getEmployeeId();
			String deletedata = "DELETE from employee WHERE employeeId = ?";
			connection = DBUtility.getDBConnection();
			pstatement = connection.prepareStatement(deletedata);
			pstatement.setInt(1, id);
			int deletedRowsUpdateCount = pstatement.executeUpdate();
			if (deletedRowsUpdateCount > 0) {
				System.out.println("Employee deleted successfully!!" + deletedRowsUpdateCount);
			} else {
				System.out.println("OOps some thing went wrong!! we are on process..");
			}
		} catch (Exception e) {
			throw e;
		} finally {
			DBUtility.getDBCloseConnection();
		}

	}

}
