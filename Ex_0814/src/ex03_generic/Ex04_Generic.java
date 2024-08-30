package ex03_generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex04_Generic {
	public static void main(String[] args) {
		
		List<LinkedList<String>> list = new ArrayList<>();
		
		LinkedList<String> link1 = new LinkedList<String>();
		link1.add("aa");
		link1.add("bb");
		
		LinkedList<String> link2 = new LinkedList<String>();
		link2.add("11");
		link2.add("22");
		
		list.add(link1);
		list.add(link2);
		System.out.println(list);
		
	}
}
