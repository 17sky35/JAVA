package ex04_inheritance;

public class PersonMain {
	public static void main(String[] args) {
		
		Customer c1 = new Customer("박자바",25,20240001);
		Customer c2 = new Customer("송코디",30,20240002);
		
		c1.enter();
		c2.enter();
		
	}
}
