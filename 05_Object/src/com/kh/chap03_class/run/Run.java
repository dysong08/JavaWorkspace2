package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Prodect;

public class Run {

	public static void main(String[] args) {

		Prodect p = new Prodect();
		p.setpName("z플립4");
		p.setPrice(600000);
		p.setBrand("삼성");
		
		Prodect p2 = new Prodect();
		p2.setpName("z플립5");
		p2.setPrice(1000000);
		p2.setBrand("삼성");
		
		p.information();
		p2.information();
		
	}

}
