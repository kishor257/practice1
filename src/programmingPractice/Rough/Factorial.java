package programmingPractice.Rough;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner s=new Scanner(System.in);
		int no = s.nextInt();
		int factorial=1;
		for (int i = 1; i <=no; i++) {
			factorial=factorial*i;
		}
		System.out.println(factorial);	
	}
}
