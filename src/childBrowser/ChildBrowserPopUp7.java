package childBrowser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp7 {
	
public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> whs = driver.getWindowHandles();
		
		//closing all the browsers in forward direction
		ArrayList<String> al=new ArrayList<String>(whs);
		//By using reverse() method of collection class we can reverse a list,no need to use for loop in reverse direction
		//Collections.reverse(al);
	    int c= al.size();
		for (int i = 0; i < c; i++) {
			Thread.sleep(3000);
			String g = al.get(i);
			driver.switchTo().window(g);
			driver.close();		
		}	
	}
}
