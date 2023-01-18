package com.woo.main.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
	
	public void getConnection() throws Exception {
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
//		// 3. Query문 생성
//		String sql="Select * from EMPLOYEES WHERE EMPLOYEE_ID=100";
//		// 4. Query문 DB로 미리 전송(Query문 미완성)
//		PreparedStatement st = connection.prepareStatement(sql);
//		// 5. ? 값 세팅(Option이라 생략)
//		
//		// 6. 최종 전송 및 결과 처리
//		ResultSet rs =  st.executeQuery();
//		
//		while(rs.next()) {
//			System.out.println(rs.getInt("EMPLOYEE_ID"));
//			System.out.println(rs.getString("FIRST_NAME"));
//			System.out.println(rs.getString("LAST_NAME"));
//			System.out.println(rs.getString("EMAIL"));
//			System.out.println(rs.getString("PHONE_NUMBER"));
//			System.out.println(rs.getDate("HIRE_DATE"));
//			System.out.println(rs.getString("JOB_ID"));
//			System.out.println(rs.getInt("SALARY"));
//			System.out.println(rs.getString("COMMISSION_PCT"));
//			System.out.println(rs.getString("MANAGER_ID"));
//			System.out.println(rs.getInt("DEPARTMENT_ID"));
//		}
//		
//		// 7. 연결 해제
		
	}

}
