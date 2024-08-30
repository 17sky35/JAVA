package ex02_Thead;

class AddStackThread extends Thread {
	private Storage storage;

	public AddStackThread(Storage storage) {
		this.storage = storage;
	}

	@Override
	public void run() {
		try {
			while (true) {
				Thread.sleep(1000);
				if (this.storage.getStackCount() == 0) {
					System.out.println("짐 10개 추가");
					this.storage.addStack(10);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}// AddStackThread 클래스



class PopStackThread extends Thread {
	private Storage storage;

	public PopStackThread(Storage storage) {
		this.storage = storage;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(1000);
				System.out.println("짐 5개 나르기");
				this.storage.popStack(5);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
}// PopStackThread 클래스


	
	

public class ThreadWaitExample {
	public static void main(String[] args) {
		Storage s = new Storage();
		AddStackThread add = new AddStackThread(s);
		PopStackThread pop = new PopStackThread(s);
		
		add.start();
		pop.start();
	}
}
