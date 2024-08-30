package ex05;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Ex03_stream {
	public static void main(String[] args) {
		
		IntStream intStream = IntStream.range(1, 5); //[1,2,3,4]
		LongStream longStream = LongStream.range(1,5); //[1,2,3,4,5]
		intStream.forEach(System.out::print);
		System.out.println();
		System.out.println("-------------");
		longStream.forEach(System.out::print);
		
		Stream<Integer> boxedIntStream = IntStream.range(1, 5).boxed();
		
		
		
	}
}
