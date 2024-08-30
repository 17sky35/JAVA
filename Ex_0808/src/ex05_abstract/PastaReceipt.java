package ex05_abstract;

public class PastaReceipt extends Receipt {

	public PastaReceipt(String chef) {
		super(chef);
	}

	void makeSoure() {
		System.out.println("파스타 소스를 직접 만듭니다.");
	}

}
