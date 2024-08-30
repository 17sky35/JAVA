package ex04_if;

import java.util.Scanner;

public class Ex04_if_elseif {
	public static void main(String[] args) {
		int favorite = 7;
		
		if(favorite > 5) {
			System.out.println("좋아하는 숫자가 5보다 큽니다.");
		}else if(favorite == 7) {//if가 참이라 else if문은 실행안됨
			System.out.println("좋아하는 숫자는 7입니다.");
		}
		
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * System.out.print("나이 입력 : "); int age = sc.nextInt(); //sc.nextInt(); =
		 * 객체명.메서드명(); -> 해당 클래스에 있는 메서드의 호출
		 * 
		 * if(age >= 20) { 
		 * 		System.out.println("성인"); 
		 * }else if(age >= 14) {
		 * 		System.out.println("청소년"); 
		 * }else if(age >= 7) {
		 * 		System.out.println("어린이");
		 * }else { 
		 * 		System.out.println("유아"); 
		 * }
		 */
		
		//-----------------------------------------------------------
		
		System.out.println("성적 입력 : ");
		int score = sc.nextInt();
		char grade;
		
		if(score <= 100 && score >= 90) {
			grade = 'A';
		}else if(score >= 80) {
			grade = 'B';
		}else if(score >= 70) {
			grade = 'C';
		}else if(score >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.printf("점수는 %d점이고 성적은 %c 입니다.",score,grade);
	}
}
