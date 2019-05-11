package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SameSystem {
	@Parameters({"node","browser"})
	@Test
	public void sameSystem(String node,String browser) throws MalformedURLException {
		
		URL whichSystem=new URL(node);
		DesiredCapabilities whichBrowser=new DesiredCapabilities();
		whichBrowser.setBrowserName(browser);
		WebDriver driver = new RemoteWebDriver(whichSystem, whichBrowser);
		driver.get("http://www.google.com");
		driver.switchTo().activeElement().sendKeys("selenium");
	
	}
}
