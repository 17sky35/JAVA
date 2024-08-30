package ex02_for;

public class Ex02_for {
	public static void main(String[] args) {
		
		for(int i = 1; i < 4; i++) {
			for(int j = 1; j < 4 ; j++) {
				System.out.println(i + " " +j);				
			}
		}
		System.out.println();
		for(int i = 1; i < 5; i++) {
			for(int j = 1; j <4; j++) {
				System.out.print(1+" ");
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		
		for(int i = 1;i <4 ; i++) {
			for(int j = 1; j < 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		//01 02 03 04
		//05 06 07 08
		//09 10 11 12
		
		int count = 0;
		
		for(int i = 1; i <=3; i++) {
			for(int j = 1; j<5; j++) {
				System.out.printf("%02d ",++count);
			}
			System.out.println();
		}
		
		System.out.println();
		
		char ch = 65; 
		
		for(int i = 1; i <=3; i++) {
			for(int j = 1; j<5; j++) {
				System.out.print(" "+ch++);
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		
		for(int i = 1; i<=5; i ++) {
			for(int j = 0; j < i; j++) {				
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------");
		
		
		for(int i = 0; i <10 ;i++) {
			for(int j = 1; j <= 10;j++ ) {
				int num = i + j;
				if(num>10) {
					num-=10;
				}
				System.out.print(num+" ");				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}
}
