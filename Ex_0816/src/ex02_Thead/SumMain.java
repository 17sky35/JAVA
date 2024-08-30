package ex02_Thead;

public class SumMain {
	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		
		//mt.run(); run 메스드를 직접 호출하지 않는다.
		mt.start();
		
		
	}
}