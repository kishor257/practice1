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

public class ChromeTestNaveenAutomation {
@Test	
public void sameSystem() throws MalformedURLException {
		
		URL whichSystem=new URL("http://192.168.118.1:4444/wd/hub");
		DesiredCapabilities whichBrowser=new DesiredCapabilities();
		whichBrowser.setBrowserName("chrome");
		whichBrowser.setPlatform(Platform.WINDOWS);//for windows7 select windows
		
		//before 3.6/3.7 version we dont need to define chromeoptions but now its required bcoz earlier chromeoptions concept wasnt there 
		ChromeOptions options=new ChromeOptions();
		options.merge(whichBrowser);
		
		WebDriver driver = new RemoteWebDriver(whichSystem, options);
		driver.get("http://www.google.com");
		driver.switchTo().activeElement().sendKeys("selenium");
	}
}
