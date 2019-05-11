package intvQues;

public class ReverseWordsInString3 {

	//HELLO WORLD
	//output- DLROW OLLEH

	public static void main(String[] args) {

		String s="HELLO WORLD";
		char ch[]=s.toCharArray();
		String rev=" ";
		for (int i=ch.length-1 ;i>=0;i-- )	{
			int j=i;
			while ( i<=j) {
				rev=rev + ch[j];
				j--;
			}
		}
		System.out.println("The reserved words of sentence is:"+rev);
	}
}
