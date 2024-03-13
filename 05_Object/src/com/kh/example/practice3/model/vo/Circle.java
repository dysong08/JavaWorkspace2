package com.kh.example.practice3.model.vo;

public class Circle {

	
	private final static double PI = 3.14;
	private int radius = 1;
	
	
	
	
	public Circle() {}
	
	
	
	public void incrementRadius() {
		//반지름 1증가
		radius++;
		System.out.println(radius);
	}
	
	
	public void getAreaOfCircle() {
		//넓이 : 2 * 파이 * 반지름
		System.out.println(2*PI *radius);
	}
	
	
	public void getSizeOfCircle() {
		//면적 : 반지름*반지름*둘레
		System.out.println(radius*radius*PI);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
