package ex03_String;

import java.util.Scanner;

public class Ex03_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String ori = sc.next();
		String rev ="";
		for(int i = ori.length(); i > 0 ; i--) {
			rev += ori.charAt(i-1);
		}	
		
		if (ori.equals(rev)) {
			System.out.println(ori + "는 회문입니다.");
		}else {
			System.out.println(ori + "는 회문이 아닙니다.");
		}
		
	}
}