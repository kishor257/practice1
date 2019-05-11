package programmingPractice.programsOnNumbers;

import java.util.Scanner;

public class ArmStrongNo2 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the No:");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int m=n;
		
		int c=0;
		int sum=0;
		while (n>0) {
			int d=n%10;
			int pow=1;
			for (int i = 0; i <=c; i++) {
				pow=pow*d;
			}
			sum=sum+pow;
			n=n/10;
		}
		if (sum==m) {
			System.out.println("its an armstrong number");
		}
	}

}
