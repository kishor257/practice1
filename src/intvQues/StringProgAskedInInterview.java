package intvQues;

public class StringProgAskedInInterview {
	
	public static void main(String[] args) {
		
		String s="Hello";
		String temp="";
		for (int i = 0; i < s.length(); i=i+2) {
			temp=temp+s.charAt(i);
		}
		System.out.println(temp);
	}
}
