package DBTest5;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

public class login {

	WebDriver driver = null;
	static ReadPropertyFile file = null;

	public static void main(String[] args) throws Throwable {
		file = new ReadPropertyFile();
		Methods method = new Methods();
		String temp = method.login();

		dbVerification dbVerify = new dbVerification();
		ArrayList<String> dbValue = dbVerify.db(file.getQuery(),
				file.getColumn());
		/*System.out.println(dbValue.get(0));*/
		if ((temp.equals(dbValue.get(0)))) {
			System.out.println("UI and DB value matches");
		} 
		else {
			System.out.println("Record doesn't exists in Database");
		}

	}

}
