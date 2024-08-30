package ex03_String;

import java.util.Arrays;

public class Ex01_String {
	public static void main(String[] args) {
		String str = "Kin Mal Ddong";
		
		//문자열의 길이
		//length()
		System.out.println("문자열 str의 길이 : " + str.length());
		
		//특정 문자의 위치
		//indexOf(char ch)
		System.out.println("문자 a의 위치 : " + str.indexOf('a'));
		
		//indexOf(String str)
		System.out.println("문자 Mal의 위치 : " + str.indexOf("Mal"));
		
		//lastIndexOf(char ch)
		System.out.println("마지막 문자 n의 위치 : " + str.lastIndexOf('n'));
		
		//인덱스를 통해 문자 받아오기
		//charAt(int index)
		System.out.println("추출한 문자 : " + str.charAt(4));
		
		//특정 문자열만 잘라내기
		//substring(int start, int end)
		System.out.println("0번 부터 5번까지 잘라내기 : " + str.substring(0,6));
		
		//문자열을 특정 기준으로 잘라서 배열로 저장하기
		//split()
		System.out.println(Arrays.toString(str.split(" ")));
		
		
		
	}
}
