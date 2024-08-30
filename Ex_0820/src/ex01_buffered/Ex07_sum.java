package ex01_buffered;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex07_sum {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("정수 입력 : ");
		int n = Integer.parseInt(br.readLine());
		double d = Double.parseDouble(br.readLine());
		int sum = 0;
		
		//입력받은 문자열을 미리 배열에 담아놓는다.
		String [] arr = br.readLine().split("");
		
		for(int i = 0; i < n ; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("결과");
		System.out.println(sum);
		
		
		
	}
}
