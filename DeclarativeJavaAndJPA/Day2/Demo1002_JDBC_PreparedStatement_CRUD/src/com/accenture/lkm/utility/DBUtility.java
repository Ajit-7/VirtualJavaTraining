package com.accenture.lkm.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtility {
	public static String url = "jdbc:mysql://localhost:3306/jdbcdemos";
	public static String username = "root";
	public static String password = "root";
	private static Connection connection = null;
	

	public static Connection getDBConnection() throws ClassNotFoundException, SQLException {
		//Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver registered!!");
		connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connection established!!");
		//To check JDBC Version
		/*DatabaseMetaData meta = connection.getMetaData();
		System.out.println("JDBC Version: "+meta.getJDBCMajorVersion());*/
		return connection;
	}

	public static void getDBCloseConnection() throws SQLException {
		connection.close();
	}

}
