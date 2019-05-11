package DBTest5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods {

	WebDriver driver = null;

	public String login() throws Exception

	{
		ReadPropertyFile file = new ReadPropertyFile();
		try {
			driver = new FirefoxDriver();
			driver.get(file.getUrl());
			driver.findElement(By.id("Email")).sendKeys(file.getUsername());
			driver.findElement(By.id("next")).click();
			Thread.sleep(1000);
			String errMsg1 = driver.findElement(By.id("errormsg_0_Email"))
					.getText();
			driver.findElement(By.id("Passwd")).sendKeys(file.getPassword());
			driver.findElement(By.id("signIn")).click();
			Thread.sleep(3000);
			String url = driver.getCurrentUrl();
			if (url.contains("https://mail.google.com/mail")) {
				System.out.println("Entered Username on UI: " + file.getUsername());
			} else {
				String errMsg2 = driver.findElement(By.className("error-msg"))
						.getText();
				System.out.println("Unable to Login with:" + file.getUsername()
						+ errMsg2);
				driver.close();
			}

			driver.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		return file.getUsername();

	}
}
