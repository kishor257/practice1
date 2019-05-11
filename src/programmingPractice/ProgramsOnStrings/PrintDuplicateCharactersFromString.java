package programmingPractice.ProgramsOnStrings;

import java.util.HashSet;

public class PrintDuplicateCharactersFromString {
	
	public static void main(String[] args) {
		
		String s="sandeep";
		
		HashSet<Character> set = new HashSet<>();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			char ca = s.charAt(i);
			if (!set.contains(ca)) {
				set.add(ca);
				//sb.append(ca);
			}else {
				System.out.println(ca);
			}
		}	
	}
}
