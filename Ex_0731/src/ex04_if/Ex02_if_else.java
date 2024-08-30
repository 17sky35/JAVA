package ex04_if;

import java.util.Scanner;

public class Ex02_if_else {
	public static void main(String[] args) {
		
		int num = 5;
		if(num > 4) {
			System.out.println(num + "은 4보다 큽니다.");
		}else {
			System.out.println(num + "은 4보다 작습니다.");
		}
		
		//------------------------------------------
		//두개의 숫자 비교하기
		int a = 4;
		int b = 10;
		
		if(a > b){
			System.out.println("a가 b보다 큽니다.");
		}else if( a == b){
			System.out.println("a는 b와 같습니다.");
		}else {
			System.out.println("a는 b보다 작습니다.");
		}
		
		
		System.out.println("-------------------------------");
		
	
		int x=15;		
		if(x > 10 && x < 20) {
			System.out.println("true");
		}
		
		
		char ch='X';
		if(ch == 'x' || ch == 'X') {
			System.out.println("true");
		}
		
		//아스키 코드 대문자65~90 / 소문자97~122
		char ch2='Z';
		if((ch2 >= 'a' && ch2 <= 'z') || (ch2 >= 'A' && ch2 <= 'Z')) {
			System.out.println("true");
		}
		//
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ball 개수 : ");
		int ball = sc.nextInt();
		int box = 5;
		if(ball%box == 0) {
			System.out.println(ball/box);
		}else {
			System.out.println(ball/box+1);
		}
		
		
		
				
			
	}
}
