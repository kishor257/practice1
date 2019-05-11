package programmingPractice.Rough;

import java.util.Scanner;

public class PerfectNoBetweenRange {

	public static void main(String[] args) {
		System.out.println("Enter the Range:");
		Scanner s=new Scanner(System.in);
		int no = s.nextInt();
		
		for (int i = 1; i <= no; i++) {
			int sum=1;
			for (int j = 2; j < i; j++) {
				if (i%j==0) {
					sum=sum+j;
				}
			}	
			if (sum==i) {
				System.out.println(i);
			}
		}
	}
}
