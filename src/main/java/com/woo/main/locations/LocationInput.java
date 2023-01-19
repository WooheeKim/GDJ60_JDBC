package com.woo.main.locations;

import java.util.Scanner;

public class LocationInput {
	private Scanner sc;
	
	public LocationInput() {
		sc = new Scanner(System.in);
	}
	
	// 추가
	public LocationDTO setData() {
		LocationDTO locationDTO = new LocationDTO();
		System.out.println("지역 아이디 입력 : ");
		locationDTO.setLocation_id(sc.nextInt());
		System.out.println("주소 입력 : ");
		locationDTO.setStreet_address(sc.next());
		System.out.println("도로명 입력 : ");
		locationDTO.setPostal_code(sc.next());
		System.out.println("도시 입력 : ");
		locationDTO.setCity(sc.next());
		System.out.println("지방 입력 : ");
		locationDTO.setState_province(sc.next());
		System.out.println("지역 코드 입력 : ");
		locationDTO.setCountry_id(sc.next());
		return locationDTO;
	}
	
	// 삭제
	public LocationDTO deleteData() {
		LocationDTO locationDTO = new LocationDTO();
		System.out.println("삭제할 지역 아이디 입력 : ");
		locationDTO.setLocation_id(sc.nextInt());
		return locationDTO;
	}
	
	// 수정
	public LocationDTO updateDate() {
		LocationDTO locationDTO = new LocationDTO();
		
		
		
		
		return locationDTO;
	}
	
}
