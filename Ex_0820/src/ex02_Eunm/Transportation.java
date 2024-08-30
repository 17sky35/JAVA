package ex02_Eunm;

public enum Transportation {
	//추상메서드가 정의되면 각각의 상수객체에서 구현해야한다.
	BUS(100){
		@Override
		int totalFare(int distance) {
			return distance * fare;
		}
	},
	TRAIN(150){
		@Override
		int totalFare(int distance) {
			return distance * fare;
		}
	},
	SHIP(200){
		@Override
		int totalFare(int distance) {
			return distance * fare;
		}
	},
	AIRPLANE(250){
		@Override
		int totalFare(int distance) {
			return distance * fare;
		}
	};
	
	protected final int fare;
	
	private  Transportation(int fare) {
		this.fare = fare;
		
	}	
	//열거형에는 추상메서드가 들어갈 수 있다.
	abstract int totalFare(int distance);
}
