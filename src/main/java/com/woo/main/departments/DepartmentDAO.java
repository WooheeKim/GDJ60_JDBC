package com.woo.main.departments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DepartmentDAO {
	
	public void getList() throws Exception {
		// 1. 접속 정보 준비
		String user = "hr";
		String password = "hr";
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		// 2. DB 접속
		Connection connection = DriverManager.getConnection(url, user, password);
		System.out.println(connection);
		// 3. Query문 생성
		String sql = "SELECT * FROM DEPARTMENTS";
		// 4. Query문 미리 전송
		PreparedStatement st = connection.prepareStatement(sql);
		// 5. ? 세팅
		
		// 6. 최종 전송 및 결과 처리
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt("DEPARTMENT_ID"));
			System.out.println(rs.getString("DEPARTMENT_NAME"));
			System.out.println(rs.getInt("MANAGER_ID"));
			System.out.println(rs.getInt("LOCATION_ID"));
		}
		// 7. 연결 해제
		
		
	}

}
