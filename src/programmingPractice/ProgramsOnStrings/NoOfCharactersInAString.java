package programmingPractice.ProgramsOnStrings;

import java.util.Scanner;

public class NoOfCharactersInAString {

	public static void main(String[] args)
	{
		int count=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a string:..........");
		String st=scn.nextLine();
		char ch[]=st.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			//ASCII code 65-A 97-a
			if(ch[i]>=65&&ch[i]<=90 ||ch[i]>=97 && ch[i]<=122)
				count++;
		}
		System.out.println("No of Characters="+count);
	}
}
