package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {

	
	
	Scanner sc = new Scanner(System.in);
	
	
	SnackController scr = new SnackController();
	
	
	
	
	
	
	
	public void menu() {
		
		System.out.print("스낵류를 입력하세요");
		
		System.out.print("\n종류 : "  );
		String kind = sc.nextLine();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("맛 : ");
		String flavor = sc.nextLine();
		
		System.out.print("개수 : ");
		int numOf = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		String result = scr.saveData(kind, name, flavor, numOf, price);
		System.out.println(result);
		
		System.out.print("저장한 정보를 확인하시겠습니까?(y/n) :");
		char ch = sc.nextLine().charAt(0);
		
		
		if(ch == 'y') {
			System.out.println(scr.confirmData());
		} else if(ch == 'n') {
			return;
		}
		
		
		
		
		
	}
	
	
	
	
	
}
