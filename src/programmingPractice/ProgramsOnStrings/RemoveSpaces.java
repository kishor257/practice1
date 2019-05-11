package programmingPractice.ProgramsOnStrings;

public class RemoveSpaces {


	public static void main(String[] args) {

		String str="aa  ss   s    s    s";
		char [] ch=str.toCharArray();
		//convert the string into array
		String nstr=" ";
		//create a new empty string
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
				nstr=nstr + ch[i];
			/* if the character at ith index is not equal to space
		then add that character to new empty string*/
			System.out.println(str);
		}
		.
	}
}
