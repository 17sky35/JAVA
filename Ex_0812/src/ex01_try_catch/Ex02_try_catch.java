package ex01_try_catch;

import java.util.Scanner;

public class Ex02_try_catch {
	public static void main(String[] args) {
		//나이를 입력받고
		//20살 이상이면 "성인입니다"
		//14살 이상이면 "청소년입니다"
		//7살 이상이면 "어린이입니다
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("당신의 나이를 입력하세요 >>");
			int age = sc.nextInt();//에외발생가능성이 있다
			
			if (age < 0) {
				throw new InputErrorException("입력이 잘못되었습니다.");
			}
			
			if(age > 19) {
				System.out.println("성인");
			}else if(age > 13) {
				System.out.println("청소년");
			}else if(age > 6) {
				System.out.println("어린이");
			}else {
				System.out.println("아동");
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
