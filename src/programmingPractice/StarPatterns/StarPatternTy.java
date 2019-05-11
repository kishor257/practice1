package programmingPractice.StarPatterns;

public class StarPatternTy {
	
	public static void main(String[] args) {
		
		int n=5;
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			if (i==2 || i==4) {
				System.out.print("ty");
				}
			System.out.println();
		}	
	}
}
