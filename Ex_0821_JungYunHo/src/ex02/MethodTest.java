package ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodTest {

	public int maxFinder(int[] arr) {
		int max = 0;
		for (int x : arr) {
			if (x > max) {
				max = x;
			}
		}
		return max;
	}// maxFinder
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public void fToc() throws Exception {
		
		System.out.print("온도 입력 : ");
		int n = Integer.parseInt(br.readLine());
		double a =  (n-32)/1.8;
		System.out.println("화씨를 섭씨로 바꾼 결과 : " + a);
	}//fToc화씨를 섭씨로

	public void cTof () throws Exception {
		System.out.print("온도 입력 : ");
		int n = Integer.parseInt(br.readLine());
		double a = 1.8*n+32;
		System.out.println("섭씨를 화씨로 바꾼 결과 : " + a);
	}//cTof섭씨를 화씨로

}
