package com.accenture.lkm.ui;

import java.sql.Connection;
import java.sql.SQLException;

import com.accenture.lkm.utility.DBUtility;

public class UITester {

	private static Connection connection = null;

	public static void main(String[] args) {
		try {
			connection = DBUtility.getDBConnection();
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			if (connection != null) {
				try {
					DBUtility.getDBDestroyConnection();
				} catch (SQLException e) {
					e.getMessage();
				}
			} else {
				System.out.println("OOPs some thing problem with DB utility!!");
			}

		}
	}
}
