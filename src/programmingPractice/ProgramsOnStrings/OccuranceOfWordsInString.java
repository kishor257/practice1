package programmingPractice.ProgramsOnStrings;

import java.util.HashMap;

public class OccuranceOfWordsInString {

	public static void main(String[] args) {

		String s="i am learning java java i am xyx";
		HashMap<String, Integer> hm=new HashMap<>();
		String[] sp = s.split(" ");
		for (String tempstring : sp) {
			if (hm.get(tempstring)!=null) {
				hm.put(tempstring, hm.get(tempstring)+1);
			} else {
				hm.put(tempstring, 1);
			}
		}
		System.out.println(hm);
	}
}