package ex03_array;

import java.util.Random;
import java.util.Scanner;

public class Ex04_Arrays {
	public static void main(String[] args) {

		int[] numbers = new int[10];

		Random rnd = new Random();

		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {

			numbers[i] = rnd.nextInt(30) + 1;
			System.out.print(numbers[i] + " ");

			if (numbers[i] % 2 == 0) {
				sum += numbers[i];
			}

		}
		System.out.println();
		System.out.println("짝수의 합 : " + sum);

		// 배열에서 영문자만 추출하여 이어붙혀 출력하기

		System.out.println("----------------------------");

		char[] cards = { '1', 'L', '2', 'O', '3', 'V', 'E', '4' };
		String myWord = "";

		for (int i = 0; i < cards.length; i++) {

			if (cards[i] >= 'A' && cards[i] <= 'Z') {
				cards[i] += 32;
				myWord += cards[i];
			}
		}
		System.out.println("단어 : " + myWord);

		System.out.println("----------------------------");

		int[] arr = { 10, 20, 30, 40, 50 };
		sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 20) {
				i++;
				continue;
			}
			sum += arr[i];
		}
		System.out.println("총합 : " + sum);

		System.out.println("----------------------------");

		// 배열명.length : 배열에 들어있는 요소의 개수
		// index : 요소에게 번호표를 나눠준다.(근데 0부터 시작)
		// 배열에 있는 요소 꺼내는법
		// 배열명[index] -> 변수처럼 사용을 한다.

		// arr[0] -> 10

		// 다음조건에 맞는 문제를 푸세요
		// - 키보드에서 배열의 길이를 입력받는다.

		Scanner sc = new Scanner(System.in);

		System.out.print("배열 길이 입력 : ");
		char[] c = new char[sc.nextInt()];

		char c2 = 'A';

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] = c2++);
		}

		System.out.println("----------------------------");

		// 동전의 개수 구하기
		// 10~5000사이의 난수를 변수에 담는다
		// 1의 자리는 반드시 0이 되어야 합니다.
		// 발생된 난수를 동전으로 바꾸면 몇개씩 필요한지 판단하는 코드

		int[] coin = { 500, 100, 50, 10 };

		int money = (rnd.nextInt(500) + 1) * 10;
		System.out.println(money);

		for (int i = 0; i < coin.length; i++) {
			int res = money / coin[i];
			money %= coin[i];
			System.out.printf("%d원 : %d개\n", coin[i], res);

		}

		System.out.println("----------------------------");

		// 로또번호 생성하기
		// 1~45 사이의 난수를 발생시켜 로또번호를 배열에 저장하고 출력하기

		int[] lotto = new int[6];

		outer: for (int i = 0; i < lotto.length;) {
			lotto[i] = rnd.nextInt(45) + 1;

			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					continue outer;
				}
			}
			System.out.print(lotto[i] + " ");
			i++;
		}

	}
}
