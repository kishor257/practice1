package programmingPractice.programsOnNumbers;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Enter the no:");
		Scanner sc=new Scanner(System.in);
		int range = sc.nextInt();
		int a=0;
		int b=1;
		for (int i = 1; i <= range; i++) {
			int c=a+b;
			System.out.println(a);
			a=b;
			b=c;
		}
	}
}
