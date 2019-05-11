package seleniumGrid;

import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class IEGridTest {
@Test	
public void sameSystem() throws MalformedURLException {
		
		URL whichSystem=new URL("http://192.168.118.1:4444/wd/hub");
		DesiredCapabilities whichBrowser=new DesiredCapabilities();
		whichBrowser.setBrowserName("chrome");
		
		InternetExplorerOptions opt=new InternetExplorerOptions();
		opt.merge(whichBrowser);
		
		WebDriver driver = new RemoteWebDriver(whichSystem, whichBrowser);
		driver.get("http://www.google.com");
		driver.switchTo().activeElement().sendKeys("selenium");
	}
}
