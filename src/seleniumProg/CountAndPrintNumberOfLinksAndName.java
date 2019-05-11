package seleniumProg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountAndPrintNumberOfLinksAndName {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:81/orangehrm/symfony/web/index.php/auth/login");
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		//checking where it is storing
		String storesIn=allLinks.getClass().getName();
		System.out.println(storesIn);
		//counting total no. of links
		int count=allLinks.size();
		//clinking on 4th link, we are passing 4 bcoz it will stores in arraylist here index starts from 0
		allLinks.get(3).click();
		//printing all the links
		System.out.println(count);
		//printing texts of all links using for loop
		for (int i = 0; i < count; i++) {
			WebElement link = allLinks.get(i);
			String text=link.getText();
			System.out.println(text);
		}
		//printing texts of all links using for each loop
		for (WebElement link : allLinks) {
			System.out.println(link.getText());			
		}
	}

}
