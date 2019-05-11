package childBrowser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp010 {
	
public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> whs = driver.getWindowHandles();
		
		//closing all the browsers in forward direction
		ArrayList<String> al=new ArrayList<String>(whs);
		//By using reverse() method of collection class we can reverse a list, by using for each loop
		Collections.reverse(al);
		for (String s: al) {
			Thread.sleep(3000);
			driver.switchTo().window(s);
			driver.close();		
		}
	}
}
