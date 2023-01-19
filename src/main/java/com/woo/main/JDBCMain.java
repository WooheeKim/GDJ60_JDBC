package com.woo.main;

import com.woo.main.departments.DepartmentController;
import com.woo.main.departments.DepartmentDAO;
import com.woo.main.departments.DepartmentDTO;
import com.woo.main.employees.EmployeesController;
import com.woo.main.locations.LocationController;
import com.woo.main.locations.LocationDAO;
import com.woo.main.locations.LocationDTO;

public class JDBCMain {

	public static void main(String[] args) {
		System.out.println("Start");
		DepartmentController dc = new DepartmentController();
		LocationController lc = new LocationController();
		EmployeesController ec = new EmployeesController();
		DepartmentDAO departmentDAO = new DepartmentDAO();
		LocationDAO locationDAO = new LocationDAO();
		
		
		try {	
//			dc.start();
			lc.start();
//			ec.start();
//			DepartmentDTO departmentDTO = new DepartmentDTO();
//			departmentDTO.setDepartment_id(290);
//			LocationDTO locationDTO = new LocationDTO();
//			locationDTO.setCity("Roma");
//			locationDTO.setStreet_address("코리아");
//			locationDTO.setPostal_code("서울");
//			locationDTO.setCity("서울");
//			locationDTO.setState_province("서울");
//			locationDTO.setCountry_id("IT");
			
//			int result = locationDAO.deleteData(locationDTO);
//			if(result > 0) {
//				System.out.println("성공");
//			} else {
//				System.out.println("실패");
//			}
			} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Finish");
		

	}

}
