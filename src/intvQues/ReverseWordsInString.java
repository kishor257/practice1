package intvQues;

public class ReverseWordsInString {
	
	//HELLO WORLD
	//output- WORLD HELLO
	
	public static void main(String[] args) {
		
		String s="HELLO WORLD";
		char[] c= s.toCharArray();
		String rev="";
		for (int i = c.length-1; i >= 0 ; i--) {
			int k=i;
			while (i>=0 && c[i]!=' ') {
				i--;
			}
			int j=i+1;
			while (j<=k) {
				rev=rev+c[j];
				j++;
			}
			rev=rev+' ';
		}
		System.out.println("The reserve sentence is: "+rev);
	}
}
