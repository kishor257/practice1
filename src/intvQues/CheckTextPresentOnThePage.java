package intvQues;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTextPresentOnThePage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		if (driver.getPageSource().contains("identify")) {
			System.out.println("text is present");
		} else {
			System.out.println("text is not present");
		}
		try {
			driver.findElement(By.xpath("//*[contains(text(),'" + "identify" + "')]"));
			System.out.println("text is present");
		}catch (Exception e) {
			System.out.println("text is not present");
		}
	}
}
