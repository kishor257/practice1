package seleniumProg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountingAndPrintingTotalNoOfvisibleAndInvisibleLinks {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {	
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		Thread.sleep(5000);
		int totalLinks=allLinks.size();
		int visibleLinks=0;
		int invisibleLinks=0;
		for (int i = 0; i < totalLinks; i++) {
			WebElement links=allLinks.get(i);
			if (links.isDisplayed()) {
				visibleLinks++;	
				System.out.println(visibleLinks +":"+ links.getText());
			}
		}
		driver.close();
		invisibleLinks=totalLinks-invisibleLinks;
		System.out.println("total links:"+totalLinks);
		System.out.println("total links:"+visibleLinks);
		System.out.println("total links:"+invisibleLinks);

	}
}
