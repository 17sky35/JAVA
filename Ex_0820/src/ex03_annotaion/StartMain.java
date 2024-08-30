package ex03_annotaion;

import java.util.Random;
import java.util.Scanner;

class Start {

	public String print(char ch, int num) {
		String str = "";
		for (int i = 0; i < num; i++) {
			str += ch;
		}
		return str;
	}
}

public class StartMain {
	public static void main(String[] args) {

		int[] num = new int[100];// 난수를 담을 배열

		int[] count = new int[10];// 발생한 난수가 각각 몇 개인지 저장할 배열
		for (int i = 0; i < num.length; i++) {

			// 0 ~ 9사이의 난수
			System.out.print(num[i] = new Random().nextInt(10));
		}
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			count[num[i]]++;
		}
		Start pg = new Start();
		for (int i = 0; i < count.length; i++) {
			System.out.println(i + "의 갯수 : " + pg.print('#', count[i]) + " " + count[i]);
		}
	}
}