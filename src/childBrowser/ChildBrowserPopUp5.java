package childBrowser;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp5 {
	
public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String pb = driver.getWindowHandle();
		Set<String> whs = driver.getWindowHandles();
		
		//closing all child browsers without using title
		for (String w : whs) {
			driver.switchTo().window(pb);
			driver.close();
		}		
	}
}
