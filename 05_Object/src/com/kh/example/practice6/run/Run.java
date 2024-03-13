package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {

		Book bk = new Book();
		bk.inform();
		
		
		Book bk2 = new Book("타이틀","퍼블리쉬","어터");
		bk2.inform();
		
		Book bk3 = new Book("타이틀","퍼블리쉬","어터", 20000, 5);
		bk3.inform();
		
		
	}

}
