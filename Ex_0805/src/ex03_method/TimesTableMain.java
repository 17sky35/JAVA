package ex03_method;

import java.util.Scanner;

public class TimesTableMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		TimesTable tt = new TimesTable();

		System.out.print("단 입력 : ");
		tt.showTable(sc.nextInt());
		
	}
}
