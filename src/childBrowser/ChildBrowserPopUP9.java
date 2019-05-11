package childBrowser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUP9 {
	
public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> whs = driver.getWindowHandles();
		
		//closing all the browsers in reverse order using reverse() method of collections, by using iterator
		ArrayList<String> al=new ArrayList<String>(whs);
		Collections.reverse(al);
		Iterator<String> i = al.iterator();
		while (i.hasNext()) {
			String s =i.next();
			driver.switchTo().window(s);
			driver.close();
		}
	}

}
