package programmingPractice.ProgramsOnStrings;

public class SwapTwoStringsUsingThirdVariable {
	
	public static void main(String[] args) {
		
		String a="Love";
		String b="You";
		String temp;
		
		System.out.println("Before swap: "+a+" "+b);
		temp=a;//value of temp will be Love
		a=b;//value of a will be you
		b=temp;//value of b will be love 
		System.out.println("Before swap: "+a+" "+b);		
	}
}
