package ex02_for;

import java.util.Scanner;

public class Ex01_for {
	public static void main(String[] args) {
		
		for(int i = 0; i < 3; i++) {			
			System.out.print(i);			
		}
		
		System.out.println();
		System.out.println("-------------------------");
		
		//1 2 3 4 5 6 7 8 9 10
		
		for(int i = 1; i <11; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("-------------------------");
		
		for(int i = 10; i >0; i--) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("-------------------------");
		
		//1~20까지 홀수만 출력
		for(int i = 1; i <21; i+=2) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("-------------------------");
		
		for(int i = 1; i <11; i++) {
			if(i % 3 == 0 ) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		System.out.println("-------------------------");
		
		//1~10까지의 총합구하기
		int sum = 0;
		for(int i = 1; i <11; i++) {
			sum += i;
		}
		System.out.println("총 합 : " + sum);
		
		//정수 2~9사이의 값으로 초기화 하고
		int dan = 5;
		
		for (int i = 1 ; i <10; i++) {
			System.out.printf("%d X %d = %d\n",dan,i,dan*i);
		}
		System.out.println();
		System.out.println("-------------------------");
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("정수 입력 : ");
//		int z = sc.nextInt();
//		int sum1 = 0;
//		
//		for (int i = 1; i <= z ; i++ ) {
//			sum1 += i;
//		}
//		System.out.println("총합 : " + sum1);
//		
//		
//		int count = 0;
//		for (int i = 0; i<10 ; i++ ) {
//			System.out.print("정수 입력 : ");
//			int n =sc.nextInt();
//			if(n % 2 == 0) {
//				count ++;
//			}
//		}
//		System.out.printf("짝수는 %d 개\n",count);

		System.out.print("정수1 입력 : ");
		int x = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int y = sc.nextInt();
		
		sum = 0;
		if(x > y) {
			int temp = x;
			x = y;
			y = temp;
		}
		for(int i = x; i <= y; i++) {
			sum += i;
		}
		
		System.out.printf("%d 부터 %d까지의 총합 : %d",x,y,sum);
		
		
		
		
	}
}
