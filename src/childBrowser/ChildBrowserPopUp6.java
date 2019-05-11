package childBrowser;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp6 {
	
public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> whs = driver.getWindowHandles();
		
		//use iterator to iterate over windows
		Iterator<String> it = whs.iterator();
		//verify next window is available
		while (it.hasNext()) {
			String childWindow =it.next();
			driver.switchTo().window(childWindow);
			driver.close();
		}			
	}
}
