package programmingPractice.programsOnNumbers;

import java.util.Scanner;

public class Print_1toN_Numbers {
	
	public static void main(String[] args) {
		System.out.println("enter the no :");
		Scanner s=new Scanner(System.in);
		int no = s.nextInt();
		
		for (int i = 1; i <= no; i++) {
			System.out.println(i);
		}
	}
}
