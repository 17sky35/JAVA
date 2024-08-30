package ex01_calendar;

public class Calendar {
	//달력의 색깔
	//개월수를 필드로 갖는다
	String color;
	int months;
	
	
	
	public Calendar(String color, int months) {
		this.color = color;
		this.months = months;
	}
	
	
	public void info() {
		System.out.printf("%c색 달력은 %d월까지 있습니다.\n",color,months);
	}
	public void hanging() {
		System.out.println(color + "색 달력을 벽에 걸 수 있습니다.");
	}
	
}
