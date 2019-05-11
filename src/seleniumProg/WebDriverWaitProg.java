package seleniumProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitProg {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:81/orangehrm/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("kishor");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("kishor1234");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		WebDriverWait w=new WebDriverWait(driver,10);
		try {
			w.until(ExpectedConditions.titleContains("OrangeHRM"));
			System.out.println("home page is displayed");
		} catch (Exception e) {
			System.out.println("home page is not displayed");
		}
//		try {
//			w.until(ExpectedConditions.urlContains("http://127.0.0.1:81/orangehrm/symfony/web/index.php/dashboard"));
//			System.out.println("url is correct");
//		} catch (Exception e) {
//			System.out.println("url is not correct");
//		}
//		try {
//			w.until(ExpectedConditions.urlToBe("http://127.0.0.1:81/orangehrm/symfony/web/index.php/dashboard"));
//			System.out.println("url is correct");
//		} catch (Exception e) {
//			System.out.println("url is not correct");
//		}
//		try {
//			w.until(ExpectedConditions.alertIsPresent());
//			System.out.println("alert is present");
//		} catch (Exception e) {
//			System.out.println("alert is not present");
//		}
		driver.close();
	}
}