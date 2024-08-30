package ex02_Thead;

import java.util.Random;
import java.util.Scanner;


class QuizThread extends Thread{	
	
	//난수를 받기 위한변
	int su1,su2;
	//시간을 세서 담기위한 변수
	int timer = 0;
	//정답을 맞춘 횟수를 저장하기 위한 변수
	int playCount = 0;
	//반복문을 멈추기 위한 변수
	boolean isCheck = true;
	//맞춰야 하는 문제의 개수
	final int FINISH = 5;
	
	
	
	public void startGame() {
		while(isCheck) {
			try {
				//난수 두개 받기
				su1 = new Random().nextInt(100)+1;
				su2 = new Random().nextInt(100)+1;
				//두개의 난수를 더하는 문제를 콘솔에 출력하기
				System.out.printf("%d + %d = ",su1, su2);			
				//정답 입력받기
				Scanner sc = new Scanner(System.in);
				//정답을 입력할 때 정수 이외의 것을 입력하면 예외 발생!
				int result = sc.nextInt();
				
				if(result == su1 + su2) {
					System.out.println("정답!");
				}else {
					System.out.println("오답");
					continue;
				}
				//정답을 맞추면 카운트하기
				playCount++;
				if(playCount == FINISH) {
					System.out.println("결과 : " + timer + "초");
					//isCheck를 false 로 바꿔 반복문을 빠져나간다.
					isCheck = false;
				}
				
			} catch (Exception e) {
				System.out.println("정답은 정수로 입력하세요");
			}//try			
		}//while(isCheck)
	}//startGame		
	@Override
	public void run() {
		//isCheck가 false가 되는 순간 반복문이 같이 멈춘다.
		while(isCheck) {
			try {
				//1초씩 세야하기 때문에 sleep 사용한다.
				Thread.sleep(1000);
				timer++;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
//----------------------------------------------------
//	int count = 0;
//		
//	public void startGame() {
//		long startTime = System.currentTimeMillis();
//		try {
//			while(true) {
//				int x = (int)(Math.random()*100)+1;
//				int y = (int)(Math.random()*100)+1;
//				System.out.printf("%d + %d = ",x,y);
//				int result = sc.nextInt();
//				if(x+y == result) {
//					System.out.println("정답!!");
//					count++;
//					if(count ==5) {
//						break;
//					}
//				}else {
//					System.out.println("오답");
//				}
//				
//			}//while
//		} catch (Exception e) {
//			System.out.println("정답은 정수로 입력하세요");
//		}
//		
//		long endTime = System.currentTimeMillis();
//		long time = (endTime - startTime)/1000;
//		System.out.println("결과 : " + time + "초...");
//	}//startGame	
}//QuizThread클래스


public class QuizMain {
	public static void main(String[] args) {
		
		QuizThread qt = new QuizThread();
		qt.start();
		qt.startGame();
		
		
	}	
}
