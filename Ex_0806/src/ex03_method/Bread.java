package ex03_method;

public class Bread {
	String breadName;
	int breadNum;

	public void makeBread() {
		System.out.println("빵을 만들었습니다.");
		System.out.println("--------------------------------------");
	}
	
	
	public void makeBread(int breadNum) {
		this.breadNum=breadNum;
		for(int i = 0 ; i < breadNum; i++) {
			System.out.println("빵을 만들었습니다.");
		}
		System.out.println("요청하신 "+ breadNum +"개의 빵을 만들었습니다.");
		System.out.println("--------------------------------------");
	}
		
	
	public void makeBread(int breadNum, String breadName) {
		this.breadNum=breadNum;
		this.breadName=breadName;
		for(int i = 0 ; i < breadNum; i++) {
			System.out.println(breadName + "빵을 만들었습니다.");
		}
		System.out.println("요청하신 "+ breadNum +"개의 "+ breadName + "빵을 만들었습니다.");
	}
	
	

}
