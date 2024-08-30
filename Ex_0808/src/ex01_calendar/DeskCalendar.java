package ex01_calendar;

public class DeskCalendar extends Calendar{
	
	public DeskCalendar(String color, int months) {
		//부모생성자가 매개변수를 받기 때문에 생략을 할 수없어
		//명시하지않으면 에러가 난다.
		super(color, months);
	}
	
	@Override
	public void info() {
		System.out.println(color + "색 달력을 벽에 걸기 위해 고리가 추가로 필요합니다. ");
	}
	
	public void onTheDesk() {
		System.out.println(color + "색 달력을 책상에 세울 수 있습니다.");
	}
}