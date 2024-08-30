package ex02_Thead;

class AddThread implements Runnable {

	private Bank b;
	private String name;

	public AddThread(String name, Bank b) {
		this.name = name;
		this.b = b;
	}

	@Override
	public void run() {
		synchronized (b) {
			try {
				for (int i = 0; i < 10; i++) {
					Thread.sleep(1000);// 1초동안 멈춤0
					b.addMoney(1000);
					System.out.println(this.name + " 현재 잔고 : " + b.getMoney());
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}//b;
	}

}

public class BankThreadExample {
	public static void main(String[] args) {
		Bank b = new Bank();
		Thread t1 = new Thread(new AddThread("1번", b));
		Thread t2 = new Thread(new AddThread("2번", b));
		t1.start();
		t2.start();
		// 최종적으로 20000원이 나와야 정상이다.
		// 실행결과에 따라 2만원이 아닌 더 적은 금액이 나올 수 있다.
		// 그 이유는 두 개의 스레드가 서로의 작업에 간섭하여 정상적으로 입금되지 않았기 때문이다.
		// 이러한 오류를 방지하기 위해 여러 스레드가 하나의 공유 데이터에 동시에 접근하지 못하도록
		// 스레드의 실행을 제어한는 '스레드 동기화'가 필요하다.
	}
}
