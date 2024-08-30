package ex03_method;

public class Bus {
	
	void take(int m) {
		while(true) {
			if (m < 3000) {
				System.out.println("교통카드를 충전하러 갑니다.");
				return;
			}
			System.out.println("버스를 탑니다.");
			m-=1400;			
			
		}
	}
	
	
	
	
	
	
}
