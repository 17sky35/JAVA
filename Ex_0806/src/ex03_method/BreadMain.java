package ex03_method;

public class BreadMain {
	public static void main(String[] args) {
		
		Bread bread1 = new Bread();
		
		bread1.makeBread();
		bread1.makeBread(3);
		bread1.makeBread(3,"소보로");
		
	}
}
