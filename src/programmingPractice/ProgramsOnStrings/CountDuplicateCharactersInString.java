package programmingPractice.ProgramsOnStrings;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountDuplicateCharactersInString {

	public static void main(String[] args) {

		String str="java j2ee jsp jquery";
		String a = str.replaceAll("\\s", "");
		char[] arr = a.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
		for (char c : arr) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}else {
				hm.put(c, 1);
			}
		}
		Set<Entry<Character, Integer>> entrySet = hm.entrySet();
		for (Entry<Character, Integer> e : entrySet) {
			if (e.getValue()>1) {
				System.out.println(e.getKey()+"\t"+e.getValue());
			}
		}
	}
}
