package programmingPractice.ProgramsOnStrings;

public class SwapTwoStringsWithoutUsingThirdVariable {
	
	public static void main(String[] args) {
		
		String a="Love";
		String b="You";
		
		System.out.println("Before swap: "+a+" "+b);
		//System.out.println(a.replaceAll(a, b));
		//System.out.println(a.replaceAll(b, a));
		System.out.println(a.replaceAll(a, b)+" "+a.replaceAll(b, a));
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("Before swap: "+a+" "+b);		
	}
}
