package com.kr.chap01_oneVsMany.run;

import java.util.Scanner;

import com.kr.chap01_oneVsMany.model.vo.Book;

public class Run {

	public static void main(String[] args) {

		// 1. 기본생성자를 호출하여 객체생성후 setter메서드를 통해 각 필드에 값을 대입

		Book bk1 = new Book();

		bk1.setTitle("두잇자바프로그래밍");
		bk1.setAuthor("라이언");
		bk1.setPrice(25000);
		bk1.setPublisher("이지스 퍼블리싱");

		System.out.println(bk1.information());

		// 2. 매개변수 생성자로 객체생성과 동시에 필드에 값을 대입 (한줄로 작성이 가능하지만 가독성이 좋지않음)

		Book bk2 = new Book("자바프로그래밍 입문", "전예홍", 25000, "이지스퍼블리싱");

		// 세개의 Book객체가 필요하다는 가정하에 각각의 book객체를 별도로 관리
		// 단, 각 Book객체는 사용자에게 입력받은 값들로 채워넣을 예정

		Scanner sc = new Scanner(System.in);

		Book bk4 = null;
		Book bk5 = null;
		Book bk6 = null;

		for (int i = 0; i < 3; i++) {
			System.out.print("책의 제목 : ");
			String title = sc.nextLine();

			System.out.print("저자 : ");
			String author = sc.nextLine();

			System.out.print("책의 가격 : ");
			int price = sc.nextInt();

			sc.nextLine();

			System.out.print("출판사 : ");
			String publisher = sc.nextLine();

			if (i == 0) {
				bk4 = new Book(title, author, price, publisher);
			} else if (i == 1) {
				bk5 = new Book(title, author, price, publisher);
			} else {
				bk6 = new Book(title, author, price, publisher);
			}

		}	//여러개의 데이터를 관리하려면 여러개의 변수가 필요하다 (관리, 유지보수가 어렵다)

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
