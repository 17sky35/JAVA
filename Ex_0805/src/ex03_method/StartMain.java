package ex03_method;

import java.util.Scanner;

public class StartMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Start s = new Start();
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int number = sc.nextInt();
			if(s.check(number).equals("정답!")) {
				System.out.println(s.count + "번째 만에 정답입니다.");
				break;
			}else {
				System.out.println(s.check(number));
				s.count++;
			}
		}
		
		
	}
}
