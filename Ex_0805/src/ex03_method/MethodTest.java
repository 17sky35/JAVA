package ex03_method;

import java.util.Arrays;

public class MethodTest {

	void maxFinder(int[] arr) {
//		int max = arr[0];
//		for(int x : arr) {
//			if(x > max) max = x;
//		}
		Arrays.sort(arr);
		System.out.println("최대값 : " + arr[arr.length - 1]);
		// 계산기 만들기
	}

	int getResult(String op, int x, int y) {

		if (op.equals("+")) {
			return x + y;
		} else if (op.equals("-")) {
			return x - y;
		} else if (op.equals("*")) {
			return x * y;
		} else if(op.equals("/")) {
			return x / y;
		} else {
			System.out.println("연산기호가 올바르지 않습니다.");
			return -1;
		}
	}
	
	
	
	
	
}
