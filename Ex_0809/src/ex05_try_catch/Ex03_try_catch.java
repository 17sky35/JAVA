package ex05_try_catch;

import java.util.Scanner;

public class Ex03_try_catch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = "";
		try {
			System.out.print("정수 : ");
			num = sc.next();
			int n = Integer.parseInt(num);//예외발생 가능성
			System.out.println("입력받은 수 : " + n);
			
		} catch (Exception e) {
			
			System.out.println( "결과 : " + num + "는(은) 정수가 아닙니다.");
		}
		System.out.println("프로그램 종료");
	}
}