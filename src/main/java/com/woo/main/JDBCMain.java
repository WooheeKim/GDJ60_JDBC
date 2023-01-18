package com.woo.main;

import com.woo.main.departments.DepartmentController;
import com.woo.main.departments.DepartmentDAO;
import com.woo.main.employees.EmployeesController;
import com.woo.main.locations.LocationController;
import com.woo.main.locations.LocationDAO;

public class JDBCMain {

	public static void main(String[] args) {
		System.out.println("Start");
//		DepartmentController dc = new DepartmentController();
//		LocationController lc = new LocationController();
		EmployeesController ec = new EmployeesController();
		
		try {	
//			dc.start();
//			lc.start();
			ec.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Finish");
		

	}

}
