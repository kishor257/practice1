package programmingPractice.Rough;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner s=new Scanner(System.in);
		int no = s.nextInt();
		int temp=0;
		for (int i = 2; i < no; i++) {
			if (no%i==0) {
				temp=temp+1;
			}
		}
		if (temp==0) {
			System.out.println("prime no");
		}else {
			System.out.println("not a prime no");
		}
	}
}
