package com.kh.chap4_field.run;

import com.kh.chap4_field.model.vo.*;

public class Run {

	public static void main(String[] args) {

		
		FieldTest1 ft = new FieldTest1();	// -> global 전역변수가 FieldTest1 내부에 할당됨
		//ft.test(100);	//test메서드 호출시 매개변수로 100값을 전달함 (지역변수 num, local 생성)
						//메서드 종료시 num, local은 소멸
		
		
		
		
		//FieldTest2 ft2 = new FieldTest2();
		
//		//public -> 어디서든 가능
//		//System.out.println(ft2.pub);
//		
//		
//		//protected -> 같은패키지에서만 접근가능
//		//System.out.println(ft2.pro);		// <- 같은 패키지가 아니기에 접근불가능, error발생
//		
//		
//		//default -> 같은패키지에서만 접근가능
//		//System.out.println(ft2.df);		// <- 같은 패키지가 아니기에 접근불가능, error발생
//		
//		
//		//private -> 해당 클래스에서만 접근가능		//
//		//System.out.println(fr2.pri);
		
		
		
		
//		System.out.println(FieldTest3.num);		// 100
//		System.out.println(FieldTest3.NUM); 	// 9
		
		
		
		
		FieldTest3 ft3 = new FieldTest3();
		
		FieldTest3.test();
		//FieldTest3.test1(); error
		
		//ft3.test();
		ft3.test1();
		
		
	  //System.out.println(FieldTest3.test());	<- error
		
		//System.out.println(FieldTest3.test1());  error
		
		
	}

}
