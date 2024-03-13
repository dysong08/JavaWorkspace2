package com.kh.example.practice6.model.vo;

public class Book {

	//필드부
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	
	
	
	//생성자부
	
	public Book() {}
	
	public Book(String title, String publicher, String author) {
		
		this.title = title;
		this.publisher = publicher;
		this.author = author;
	}
	
	public Book(String title, String publicher, String author, int price, double discountRate) {
		
		this(title, publicher, author);
		this.price = price;
		this.discountRate = discountRate;
	}
	
	
	
	//메서드부
	
	public void  inform()  {
		System.out.println(title + " " + publisher + " " + author + " " + price + " " + discountRate );
		 
	}


	
	
}
