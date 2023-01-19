package com.woo.main.locations;

import java.util.ArrayList;
import java.util.Scanner;

public class LocationController {
	private Scanner sc;
	private LocationDAO locationDAO;
	private LocationView locationView;
	private LocationInput locationInput;
	
	public LocationController() {
		this.sc = new Scanner(System.in);
		this.locationDAO = new LocationDAO();
		this.locationView = new LocationView();
		this.locationInput = new LocationInput();
	}
	
	public void start() throws Exception {
		boolean check = true;
		ArrayList<LocationDTO> ar = null;
		while(check) {
			System.out.println("1. 지역 리스트");
			System.out.println("2. 지역상세정보");
			System.out.println("3. 주소 검색");
			System.out.println("4. 지역 추가");
			System.out.println("5. 지역 삭제");
			System.out.println("6. 지역 수정");
			System.out.println("7. 종	료");
			int select = sc.nextInt();
			LocationDTO locationDTO = null;
			
			switch(select) {
			case 1:
				ar = locationDAO.getList();
				locationDAO.getList();
				locationView.view(ar);
				break;
			case 2:
				System.out.println("지역번호를 입력하세요 : ");
				select = sc.nextInt();
				locationDAO.getDetail(select);
				break;
			case 3:
				System.out.println("검색할 주소 입력 : ");
				String add = sc.next();
				ar = locationDAO.getFind(add);
				
			case 4:
				locationDTO = locationInput.setData();
				select = locationDAO.setData(locationDTO);
				
				if(select>0) {
					locationView.view("추가 성공");
				} else {
					locationView.view("추가 실패");
				}
				break;
			case 5:
				locationDTO = locationInput.deleteData();
				select = locationDAO.deleteData(locationDTO);
				String msg = "삭제 실패";
				if(select>0) {
					msg = "삭제 성공";
				}
				locationView.view(msg);
				break;
			case 6:
				locationDTO = locationInput.updateDate();
				if(select>0) {
					locationView.view("수정 성공");
				} else {
					locationView.view("수정 실패");
				}
				break;
			default:
				check =! check;
			}
			
		}
		
	}
	
}
