package com.kh.chap03_class.model.vo;

public class Prodect {	// 클래스 선언부 :: 하나의 "public class" 만 존재한다 
	// 클래스 선언 구문에 사용가능한 접근제한자 : public, default
	// public으로 선언해야 다른 패키지에서 접근이 가능
	// default로 설정한 경우 같은 패키지에서만 접근 가능

	
	// 필드부
	// 상품명, 상품가격, 브랜드
	
	private String pName; 	// <- 이렇게 작성하는 방법은 선호하지 않음
	private int price;
	private String brand;
	
	
	// 생성자부
	
	public Prodect() {	// 반환부가 있으면 메서드부!!
		
	}
	
	
	// 메서드부 (set/get) + information
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setpName(String pName) {	// PName 이라 작성하지 않고 pName 으로 쓰는게 관례!!
		this.pName = pName;
	}
	
	
	
	
	// 모든 필드값을 출력해주는 information 메서드
	public void information() {
		System.out.println("상품명 : " + pName + ", 가격 : " + price + "원, 브랜드 : " +brand);
	}
	
	
	
	
}
	
	
	
	
	
	
	
	
	

