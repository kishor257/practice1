package programmingPractice.ProgramsOnStrings;

import java.util.Scanner;

public class ReverseTheWordsInASentence {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		String emp=" ";
		for (int i=0 ;i<ch.length;i++ )
		{
			int k=i;
			while (i<ch.length &&ch [i]!=' ')
			{
				i++;
			}
			int j=i-1;
			while ( k<=j)
			{
				emp=emp + ch[j];
				j--;
			}
			emp=emp+' ';
		}
		System.out.println("The reserved words of sentence is:"+emp);
	}
}
