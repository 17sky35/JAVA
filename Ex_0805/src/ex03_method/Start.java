package ex03_method;

import java.util.Random;

public class Start {
	
	Random rnd = new Random();
	int rnum = rnd.nextInt(50) + 1;
	int count = 1;
	
	public String check (int number) {
		if(number == rnum) {
			return "정답!";
		}else if(number > rnum) {
			return "Down";
		}else  {
			return "Up";
		}
		
	}
	
}
