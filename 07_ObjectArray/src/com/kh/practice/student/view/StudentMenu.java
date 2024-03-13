package com.kh.practice.student.view;

import com.kh.practice.Student;
import com.kh.practice.student.controller.StudentController;

public class StudentMenu {

	
	
	private StudentController ssm = new StudentController();

	
	
	
	public StudentMenu() {

		System.out.println("===========학생 정보 출력==========");
		// StudentController에 printStudent()의 반환 값을 통해 학생 정보 출력

		Student[] sArr = ssm.printStudent();
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i].inform());
		}

		
		System.out.println("==========학생 성적 출력==========");
		// StudentController에 avgScore()를 통해 점수 합계와 평균 출력

		double[] dArr = ssm.avgScore();
		System.out.println("학생 점수 합계 : " + (int) dArr[0]);
		System.out.println("학생 점수 평균 : " + (int) dArr[1]);

		
		System.out.println("==========성적 결과 출력==========");
		// 학생의 점수가 CUT_LINE 미만이면 재시험 대상, 이상이면 통과 출력

		for (int i = 0; i < sArr.length; i++) {

			System.out.printf("%s학생은 %s입니다.", sArr[i].getName(),
					sArr[i].getScore() < StudentController.cut_line ? "재시험 대상" : "통과");

		}

	}
	
	
	
	
}
