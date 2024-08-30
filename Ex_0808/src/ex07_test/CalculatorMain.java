package ex07_test;

public class CalculatorMain {
	public static void main(String[] args) {
		
		Calculator calc = new GoodCalc();
		
		int [] arr = {44,234,2,123,4};
		System.out.println("합 : " + calc.add(3, 5));
		System.out.println("차 : " + calc.substract(9,5));
		System.out.println("평균 : " + calc.average(arr));
		
	}
}
