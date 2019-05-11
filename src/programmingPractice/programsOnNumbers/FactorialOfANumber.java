package programmingPractice.programsOnNumbers;

import java.util.Scanner;

//4!=4*3*2*1=24
public class FactorialOfANumber {
	
	public static void main(String[] args) {
		System.out.println("Enter the no:");
		Scanner sc=new Scanner(System.in);
		int no = sc.nextInt();
		int factorial=1;
		for (int i = 1; i <=no; i++) {
			factorial=factorial*i;
		}
		System.out.println(factorial);	
	}
}
