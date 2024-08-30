package ex03_method;

import java.util.Random;

public class Graph {
	public static void main(String[] args) {

		Random rnd = new Random();
		int[] num = new int[100];
		int[] count = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = rnd.nextInt(10);			
		}
		PrintGragh pg = new PrintGragh();
		for(int i : num) {
			count[i]++;			
		}
		for(int i = 0; i < count.length; i++) {
			System.out.println(i + "의 개수 : " + pg.print('#', count[i]) + " " + count[i]);
		}
	}
}
