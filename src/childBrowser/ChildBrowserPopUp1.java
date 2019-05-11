package childBrowser;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp1 {

	public static void main(String[] args) throws Exception {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> whs = driver.getWindowHandles();
		//counting total no. of browsers opened by selenium
		int c = whs.size();
		System.out.println(c);

		//printing window handle id of all the browsers
		for (String w : whs) {
			System.out.println(w);	
		}
		//printing tital of all the browsers
		for (String w2 : whs) {
			driver.switchTo().window(w2);
			String t = driver.getTitle();
			System.out.println(t);	
		}
		//closing all the browsers without using quit() method
		for (String w3: whs) {
			driver.switchTo().window(w3);
			driver.close();
		}		
	}
}
