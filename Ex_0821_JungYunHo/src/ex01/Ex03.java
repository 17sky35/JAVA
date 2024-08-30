package ex01;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		
		int[] a = {500, 100, 50, 10};
		int num = new Random().nextInt(500)+1;
		num = num*10;
		System.out.println(num + "원");
		for(int i = 0 ; i < a.length; i++) {
			int x = num/a[i];
			System.out.println(a[i]+"원 : " + x + "개");
			num = num%a[i];
		}
		
	}
}
