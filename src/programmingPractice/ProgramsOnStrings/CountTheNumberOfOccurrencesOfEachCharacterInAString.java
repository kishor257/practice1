package programmingPractice.ProgramsOnStrings;

import java.util.HashMap;

public class CountTheNumberOfOccurrencesOfEachCharacterInAString {

	public static void main(String[] args) {

		String s="sanjeeth kumar";

		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		char[] charArray = s.toCharArray();
		for (char c : charArray)
		{
			if(charCountMap.containsKey(c))
			{
				charCountMap.put(c, charCountMap.get(c)+1);
			}
			else
			{

				charCountMap.put(c, 1);
			}
		}
		System.out.println(charCountMap);
	}
}
