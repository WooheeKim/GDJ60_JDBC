package com.woo.main;

import com.woo.main.util.DBConnection;

public class JDBCMain {

	public static void main(String[] args) {
		System.out.println("Start");
		DBConnection con = new DBConnection();
		
		// 참조변수명.멤버들
		try {
			con.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Finish");
		

	}

}
