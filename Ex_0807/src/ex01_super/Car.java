package ex01_super;

//클래스에 들어갈 수 있는 것
//1. 필드
//2. 메서드
//3. 생성자
public class Car {
	
	private int gasGauge;
	
	public Car(int gasGauge) {
		this.gasGauge = gasGauge;
	}
	
	public void showCurrentGauge() {		
		System.out.println("가스 잔여량 : " + gasGauge);
	}
	
}
