package programmingPractice.programsOnNumbers;

import java.util.Scanner;

//An Armstrong number is an integer such that the sum of the power of its digits is equal to the number itself.
//For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
//9 is an Armstrong number since 9*1= 9.
public class ArmStrongNo {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the No:");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int c=0,a,temp;
		temp=n;
		
		while (n>0) {
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if (temp==c) {
			System.out.println("armstrong number");
		}else {
			System.out.println("not a armstrong number");
		}	
	}
}
