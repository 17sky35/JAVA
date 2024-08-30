package ex03_String;

import java.util.Scanner;

public class Ex05_String {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String s = sc.next();

		 System.out.println("결과 : " + solution(s));

	}

	public static boolean solution(String s) {
//		if(s.length() ==4 || s.length() ==6) {
//			for(int i = 0; i < s.length(); i++) {
//				if(s.charAt(i) < 48 || s.charAt(i) > 57) {
//					return false;
//				}				
//			}
//			return true;
//		}else {
//			return false;
//		}
//		
		if (s.length() == 4 || s.length() == 6) {
			try {
				int n = Integer.parseInt(s);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		return false;
	}
}
