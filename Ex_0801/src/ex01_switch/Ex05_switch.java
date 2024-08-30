package ex01_switch;

import java.util.Scanner;

public class Ex05_switch {
	public static void main(String[] args) {
		//10이하의 숫자를 키보드에서 입력받는다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("10이하의 숫자 입력 : ");
		int num = sc.nextInt();
		
		switch(num%2) {
		case 0 ->
			System.out.println("짝수");
		case 1 ->
			System.out.println("홀수");
		default ->
			System.out.println("잘못 입력");
		}
		
		System.out.println("월 입력:");
		int month = sc.nextInt();
		int day = 0;
		
		switch(month) {
		case 1,3,5,7,8,10,12 ->	day = 31;
		case 4,6,9,11 -> day = 30;
		case 2 -> day = 28;
		default -> System.out.println("잘못 입력.1~12 숫자만 입력");
		}
		System.out.printf("%d월은 %d일 까지 있습니다.\n",month,day);
		
		//------------------------------------------------------------
		//계산기 프로그램 만들기
		//두 개의 정수를 입력받는다.
		//산술연산자를 문자열에 담는다 "+"
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자(+,-,*,/) 중 입력 : ");
		String op = sc.next();
		
		switch(op) {
		case "+" :
			System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
			break;
		case "-" :
			System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
			break;
		case "*" :
			System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
			break;
		case "/" :
			System.out.printf("%d / %d = %f\n",num1,num2,num1/(double)num2);
			break;
		default :
			System.out.println("잘못입력");
		}
		
		
		
	}
}
