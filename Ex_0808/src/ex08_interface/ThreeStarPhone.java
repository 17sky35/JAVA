package ex08_interface;

//클래스를 상속 -> extends
//인터페이스를 구현 -> implements
public class ThreeStarPhone implements Phone{
	
	
	int batteryCapcity = 40;
	boolean isOn = false;
	
	@Override
	public void powerOn() {
		if(batteryCapcity > 30) {
			System.out.println("@@@폰이 켜졌습니다!!@@@");
			isOn = true;
		}else {
			System.out.println("베터리가 부족합니다...");			
		}
	}

	@Override
	public void powerOff() {
		System.out.println("@@@폰이 꺼졌습니다!!@@@");
		isOn = false;
	}
	
	@Override
	public boolean isOn() {
		if(isOn) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void watchUtube() {
		if(batteryCapcity >10) {
			System.out.println("--- 유튜브 시청중 ---");
			batteryCapcity -=10;
			System.out.println("잔여 베터리 " + batteryCapcity + "%");
		} else {
			System.out.println("베터리가 부족합니다");
			powerOff();
		}
	}

	@Override
	public void charge() {
		if(batteryCapcity < Phone.MAX_BATTERY_CAPACITY - 20) {
			System.out.println("--- 충전중 ---");
			batteryCapcity += 5;
			System.out.println("잔여 베터리" + batteryCapcity + "%");
		}else {
			System.out.println("충전할 필요가 없습니다.");
			System.out.println("잔여 베터리 " + batteryCapcity + "%");
		}
	}
	
}
