package ex01_set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex02_bingo {
	public static void main(String[] args) {

		// HashSet 과 ArrayList를 이용하여 5*5 랜덤 빙고판 만들기
		Set<Integer> set = new HashSet<>();
		while (set.size() != 25) {
			set.add((int) (Math.random() * 50) + 1);
		}
		System.out.println(set);
		List<Integer> list = new ArrayList<>(set);

		Collections.shuffle(list);		
		int[][] board = new int[5][5];
		int count = 0;
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = list.get(count++);
				System.out.printf("%02d ", board[i][j]);
			}
			System.out.println();
		}

	}
}
