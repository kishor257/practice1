package seleniumProg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnteringATextWithoutUsingSendKeys {
	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:81/orangehrm/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		
		//j.executeScript("document.getElementsID('txtUsername').value='kishor'");
		
		j.executeScript("document.getElementsID('btnLogin').click");
	}
}
