package ex03_anonymous;

interface buttonClickListener{
	//기능은 메서드에다 만든다
	public void click();
}

public class AnonymousExample {
	public class Button{
		//필드
		private buttonClickListener listener;
		
		public void setButtonListener(buttonClickListener listener) {
			this.listener = listener;
		}
		public void click() {
			if(listener != null) {
				this.listener.click();
			}
		}
	}
	
	public static void main(String[] args) {
		AnonymousExample exam = new AnonymousExample();
		AnonymousExample.Button button = exam.new Button();
		//인터페이스 객체는 직접 만들수가 없다.
		//인터페이스를 구현한 클래스를 통해 객체를 만들수 있다.
//		Clicifunc c = new Clicifunc();
//		button.setButtonListener(c);
//		여기서 c = new buttonClickListener()랑 역할이 같다
		button.setButtonListener(new buttonClickListener() {
			//익명으로 인터페이스를 구현한 클래스
			@Override
			public void click() {
				System.out.println("버튼을 눌렀습니다.");
			}
		});
		button.click();
	}
	
}
