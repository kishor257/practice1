package programmingPractice.programsOnNumbers;

import java.util.Scanner;

public class ReverseANumber {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the No:");
		Scanner sc=new Scanner(System.in);
		int no = sc.nextInt();
		int rem=0;
		int rev=0;
		while (no!=0) {
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println(rev);
	}

}
