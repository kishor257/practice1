package programmingPractice.programsOnNumbers;

import java.util.Scanner;

public class CheckGivenNoIsPrimeNo {
	
	public static void main(String[] args) {
		System.out.println("Enter the No:");
		Scanner sc=new Scanner(System.in);
		int no = sc.nextInt();
		boolean flag=false;
		if(no==0||no==1)
		{
		System.out.println("Prime starts from 2");
		}
		for(int i=2;i<no/2 ;i++)
		{
		if(flag=true)
		break;
		}
		if(!flag)
		System.out.println(no+" is a prime No.");
		else {
			System.out.println(no+" is not a prime no.");
		}
	}
}
