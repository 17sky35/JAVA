package ex03_method;

public class MidTermMain {
	public static void main(String[] args) {
		
		MidTerm mid = new MidTerm();
		
		int[] stu1 = {50,60};
		int[] stu2 = {60,70};
		
		int sumA = mid.score(stu1);
		int sumB = mid.score(stu2);
		if(sumA > sumB) {
			System.out.println("A 학생 점수가 더 높다.");
		}else if(sumA < sumB){
			System.out.println("B 학생 점수가 더 높다.");
		}else {
			System.out.println("A 학생 점수와 B학생의 성적이 같다.");
		}
	}
}
