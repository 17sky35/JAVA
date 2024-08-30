package ex04_Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex02_HashSet {
	public static void main(String[] args) {
		// 1. 순서가 없다.
		// 2. 중복되는 값이 안들어간다.

		Set<Integer> hs1 = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			// 1 ~ 45 사이의 난수를 뽑니다
			// int r = new Random().nextInt(45)+1;
			hs1.add((int) (Math.random() * 45) + 1);
			if (hs1.size() == 6) {
				break;
			}
		}

		System.out.println(hs1);
		//Set -> 배열로 바꾸기
		//new Integer[0] -> 배열의 방 개수를 0으로 하면 set 이 add 해둔 방 개수만큼
		//자동으로 배열의 index 가 생성된다.
		Integer [] arr = hs1.toArray(new Integer[0]);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
	}
}
