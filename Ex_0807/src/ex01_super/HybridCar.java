package ex01_super;

public class HybridCar extends Car{
	private int electricGauge;
	
	public HybridCar(int gasGauge,int electricGauge) {
		super(gasGauge);
		this.electricGauge=electricGauge;
	}
	
	@Override
	public void showCurrentGauge() {
		super.showCurrentGauge();//부모클래스의 메소드실행
		System.out.println("잔여 전기량 : " + electricGauge);
	}

}
