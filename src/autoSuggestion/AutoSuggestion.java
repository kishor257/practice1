package autoSuggestion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.switchTo().activeElement().sendKeys("java");
		List<WebElement> lw = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int c=lw.size();
		System.out.println(c);
		for (int i = 0; i < c; i++) {
			WebElement gi = lw.get(i);
			String t = gi.getText();
			System.out.println(t);
		}
		lw.get(2).click();
	}
}
