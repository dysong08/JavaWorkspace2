package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {

	/*
	 * 배열 복사
	 * - 얕은 복사 : 배열의 주소값만 복사(원본배열에 영향을 끼칠 수 있음)
	 * - 깊은 복사 : 동일한 새로운 배열을 하나 더 만들어서 실제 내부값들을 복사(원본배열에 영향을 끼치지 않음)
	 * 
	 * */
	
	
	 //배열복사(얕은복사)
	 public void method1() {
		 
		 //원본 배열 셋팅
		 int[] origin = {1,2,3,4,5};
		 System.out.println("== 원본배열 출력 ==");
		 
		 for(int i = 0; i < origin.length; i++) {
			 System.out.print(origin[i] + " "); 	// 1 2 3 4 5
		 }
		 
		 //얕은복사
		 
		 int[] copy = origin;	// origin배열에 저장된 주소값을 copy에 대입
		 System.out.println("\n== 카피 배열 출력 ==");
		 
		 for(int i = 0; i < copy.length; i++) {
			 System.out.print(copy[i] + " ");		// 1 2 3 4 5
		 }
		 
		 copy[0] = 99;
		 
		 System.out.println("\n== 복사본 배열 변경후.. ==");
		 
		 System.out.println("== 원본배열 출력 ==");
		 
		 for(int i = 0; i < origin.length; i++) {
			 System.out.print(origin[i] + " "); 	// 99 2 3 4 5
		 }
		 
		 for(int i = 0; i < copy.length; i++) {
			 System.out.print(copy[i] + " ");		// 99 2 3 4 5
		 }
		 
		 /*
		  * 복사본 배열만 가지고 수정을 했는데도 원본배열도 함께 수정이 된다
		  *  => 앝은복사가 이루어짐 -> 배열의 주소값이 복사되어 원본과 복사본은 사실상 동일한 데이터를 공유하고 있다
		  * */
		 
		 System.out.println(origin == copy); 	// true;
		 System.out.println(origin.hashCode() == copy.hashCode()); 	 // true;
	 }
	 
	 
	 
	//깊은복사 1.
	 public void method2() {
		 
		 // 1. for문을 사용한 깊은 복사
		 // 값을 복사하기 위한 새로운 배열을 선언 및 할당하고
		 // 각 인덱스별로 내부값을 일일이 대입하는 방법
		 
		 int[] origin = {1,2,3,4,5};
		 int[] copy = new int[origin.length];
		 
		 for(int i = 0; i < copy.length; i++) {
			 
			 copy[i] = origin[i];
		 }
	 
		 // 복사가 잘 이루어졌는지 출력
		 for(int i = 0; i < copy.length; i++) {
			 System.out.print(copy[i] + " ");
		 }
	
		 
		 copy[0] = 99;
		 
		 System.out.println("\n== 복사본 배열 변경후.. ==");
		 
		 System.out.println("== 원본배열 출력 ==");
		 
		 for(int i = 0; i < origin.length; i++) {
			 System.out.print(origin[i] + " "); 		// 1 2 3 4 5 
		 }
		 
		 for(int i = 0; i < copy.length; i++) {
			 System.out.print(copy[i] + " " );			// 99 2 3 4 5
		 }
		 
	
		 System.out.println(origin == copy); 	// false;
		 System.out.println(origin.hashCode() == copy.hashCode()); 	 // false;
	 }
	 
	 
	 
	 
	 
	 
	 //자바에서 제공하는 다양한 메서드들 사용
	 public void method3() {
		 
		 // 2. 새로운 배열을 생성한 후 System클래스 내부의 arraycopy메서드 사용
		 int[] origin = {1,2,3,4,5};
		 int[] copy = new int[10];
		 
 //System.arraycopy(원본배열, 원본배열의 복사를 시작할 인덱스, 복사할 배열, 복사본 배열의 시작인덱스, 복사할 갯수);
		 System.arraycopy(origin, 0, copy, 3, 5);	//

		 // 위와 같은 내용 //
//		 int originIndex = 0;
//		 for(int i = 3; i < 3+5; i++) {
//			 copy[i] = origin[originIndex++];
//		 }
		 
		 
		 System.arraycopy(origin, 0, copy, 0, 5); 	// 1 2 3 4 5 0 0 0 0 0 
		 System.arraycopy(origin, 0, copy, 2, 5);	// 0 0 1 2 3 4 5 0 0 0
		 System.arraycopy(origin, 2, copy, 1, 3);	// 0 3 4 5 0 0 0 0 0 0
		 
	 }
	 
	 
	 
	 public void method4() {
		 
		 // 3. Arrays클래스에서 제공하는 copyOf메소드 사용
		 int[] origin = {1,2,3,4,5};
		 
		 // 복사본배열 = Arrays.copyOf(원본배열명, 복사할 갯수);
		 int[] copy = Arrays.copyOf(origin, 3);
		 
		 // 위와 같은 내용 //
//		 int[] copy2 = new int[3];
//		 for(int i = 0; i < 3; i++) {	
		 /*	if(origin.length <= i) {
		 		copy2[i] = 0; {
		 	} else {
//			copy2[i] = origin[i];						 
//		 }	*/
		 	
		 
		 for(int i = 0; i < copy.length; i++) {			 
			 System.out.print(copy[i] + " " );				 
		 }
		 
		 /*
		  * 2. System.arraycopy() : 몇번 인덱스부터 몇개를 복사본 배열의 어느 위치에 복사할건지
		  * 						세밀하게 설정 가능함
		  * 
		  * 3. Arrays.copyOf() : 무조건 원본배열의 0번 인덱스부터 내가 제시한 갯수만큼 복사가 진행됨
		  * 					 내가 제시한 길이가 원본배열보다 크다면? 그외 값들은 0으로 채워서 복사됨
		  * */
	
		 
		 
	 }
	 
	 
	 
	 public void method5() {

		 // 4. clone메소드 사용
		 int[] origin = {1,2,3,4,5};
		 int[] copy = origin.clone(); 	// 무조건 원본배열과 동일한 값을 가진 복사본 배열이 반환.
	 
	 
		 for(int i = 0; i < copy.length; i++) {			 
			 System.out.print(copy[i] + " " );				 
		 }
	 
		 /*
		  * Arrays.toString(배열)
		  *  -> 출력문 앞과 뒤에 []붙이고, 각 값마다 , 를 넣어서 하나의 "문자열"로 연이어서 출력해주는 메서드
		  *   ex) [1, 2, 3, 4, 5]
		  * */ 
		 System.out.println(Arrays.toString(copy));
		 	 
		 System.out.println(origin == copy); 		// false == 깊은복사
	 }
	 
	 
	 
	 
	 
	 
	 
	
}
