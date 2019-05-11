package intvProgSan;

import java.util.HashSet;

public class RemoveDuplicateCharacterFromString {
	
	public static void main(String[] args) {
		
		String s="sandeep";
		
		HashSet<Object> hs = new HashSet<>();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!hs.contains(c)) {
				hs.add(c);
				sb.append(c);
			}else {
				//Printing Duplicate Character
				System.out.println(c);
			}
		}
	}
}
