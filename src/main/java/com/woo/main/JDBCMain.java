package com.woo.main;

import com.woo.main.departments.DepartmentDAO;
import com.woo.main.locations.LocationDAO;

public class JDBCMain {

	public static void main(String[] args) {
		System.out.println("Start");
		
//		DepartmentDAO dao = new DepartmentDAO();
//		try {
//			dao.getList();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		LocationDAO dao2 = new LocationDAO();
		try {
			dao2.getList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Finish");
		

	}

}
