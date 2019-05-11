package programmingPractice.ProgramsOnStrings;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {

		System.out.println("Enter the string 1");
		Scanner sc1=new Scanner(System.in);
		String st1 = sc1.nextLine();
		System.out.println("Enter the string 2");
		Scanner sc2=new Scanner(System.in);
		String st2 = sc2.nextLine();

		String s1 = st1.replaceAll("\\s", "");
		String s2 = st2.replaceAll("\\s", "");

		boolean status=true;
		if (s1.length()!=s2.length()) {
			status=false;
		} else {
			char[] arrays1 = s1.toLowerCase().toCharArray();
			char[] arrays2 = s2.toLowerCase().toCharArray();
			Arrays.sort(arrays1);
			Arrays.sort(arrays2);
			
		}



	}

}
