package ex03_method;

public class Calc {

	void sum(int a, int b) {
		System.out.printf("두 수의 합은 %d입니다.\n", a + b);
	}
	
	int sum(int[] a) {
		int result = 0;
		for(int i = 0;i < a.length;i++) {
			result += a[i];
		}
		//System.out.println("숫자들의 합은 : " + result + "입니다.");
		return result;
	}

}
