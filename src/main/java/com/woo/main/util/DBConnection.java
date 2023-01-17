package com.woo.main.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
	
	public void getConnection() throws Exception {
		// 1. id
		String username = "hr";
		// 2. pw
		String password = "hr";
		// 3. url
		String url = "jdbc:oracle:thin:@localhost/XEPDB1";
		// 4. driver
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		Class.forName(driver);
		
		Connection connection = DriverManager.getConnection(url, username, password);
		
		String sql="Select * from EMPLOYEES WHERE EMPLOYEE_ID=100";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		ResultSet rs =  st.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt("EMPLOYEE_ID"));
			System.out.println(rs.getString("FIRST_NAME"));
			System.out.println(rs.getString("LAST_NAME"));
			System.out.println(rs.getString("EMAIL"));
			System.out.println(rs.getString("PHONE_NUMBER"));
			System.out.println(rs.getDate("HIRE_DATE"));
			System.out.println(rs.getString("JOB_ID"));
			System.out.println(rs.getInt("SALARY"));
			System.out.println(rs.getString("COMMISSION_PCT"));
			System.out.println(rs.getString("MANAGER_ID"));
			System.out.println(rs.getInt("DEPARTMENT_ID"));
		}
		
	}

}
