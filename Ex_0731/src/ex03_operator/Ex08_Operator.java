package ex03_operator;

import java.util.Scanner;

public class Ex08_Operator {

	public static void main(String[] args) {
		//과수원에서 배, 사과, 오렌지를 하루에 5,7,5개씩 생산한다.
		//1. 과수원에서 하루에 생산되는 과일의 총 개수를 구하기
		//2. 시간당 총 생산량 구하기
		
		/*int pear = 5;
		int apple = 7;
		int orange = 5;
		
		int total = pear + apple + orange;
		double avg = (double)total/24;
				
		System.out.printf("과수원 하루 생산되는 과일 총 개수 : %d 개\n",total );
		System.out.printf("과수원 시간당 생산량 : %.1f\n",avg);
		*/
		//---------------------------------------------------------------------
		
		//상자 하나에는 농구공이 5개가 들어갈 수 있다.
		//만일 농구공이 23개 라면 몇개의 상자가 필요한가?
		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * System.out.println("공의 갯수를 입력하세요"); int ball = scan.nextInt(); int box = 5;
		 * int result = ball % box == 0 ? ball / box : ball / box+1;
		 * System.out.printf("필요한 박스 수 : %d 개\n",result);
		 */
		
		//---------------------------------------------------------------------
		
		//국어,영어,수학 대한 점수를 키보드를 이용해 정수로 입력받고
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 : ");
		int score1 = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int score2 = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int score3 = sc.nextInt();
		
		int total = score1 + score2 + score3;
		double avg = (double)total/3;
		
		System.out.printf("총 점수 : %d 평균 : %.1f \n",total,avg);
		String result = score1>=40 && score2>=40 && score3>=40 && avg>=60 ? "합격" : "불합격";
		System.out.println(result);
		
		

	}
}
