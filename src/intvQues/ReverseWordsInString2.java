package intvQues;

public class ReverseWordsInString2 {

	//HELLO WORLD
	//output- OLLEH DLROW

	public static void main(String[] args) {

		String s="HELLO WORLD";
		char ch[]=s.toCharArray();
		String rev=" ";
		for (int i=0 ;i<ch.length;i++ )
		{
			int k=i;
			while (i<ch.length && ch[i]!=' ')
			{
				i++;
			}
			int j=i-1;
			while ( k<=j)
			{
				rev=rev + ch[j];
				j--;
			}
			rev=rev+' ';
		}
		System.out.println("The reserved words of sentence is:"+rev);
	}
}
