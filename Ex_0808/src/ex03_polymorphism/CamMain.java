package ex03_polymorphism;

public class CamMain {
	public static void main(String[] args) {
		
		ComputerRoom cr = new ComputerRoom();
		//cr.com1 -> Computer 타입
		cr.com1 = new Mac();
		cr.com2 = new LZ();
		
		//임시로 변경하기
		((Mac)cr.com1).info();
		
		//자식타입으로 바꿔서 변수에 저장하기
		Mac mac = (Mac)cr.com1;
		mac.info();
		
		
		cr.allPowerOn();
		cr.allPowerOff();
		
		//객체를 변경하기 위해서 여러 코드를 수정하는 것은
		//위험도가 높은 작업이다.
		//실무에서 프로그램은 코드의 양이 많아지고, 수 많은 객체가 서로
		//얽혀서 복잡한 로직으로 구성되어 있다.
		//그렇기 때문에 수정을 최소화 하는 것이 좋다.
	}
}
