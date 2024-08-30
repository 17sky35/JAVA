package ex02_Eunm;

public enum Operation {
	PLUS("+"){
		//추상메서드가 정의되면 상수객체에서 반드시 재정의해야한다.
		@Override
		public double apply(double x, double y) {
			return x+y;
		}
	},
	MINUS("-"){
		@Override
		public double apply(double x, double y) {
			return x-y;
		}
	},
	MULTI("*"){
		@Override
		public double apply(double x, double y) {
			return x*y;
		}
	},
	DIVIDE("/"){
		@Override
		public double apply(double x, double y) {
			return x/y;
		}
	};
	
	private String op;
	
	private Operation(String op) {
		this.op = op;	
	}
	
	//private 으로 설정된 필드의 값을 외부에서 보기 위해 getter 메서드를 사용한다.
	public String getOp() {
		return op;
	}
	
	public abstract double apply(double x, double y);
	
}
