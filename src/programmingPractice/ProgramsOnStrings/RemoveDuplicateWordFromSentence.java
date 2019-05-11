package programmingPractice.ProgramsOnStrings;

public class RemoveDuplicateWordFromSentence {

	public static void main(String[] args) {
		String input="welcome to java session java session session java";//input string

		String words[]=input.split(" ");
		//outer loop for comparison
		for (int i = 0; i < words.length; i++) {
			if (words[i]!=null) {
				//inner loop for comparison
				for (int j = i+1; j < words.length; j++) {
					//checking for both string are equal
					if (words[i].equals(words[j])) {
						//delete the duplicate words
						words[j]=null;
					}
				}
			}			
		}
		//displaying the string without duplicate words
		for (int k = 0; k < words.length; k++) {
			if (words[k]!=null) {
				System.out.print(words[k]+" ");
			}
		}
	}
}
