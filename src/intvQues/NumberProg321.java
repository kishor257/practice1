package intvQues;

public class NumberProg321 {
	
	public static void main(String[] args) {
		
		int n=321;	
		int count=0;
		
		while (n>0) {
			count++;
			n=n/10;
		}
		System.out.println(count);
		
		int p=0;
		int pw=1;
		while(p>0)
		{
		pw=pw*n;
		p--;
		}
		System.out.println(pw);
	}
	

}
