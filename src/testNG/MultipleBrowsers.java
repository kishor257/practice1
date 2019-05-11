package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleBrowsers {
	
	WebDriver driver;
	
	@Parameters({"browser"})
	@Test
	public void browsers(String browser){
		if (browser.equals("chrome")) {
			driver=new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver=new FirefoxDriver();
		} else if (browser.equals("ie")) {
			driver=new InternetExplorerDriver();
		}
		driver.get("http://www.google.com");
		driver.switchTo().activeElement().sendKeys("selenium");
	}

}
