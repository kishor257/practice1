package programmingPractice.programsOnNumbers;

import java.util.Scanner;
//E.g=1 2 3 5 7 11 13 17 19 23
public class CheckForPrimeNo {
	
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int no = sc.nextInt();
		int temp=0;
		for (int i = 2; i < no-1; i++) {
			if (no%i==0) {
				temp=temp+1;
			}
		}
		if (temp==0) {
			System.out.println("its a prime number");
		} else {
			System.out.println("its not a prime number");
		}
	}
}
