package seleniumProg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingAndClickingOn5thLinkUsingForLoop {
	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:81/orangehrm/symfony/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		
		//counting total no. of links
		int count=allLinks.size();
		System.out.println(count);
		//printing texts of all links using for loop
		for (int i = 0; i < count; i++) {
			WebElement link = allLinks.get(i);
			String text=link.getText();
			System.out.println(text);
		//clinking on 5th link,Using for loop
			if (i==4) {
				link.click();
			}	
		}
		driver.close();
	}
}
