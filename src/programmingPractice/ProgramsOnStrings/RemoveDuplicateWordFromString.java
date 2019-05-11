package programmingPractice.ProgramsOnStrings;

import java.util.HashSet;

public class RemoveDuplicateWordFromString {

	public static void main(String[] args) {

		String s="i am learning java java i am xyx";

		HashSet<String> set = new HashSet<>();
		StringBuffer sb = new StringBuffer();
		String[] sp = s.split(" ");
		for (String tempstring : sp) {
			if (!set.contains(tempstring)) {
				set.add(tempstring);
				sb.append(" "+tempstring);
			}
		}
		System.out.println(sb);
	}
}
