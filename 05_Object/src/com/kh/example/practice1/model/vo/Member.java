package com.kh.example.practice1.model.vo;

public class Member {

	
	
	//필드부
	
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	
	
	//생성자부
	
	public Member() {
	
	Member hong = new Member();
	hong.memberId = "1";
	
	hong.memberName = "홍길동";
	
	}
	
	
	
	//메서드부
	
	public void changeName(String name) {
		
		this.memberName = name;
	}
	
	
	public String printName() {
		
		System.out.println(memberName);
		return memberName;
		
	}
	
	
	
	
	
}
