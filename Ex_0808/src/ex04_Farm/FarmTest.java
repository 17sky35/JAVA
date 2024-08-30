package ex04_Farm;


class Animal{
	//오버라이드하기위해 만든 메서드
	public void cry() {};
}
class Pig extends Animal{
	@Override
	public void cry() {
		System.out.println("꿀꿀");
	}
}
class Cow extends Animal{
	@Override
	public void cry() {
		System.out.println("음메");
	}
}

class Farm{
	
	public void sound(Animal animal) {
		
//		if(animal instanceof Pig) {
//			System.out.println("꿀꿀");
//		}else {
//			System.out.println("음메");
//		}
		animal.cry();		
	}
	
}


public class FarmTest {
	public static void main(String[] args) {
		Farm f = new Farm();
		Pig p = new Pig();
		Cow c = new Cow();
		f.sound(p);
		f.sound(c);
	}	
}

//instanceof 와 '=='의 차이
//A instanceof B : 객체변수 A가 B 타입으로 생성된것인지 확인
//A가 B클레스 타입으로 생성된 객체변수인가
//A == B : 객체 A와 객체 B가 같은 주소를 참조
//주소값 비교