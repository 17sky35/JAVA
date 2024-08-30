package ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodMain {
	public static void main(String[] args) throws Exception {
		int[] arr = {4,1,2,10,7,9,5,6,3,8};
		MethodTest max = new MethodTest();
		System.out.println("arr배열 최대값 : "+max.maxFinder(arr));
		
		System.out.println("---------온도구하기---------");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("정수(1or2) 입력 : ");
		int num = Integer.parseInt(br.readLine());
		switch (num) {
		case 1 -> max.fToc();
		case 2 -> max.cTof();
		}
		
	}
}
