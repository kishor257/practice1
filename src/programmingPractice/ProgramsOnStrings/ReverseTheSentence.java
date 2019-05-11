package programmingPractice.ProgramsOnStrings;

import java.util.Scanner;

public class ReverseTheSentence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String input = sc.nextLine();
		char[] ch = input.toCharArray();
		String reverse="";
		for (int i = ch.length-1; i>=0; i--) {
			int k=i;
			while (i>=0  && ch[i]!=' ')
			{
				i--;
			}
			int j=i+1;
			while ( j<=k)
			{
				reverse =reverse +ch[j];
				j++;
			}
			reverse=reverse+' ';
		}
		System.out.println("The reserve sentence is: "+reverse);
	}
}
