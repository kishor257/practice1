package javaProg;

import java.util.Scanner;

public class RTO {

	public void issueDL(int age) throws InvalidAgeException {
		if (age<18 || age>70) {
			throw new InvalidAgeException();
		} else {
			System.out.println("you r eligible to apply DL");
		}
	}

	public static void main(String[] args) {
		RTO r=new RTO();
		System.out.println("Enter your age:");
		Scanner s=new Scanner(System.in);
		int age = s.nextInt();
		try {
			r.issueDL(age);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}
}
