package programmingPractice.ProgramsOnStrings;


public class ReverseAString {
	public static void main(String[] args) {
		
	String s="abhijeeth";
	String reverse="";
	
		for (int i = s.length()-1; i >=0 ; i--) {
			reverse=reverse+s.charAt(i);
		}
		System.out.println(reverse);
	}
}
