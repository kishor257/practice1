package StaleElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefenceExceptionEx {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//in this case if element ids not present we will get NoSuchElementException
		//driver.findElement(By.id("abc")).click();
		
		WebElement ele = driver.findElement(By.id("abc"));
		ele.sendKeys("pqr");;
	}
}