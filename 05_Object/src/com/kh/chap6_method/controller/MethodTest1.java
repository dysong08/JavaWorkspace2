package com.kh.chap6_method.controller;

public class MethodTest1 {

	/*
	 * 메서드
	 * [표현법]
	 * 접근제한자 [예약어] 반환할값의자료형 메서드명([매개변수]) {
	 * 		수행할코드
	 * 
	 * 		[return 반환할값;] (반환형이 void인 경우 생략가능)
	 * } 
	 * 
	 * 한 번 정의하면 내가 원하는만큼 호출해서 재사용할 수 있다.
	 * 
	 * */
	
	
	
	// 1. 매개변수가 없고 반환값도 없는 메서드
	
	public void method1() {
		System.out.println("매개변수와 반환값이 둘다없는 메서드 입니다.");
		//return;		// <= jvm이 자동으로 return; 생성해줌
	}
	
	
	// 2. 매개변수가 없고 반환값은 있는 메서드
	
	public int method2() {
		System.out.println("매개변수는 없고 반환값은 있는 메서드 입니다.");
		return 1;
		
	} //실행클래스에 ex) int a = mt1.method2();
	  //			System.out.println(a);
	
	
	
	// 3. 매개변수가 있고 반환값은 없는 메서드
	
	public void method3(int num1, int num2) {
		System.out.println("매개변수가 있고 반환값은 없는 메서드 입니다.");
		
		//num1과 num2값을 비교하여 결과를 출력하는 메서드
		//더 큰값 : xx
		//더 작은값 : xx
		
		int min = num1;
		int max = num2;
		if(num1 > num2) {
			min = num2;
			max = num1;
		}
		System.out.println("더 큰값 : " +max);
		System.out.println("더 작은값 : " +min);
	}	// 실행클래스에 ex) mt1.method3(1, 5);
	
	
	
	// 4. 매개변수도 있고 반환값도 있는 메서드
	
	public int method4(int a, int b) {
		System.out.println("매개변수? 있습니다. 반환값도 있습니다");
		return a*b;
	}	// 실행클래스에 ex) int result = mt1.method4(2, 10);
		//				System.out.println(result);
	
	
	
	
	
	
	
	
	
	
	
}
