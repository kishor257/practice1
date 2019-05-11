package intvProgSan;

import java.util.HashSet;

//wajp to Print Duplicate Character In String

public class PrintDuplicateCharacterInString {
	
	public static void main(String[] args) {
		String s="sandeepa";
		
		HashSet<Character> hs = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!hs.add(c)) {
					System.out.println(c);
			}		
		}
	}
}
