package programmingPractice.ProgramsOnStrings;

public class ReverseEachWordUsingBuiltInMethod {
	
	public static void main(String[] args) {
		
		String str="my name is khan";
		
		String words[]=str.split(" ");  
	    String reverseWord="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    System.out.println(reverseWord);
	}

}
