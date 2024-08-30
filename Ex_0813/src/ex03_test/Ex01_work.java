package ex03_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01_work {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("아이디 생성 : ");
			String id = sc.next();
			//리스트에 중복이 되는 아이디가 있는지 검증
			
//			for(int i = 0 ; i < list.size(); i++) {
//				if (id.equals(list.get(i))) {
//					System.out.println("중복된 아이디");
//					continue outer;
//				}
//			}
			
			if(list.contains(id)) {
				System.out.println("중복된 아이디");
				continue;
			}
			
			list.add(id);			
			System.out.println(list);
			System.out.println("----------------------");
			if (list.size() == 4) {
				break;
			}
		}
	}
}
