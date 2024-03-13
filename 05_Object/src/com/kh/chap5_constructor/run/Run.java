package com.kh.chap5_constructor.run;

import com.kh.chap5_constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {

		//User user = new User("111", "1234","123");
		
		
		User user = new User("asd", "12345", "123", 35, 'm');
		
		System.out.println(user.information());
		
		
	}

}
