package programmingPractice.ProgramsOnStrings;

public class ReverseAStringUsingtoCharArray {

	public static void main(String[] args) {

		String s="abhijeeth";
		String temp="";
		char[] ca = s.toCharArray();
		System.out.println("Yours:");
		for (int i = ca.length-1; i >=0 ; i--) {

			System.out.print(ca[i]);
		}
		System.out.println();
		System.out.println("Mine:");
		for( int i=ca.length-1;i>=0;i--) {
			temp=temp+ca[i];
		}
		System.out.println(temp);
		temp="";
		for( int i=0;i<ca.length;i++) {
			temp=ca[i]+temp;
		}
		System.out.println(temp);
	}
}
