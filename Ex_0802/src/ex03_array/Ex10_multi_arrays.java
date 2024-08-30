package ex03_array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10_multi_arrays {
	public static void main(String[] args) {
		//1~25 까지 2차원배열 
		int[][] arr = new int[5][5];
		int count = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%02d ",arr[i][j] = count++);
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");
		//로또번호 맞추기
		
		int[][] lotto = {{2,6,11,33,42,44},{1,6,17,22,24,33},
						{7,16,24,33,45,9},{27,42,35,21,43},
						{6,17,22,24,33,41}};
		
		Scanner sc = new Scanner(System.in);
		
		String myNum = "";		
		boolean isWin = false;
		for(int i = 0; i < 6; i++) {
			System.out.println("숫자 6개 입력 : ");
			myNum += sc.nextInt();
		}
		for(int i = 0; i < lotto.length; i++) {
			String lottoNumber = "";
			for(int j = 0; j < lotto[i].length; j++ ) {
				lottoNumber += lotto[i][j];			
			}
			if(myNum.equals(lottoNumber)) {
				isWin = true;
				break;
			}
		}
		if(isWin) {
			System.out.println(myNum + "번호 당첨");
		}else {
			System.out.println(myNum + "번호는 당첨되지 못했습니다.");
		}
		
		
		
	}
}
