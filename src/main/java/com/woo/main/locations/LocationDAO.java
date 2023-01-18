package com.woo.main.locations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LocationDAO {
	
	public void getList() throws Exception {
		// 1. 접속 정보 준비
		String user = "hr";
		String password = "hr";
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		// 2. DB 접속
		Connection connection = DriverManager.getConnection(url, user, password);
		System.out.println(connection);
		// 3. Query문 생성
		String sql = "SELECT * FROM LOCATIONS";
		// 4. Query문 미리 전송
		PreparedStatement st = connection.prepareStatement(sql);
		// 5. ? 세팅
		
		// 6. 최종 전송 및 결과 처리
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt("LOCATION_ID"));
			System.out.println(rs.getString("STREET_ADDRESS"));
			System.out.println(rs.getString("POSTAL_CODE"));
			System.out.println(rs.getString("CITY"));
			System.out.println(rs.getString("STATE_PROVINCE"));
			System.out.println(rs.getString("COUNTRY_ID"));
			
		}
		// 7. 연결 해제
		
		
	}
	
}
