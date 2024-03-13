package com.kr.chap01_oneVsMany.run;

import java.util.Scanner;

import com.kr.chap01_oneVsMany.model.vo.Book;

public class ObjectArrayRun {

	public static void main(String[] args) {

		Book[] arr = new Book[3];
		// arr[0] = null; -> 참조자료형은 heap영역에 할당되고 기본값을 null 값으로 자동초기화 해주기 때문.
		// arr[1] = null; -> 만약 기본자료형이었다면 기본값은 0.
		// arr[2] = null;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {

			System.out.print("책의 제목 : ");
			String title = sc.nextLine();

			System.out.print("저자 : ");
			String author = sc.nextLine();

			System.out.print("책의 가격 : ");
			int price = sc.nextInt();

			sc.nextLine();

			System.out.print("출판사 : ");
			String publisher = sc.nextLine();

			arr[i] = new Book(title, author, price, publisher);

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].information());
		}

		
		
		// 사용자에게 검색할 도서제목을 입력받아 전체 도서들의 제목과 일일이 비교하여 일치하는 도서의 가격을 알려주는 메서드

		System.out.print("검색할 책 제목 : ");
		String searchTitle = sc.nextLine();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getTitle().equals(searchTitle)) { // arr[i]의 title을 가져와(get함수) 내가 입력한 
				System.out.println(arr[i].getPrice());	 // searchTitle와 일치하는지 .equals()으로 확인하기
			}
		}
		
		
		
		
		// 만약 일치하는 도서를 찾지 못한 경우 "검색된 도서가 없습니다" 출력
	
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getTitle().equals(searchTitle)) {
				count++;
				System.out.println(arr[i].getPrice());
				break;
			}
		}

		if (count == 0) {
			System.out.println("검색된 도서가 없습니다");
		}
		
		

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
