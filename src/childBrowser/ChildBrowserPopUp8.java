package childBrowser;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ChildBrowserPopUp8 {

public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> whs = driver.getWindowHandles();
		
		//closing all the browsers in reverse order
		ArrayList<String> al=new ArrayList<String>(whs);
	    int c= al.size();
		for (int i = c-1; i >= 0; i--) {
			Thread.sleep(3000);
			String g = al.get(i);
			driver.switchTo().window(g);
			driver.close();
		}	
	}
}
