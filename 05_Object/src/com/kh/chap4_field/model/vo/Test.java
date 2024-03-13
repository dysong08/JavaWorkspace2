package com.kh.chap4_field.model.vo;

public class Test {

	public static void main(String[] args) {

		
		FieldTest2 ft2 = new FieldTest2();
		
		//public -> 어디서든 가능
		System.out.println(ft2.pub);
		
		
		//protected -> 같은패키지에서만 접근가능
		System.out.println(ft2.pro);
		
		
		//default -> 같은패키지에서만 접근가능
		System.out.println(ft2.df);
		
		
		
		
		
		
	}

}
