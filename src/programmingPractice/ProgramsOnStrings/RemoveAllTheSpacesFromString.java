package programmingPractice.ProgramsOnStrings;

public class RemoveAllTheSpacesFromString {
	
	public static void main(String[] args) {
		
		String s1=" abcd ";
		s1 = s1.trim();
		System.out.println(s1);
		
		String s2="    abcd";
		s2 = s2.trim();
		System.out.println(s2);
		
		String s3="abcd        ";
		s3= s3.trim();
		System.out.println(s3);
	}
}
