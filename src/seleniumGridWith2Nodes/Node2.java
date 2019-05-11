package seleniumGridWith2Nodes;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Node2 {
@Test	
public void sameSystem() throws MalformedURLException {
		
		DesiredCapabilities whichBrowser = new DesiredCapabilities();
		whichBrowser.setBrowserName("firefox");
		whichBrowser.setPlatform(Platform.WINDOWS);
		
		FirefoxOptions options=new FirefoxOptions();
		options.merge(whichBrowser);
			
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.118.1:4444/wd/hub"), options);
		driver.get("http://www.yatra.com");
		driver.switchTo().activeElement().sendKeys("selenium");
	}
}
