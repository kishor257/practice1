package programmingPractice.ProgramsOnStrings;

public class SortingOfString {

	public static void main(String[] args) {

		String str="i am learning java java i am xyx";

		char[] ch=str.toCharArray();
		//sort string in alphabetical order
		for(int i=0;i<ch.length-1;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					char t=ch[i];
					ch[i]=ch[j];
					ch[j]=t;
				}
			}
		}
		String st=new String(ch);
		System.out.println(st);
	}
}
