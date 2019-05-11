package programmingPractice.Rough;

import java.util.Scanner;

public class Fibonacci_Series {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number:");
		Scanner s=new Scanner(System.in);
		int no = s.nextInt();
		int a=0;
		int b=1;
		for (int i = 0; i <=no; i++) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}
