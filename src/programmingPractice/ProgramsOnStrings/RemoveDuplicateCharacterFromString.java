package programmingPractice.ProgramsOnStrings;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacterFromString {

	public static void main(String[] args) {
		String s="abhijeet";

		LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			lhs.add(c);
		}
		// print string after deleting duplicate elements
		for (Character fetch: lhs) {
			System.out.print(fetch);
		}
	}
}