package programmingPractice.Rough;

import java.util.Scanner;

public class PrimeNoBetweenRange {
	public static void main(String[] args) {

		System.out.println("Enter the number:");
		Scanner s=new Scanner(System.in);
		int no = s.nextInt();
		int temp=0;
		for (int i = 1; i <= no; i++) {
			
			for (int j = 2; j < i; j++) {
				if (i%j==0) {
					temp=temp+1;
				}
			}
			if (temp==0) {
				System.out.print(i+" ");
			} else {
				temp=0;
			}
		}
	}
}
