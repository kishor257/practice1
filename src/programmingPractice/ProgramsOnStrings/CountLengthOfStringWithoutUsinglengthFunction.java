package programmingPractice.ProgramsOnStrings;

public class CountLengthOfStringWithoutUsinglengthFunction {
	
	public static void main(String[] args) {
		
		String s="anirudhh";
		char[] ch = s.toCharArray();
		int count=0;
		
		for (char c : ch) {
			count++;
		}
		System.out.println(count);
	}
}
