package com.woo.main.employees;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeesController {
	
	private Scanner sc;
	private EmployeesDAO employeesDAO;
	private EmployeesView employeesView;
	private EmployeesView2 employeesView2;
	
	public EmployeesController() {
		this.sc = new Scanner(System.in);
		this.employeesDAO = new EmployeesDAO();
		this.employeesView = new EmployeesView();
		this.employeesView2 = new EmployeesView2();
	}
	
	public void start() throws Exception {
		boolean check = true;
		ArrayList<EmployeesDTO> ar = null;
		while(check) {
			System.out.println("1. 사원정보리스트");
			System.out.println("2. 개별사원정보");
			System.out.println("3. 사원정보검색");
			System.out.println("4. 종	료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				ar = employeesDAO.getList();
				employeesDAO.getList();
				employeesView2.view(ar);
				break;
			case 2:
				System.out.println("사원번호를 입력하세요 : ");
				select = sc.nextInt();
//				employeesDAO.getDetail(select);
				break;
			case 3:
				System.out.println("사원 성을 입력하세요 : ");
				String add = sc.next();
				ar = employeesDAO.getFind(add);
				employeesView.view(ar);
				break;
			default:
				check = false;
			}
		}
	}
	
}
