package com.kh.chap6_method.controller;

public class MethodTest2 {

	public static int count = 100;
	int count2 = 10;
	
	
	/*
	 * static 메서드
	 * [표현법]
	 * 접근제한자 static [예약어] 반환형 메서드명([매개변수]) {
	 * 		수행할코드
	 * 		return 반환값;
	 * }
	 * 
	 * 
	 * - 호출시 객체 생성할 필요 없음
	 * - 프로그램 시작시에 정적메모리 영역에 메서드가 저장되어 있기 때문
	 * - 클래스명.메서드명(전달값); 으로 호출이 가능
	 * - 예약어, 매개변수, return; 은 생략 가능
	 * 
	 * */
	
	
	
	public static void method1() {
		System.out.println("매개변수x 반환값x");
	}
	
	public static String method2() {
		return "매개변수는 없고요 반환값은 있어";
	}
	
	public static void method3(String name, int age) {
		System.out.println(name + "님은 " + age + "살 입니다");
	}
	
	
	public static int method4(int num1) {
		/*
		 * ** static메서드 안에서는 static이 아닌 필드는 접근불가하다 **
		 * static메서드는 프로그램 시작시 정적메모리영역에 들어가는데
		 * static으로 선언된 필드도 함께 같은 메모리영역에 생성되므로 가능하다
		 * 
		 * 하지만 static이 아닌 일반 필드는 static메서드 및 변수들과 생성시점이 다르기 때문에
		 * 같은 영역안에서 사용이 불가능하다
		 * 
		 * 즉, static메서드 안에서는 static필드만 사용가능하다
		 * */
		
		return num1 * count;
	//	return num1 * count2;  <- count2가 일반필드기 때문에 접근불가 -> error
	}
	
	
	
	
	
	
	
}
