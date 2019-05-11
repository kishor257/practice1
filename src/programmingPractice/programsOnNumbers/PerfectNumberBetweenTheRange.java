package programmingPractice.programsOnNumbers;

import java.util.Scanner;

public class PerfectNumberBetweenTheRange {

	public static void main(String[] args) {

		System.out.println("Enter the No:");
		Scanner sc=new Scanner(System.in);
		int no= sc.nextInt();
		for(int i=1;i<=no; i++)
		{
			int sum=1;
			for (int j=2;j<=i/2;j++ )
			{
				if (i%j==0) {
					sum=sum+j;
				}
			}
			if (sum==i)
			{
				System.out.println(i+" is a Perfect number");
			}
		}
	}
}
