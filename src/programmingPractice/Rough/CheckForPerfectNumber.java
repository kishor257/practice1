package programmingPractice.Rough;

import java.util.Scanner;

public class CheckForPerfectNumber {
	
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner s=new Scanner(System.in);
		int no = s.nextInt();
		int sum=1;
		for (int i = 2; i <no ; i++) {
			if (no%i==0) {
				sum=sum+i;
			}
		}
		if (sum==no) {
			System.out.println("perfect number");
		} else {
			System.out.println("not a perfect number");
		}
	}

}
