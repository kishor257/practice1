package seleniumProg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class CheckAllignment {
	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		TakesScreenshot t=(TakesScreenshot) driver;
		driver.get("http://127.0.0.1:81/orangehrm/symfony/web/index.php/auth/login");
		driver.findElement(By.xpath("//*[@id='txtUsername']")).getLocation().getX();
		driver.findElement(By.xpath("//*[@id='txtPassword']")).getLocation().getY();
		WebElement fe = driver.findElement(By.xpath("//*[@id='txtPassword']"));
		Dimension size = fe.getSize();
		Point location = fe.getLocation();
		Actions al=new Actions(driver);
		
	}
	

}
