package ex01_interface;

public class Main {
	public static void main(String[] args) {
		
		ColorPoint cp = new ColorPoint(5,5,"Yellow");
		cp.setXY(10,20);
		cp.setColor("Red");
		String str = cp.toString();
		System.out.println(str + "입니다.");
		
	}
}
