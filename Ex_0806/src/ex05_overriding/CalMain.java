package ex05_overriding;

public class CalMain {
	public static void main(String[] args) {
		
		CalPlus p = new CalPlus();		
		CalMinus m = new CalMinus();
		
		System.out.println("CalPlus : " + p.getResult(20, 10));
		System.out.println("CalMinus : " + m.getResult(30, 15));
		
		
		
	}
}