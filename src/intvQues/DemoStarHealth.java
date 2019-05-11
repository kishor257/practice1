package intvQues;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoStarHealth {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.starhealth.in/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/section[4]/div/div/div/div[3]/div[1]/b")).click();
		Actions act=new Actions(driver);
		WebElement ele = driver.findElement(By.linkText("PLANS"));
		act.moveToElement(ele);
		driver.findElement(By.linkText("Plan for Myself")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='1000000']")).click();
		
		
		
		
	}
}
