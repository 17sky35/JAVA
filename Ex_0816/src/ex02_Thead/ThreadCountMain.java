package ex02_Thead;

import java.util.Scanner;

class ThreadCount extends Thread{
	
	private int n;
	
	public ThreadCount(int n) {
		this.n = n;
	}
	
	@Override
	public void run() {
		for(int i= n; i>=0;i--) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("종료");
	}
	
}



public class ThreadCountMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력 : ");
		ThreadCount tㅊ = new ThreadCount(sc.nextInt());
		tㅊ.start();
		
		
	}
}
