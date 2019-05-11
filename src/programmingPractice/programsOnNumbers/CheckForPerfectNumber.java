package programmingPractice.programsOnNumbers;

import java.util.Scanner;

//Perfect number, a positive integer that is equal to the sum of its proper
//divisors. The smallest perfect number is 6, which is the sum of 1, 2, and 3.

public class CheckForPerfectNumber {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the No:");
		Scanner sc=new Scanner(System.in);
		int no= sc.nextInt();
		int sum=1;
		for (int i = 2; i <= no/2; i++) {
			if (no%i==0) {
				sum=sum+i;
			}
		}
		if (sum==no)
		{
		System.out.println(no+" is a Perfect number");
		}else {
		System.out.println(no+" is not a Perfect number");
		}
	}
}
