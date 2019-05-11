package programmingPractice.Rough;

import java.util.Scanner;

public class ReverseANo {
	
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner s=new Scanner(System.in);
		int no = s.nextInt();
		int rem=0;
		int rev=0;
		while (no!=0) {
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println(rev);
	}

}
