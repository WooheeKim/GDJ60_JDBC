package com.woo.main.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.woo.main.locations.LocationDTO;
import com.woo.main.util.DBConnection;

public class EmployeesDAO {
	
	// 월급의 평균
	public void getAvg() throws Exception {
		Connection connection = DBConnection.getConnection();
		
		String sql = "SELECT AVG(SALARY), SUM(SALARY) FROM EMPLOYEES";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		rs.next();
		
		System.out.println(rs.getDouble(1));
		System.out.println(rs.getDouble(2));
		
		DBConnection.disConnect(rs, st, connection);
		
	}
	
	// method 1 : query 1
	// list
	public ArrayList<EmployeesDTO> getList() throws Exception {
		ArrayList<EmployeesDTO> ar = new ArrayList<EmployeesDTO>();
		// 1. DB 연결
		Connection connection = DBConnection.getConnection();
		// 2. Query문 생성
		String sql = "SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME, JOB_ID, DEPARTMENT_ID FROM EMPLOYEES ORDER BY HIRE_DATE DESC";		
		// 3. 미리 전송
		PreparedStatement st = connection.prepareStatement(sql);
		// 4. ?
		// 5. 최종 전송 및 결과 처리
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			EmployeesDTO employeesDTO = new EmployeesDTO();
			employeesDTO.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
			employeesDTO.setFirst_name(rs.getString("FIRST_NAME"));
			employeesDTO.setLast_name(rs.getString("LAST_NAME"));
			employeesDTO.setJob_id(rs.getString("JOB_ID"));
			employeesDTO.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
			
			ar.add(employeesDTO);
		}
		// 6. 연결 해제
		DBConnection.disConnect(rs, st, connection);
		
		return ar;
	}
	
//	public void getDtail(int employee_id) throws Exception {
//		Connection connection = DBConnection.getConnection();
//		
//		String sql = "SELECT * FROM "
//	}
	
	public ArrayList<EmployeesDTO> getFind(String search) throws Exception {
		ArrayList<EmployeesDTO> ar = new ArrayList<EmployeesDTO>();
		
		Connection connection = DBConnection.getConnection();
		
		String sql = "SELECT * FROM EMPLOYEES WHERE LAST_NAME LIKE '%'||?||'%'";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		st.setString(1, search);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			EmployeesDTO employeesDTO = new EmployeesDTO();
			employeesDTO.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
			employeesDTO.setFirst_name(rs.getString("FIRST_NAME"));
			employeesDTO.setLast_name(rs.getString("LAST_NAME"));
			employeesDTO.setEmail(rs.getString("EMAIL"));
			employeesDTO.setPhone_number(rs.getString("PHONE_NUMBER"));
			employeesDTO.setHire_date(rs.getDate("HIRE_DATE"));
			employeesDTO.setJob_id(rs.getString("JOB_ID"));
			employeesDTO.setSalary(rs.getDouble("SALARY"));
			employeesDTO.setCommission_pct(rs.getDouble("COMMISSION_PCT"));
			employeesDTO.setManager_id(rs.getInt("MANAGER_ID"));
			employeesDTO.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
			ar.add(employeesDTO);		
		}
		
		DBConnection.disConnect(rs, st, connection);
		
		return ar;
	}
	
	// INSERT
//	public int setDate(LocationDTO locationDTO) throws Exception {
//		
//		Connection connection = DBConnection.getConnection();
//		
//		String sql = "INSERT INTO EMPLOYEES (EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, JOB_ID, SALARY, COMMISSION_PCT, MANAGER_ID, DEPARTMENT_ID)"
//				+ " VALUES (EMPLOYEES_SEQ.NEXTVAL, ?, ?, ?, ?, sysdate, ?, ?, ?, ?, ?)";
//	}
	
	
}
