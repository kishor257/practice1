package programmingPractice.programsOnNumbers;

import java.util.Scanner;

public class Print_Nto1_Numbers {
	
	public static void main(String[] args) {
		System.out.println("enter the no :");
		Scanner s=new Scanner(System.in);
		int no = s.nextInt();
		
		for (int i = no; i >= 1; i--) {
			System.out.println(i);
		}
	}
}
