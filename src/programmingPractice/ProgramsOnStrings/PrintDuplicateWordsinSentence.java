package programmingPractice.ProgramsOnStrings;

public class PrintDuplicateWordsinSentence {

	public static void main(String[] args) {

		String input="this string contains two words. one and two";
		int count;
		//converts the string into lower case
		String lowerCase = input.toLowerCase();
		//split the string into words using built-in function
		String words[] = lowerCase.split(" ");

		for (int i = 0; i < words.length; i++) {
			count=1;
			for (int j = i+1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					//set words[j] to 0 to avoid printing visited word
					words[j]="0";
				}
			}
			//displays the duplicate word if count is greater than 1
			if (count>1 && words[i]!="0") {
				System.out.println(words[i]);
			}
		}
	}
}


