package programmingPractice.programsOnNumbers;

import java.util.Scanner;

public class CheckGivenNoIsEvenOrOdd {
	
	public static void main(String[] args) {
		
		System.out.println("enter the no :");
		Scanner s=new Scanner(System.in);
		int no = s.nextInt();
		if (no%2==0) {
			System.out.println("entered no is EVEN number");
		}
		else {
			System.out.println("entered no is ODD number");
		}
	}
}
