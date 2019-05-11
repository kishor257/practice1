package intvQues;

public class PrintOnlyRLDinGivenStringHello_World {

	public static void main(String[] args) {

		String s="Hello World";
				//012345678910
		String rev="";
		char[] ch = s.toCharArray();
					//10				//9
		for (int i = ch.length-1; i >= ch.length-3; i--) {
			int j=i;
			rev=rev+ch[i];
			int k=i+1;
			while (k<=j) {
				rev=rev+ch[k];
				k--;
			}
		}
		System.out.println(rev);
	}
}
