package programmingPractice.programsOnNumbers;

import java.util.Scanner;

public class PrimeNoBetween_1toN_Range2 {

	public static void main(String[] args) {
		System.out.println("Enter the no:");
		Scanner sc=new Scanner(System.in);
		int no = sc.nextInt();
		int temp=0;
		for (int i = 1; i < no; i++) {
			for (int j = 2; j < i-1; j++) {
				if (i%j==0) {
					temp=temp+1;
				}
			}
			if (temp==0) {
				System.out.print(i+" ");
			}else {
				temp=0;
			}
		}
	}
}
