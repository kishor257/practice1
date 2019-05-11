package childBrowser;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUP4 {
	
public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> whs = driver.getWindowHandles();
		
		//closing specified browser
		for (String w : whs) {
			driver.switchTo().window(w);
			String t = driver.getTitle();
			System.out.println(t);
			if (t.equals("Larsen & Toubro Infotech Limited")) {
				driver.close();
			}	
		}		
	}

}
