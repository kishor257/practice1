package programmingPractice.programsOnNumbers;

import java.util.Scanner;

public class EvenNoBetweenGivenRange {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first no of the range");
		int fst = sc.nextInt();
		System.out.println("Enter the second no of the range");
		int snd = sc.nextInt();
		for (int i = fst; i <= snd; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
}
