package com.ty.zoo.util;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import static com.ty.zoo.util.AppConstants.*;

	public class ConnectionObject {
		
//		private static final String Driver = "com.mysql.cj.jdbc.Driver";
//		private static final String URL = "jdbc:mysql://localhost:3306/jdbc_zoo";
//		private static final String USER = "root";
//		private static final String PASSWORD = "root";
		
		static {
			try {
				Class.forName(DRIVER);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		public static Connection getConnection() {
			try {
				return DriverManager.getConnection(URL, USER, PASSWORD);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}

		
		
	}







