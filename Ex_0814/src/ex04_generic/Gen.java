package ex04_generic;


public class Gen {
	public <T> void printArr(T[] arr) {		
		for(T i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}

