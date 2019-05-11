package programmingPractice.programsOnNumbers;

import java.util.Scanner;

public class SumOf_1toN_Numbers {
	
	public static void main(String[] args) {
		System.out.println("enter the no :");
		Scanner s=new Scanner(System.in);
		int no = s.nextInt();
		int sum=0;
		for (int i = 1; i <= no; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
