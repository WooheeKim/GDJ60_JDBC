package com.woo.main.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
	
	public static Connection getConnection() throws Exception {
		// 1. 접속 정보 준비
		/// id
		String username = "hr";
		/// pw
		String password = "hr";
		/// url
//		String url = "jdbc:oracle:thin:@ip:port/ServiceName";
//		String url = "jdbc:oracle:thin:@ip:port:SID";
		String url = "jdbc:oracle:thin:@localhost/XEPDB1";
		/// driver
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		Class.forName(driver);
		
		// 2. DB 접속 실행
		Connection connection = DriverManager.getConnection(url, username, password);
		return connection;
		
	}
	
	public static void disConnect(ResultSet rs, PreparedStatement st, Connection connection) throws Exception {
		rs.close();
		st.close();
		connection.close();
	}

}
