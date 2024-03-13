package com.kh.hw.employee.controller;

import com.kh.hw.employee.model.vo.Employee;

public class EmployeeController {

	private Employee e = new Employee();

	public void add(int empNo, String name, char gender, String phone) {
		// 매개변수 있는 생성자를 이용하여 데이터 저장하는 메소드
		// add(empNo:int, name:String, gender:char, phone:String) : void

		e = new Employee(empNo, name, gender, phone);

	}

	public void add(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		// 매개변수 있는 생성자를 이용하여 데이터 저장하는 메소드
		// add(empNo:int, name:String, gender:char, phone:String, dept:String,
		// salary:int, bonus:double) : void

		e = new Employee(empNo, name, gender, phone, dept, salary, bonus);
	}

	public void modify(String phone) {
		// setter로 정보 수정
		// 받아온 매개변수를 이용하여 해당 정보 수정

		e.setPhone(phone);

	}

	public void modify(int salary) {
		// setter로 정보 수정
		// 받아온 매개변수를 이용하여 해당 정보 수정

		e.setSalary(salary);
	}

	public void modify(double bonus) {
		// setter를 이용하여 정보 수정

		e.setBonus(bonus);
	}

	public Employee remove() {
		// 객체 e에 null을 저장하여 객체 삭제

		e = null;
		return e;
	}

	public String inform() {
		// 객체 e가 null이라면 null 반환, 아니라면 사원 정보 반환

//		if (e == null) {
//			return "사원 데이터가 없습니다.";
//		} else {
//			return e.printEmployee();
//		}

		return e == null ? null : e.printEmployee();
		
	}

}
