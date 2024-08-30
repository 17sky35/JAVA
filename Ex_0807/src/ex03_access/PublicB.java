package ex03_access;

import ex02_modifier.*; //ex02_modifier패키지의 모든 클래스를 import 하겠다.

public class PublicB {
	public static void main(String[] args) {
		DefaultC c = new DefaultC(); //default 로 선언된 클래스는 다른 패키지에서 사용될 수 없다.
		c.variableC = 20; //필드가 public으로 선언되어있음에도 불구하고 객체 생성자체가 안되기때문에 사용할 수 없다.
		
	}
}
