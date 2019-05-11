package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTestEdureka {
@Test	
public void sameSystem() throws MalformedURLException {
		
		DesiredCapabilities whichBrowser = new DesiredCapabilities();
		whichBrowser.setBrowserName("chrome");
		whichBrowser.setPlatform(Platform.WINDOWS);
		
		ChromeOptions options=new ChromeOptions();
		options.merge(whichBrowser);
			
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.118.1:4444/wd/hub"), whichBrowser);
		driver.get("http://www.google.com");
		driver.switchTo().activeElement().sendKeys("selenium");
	}
}
