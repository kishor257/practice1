package javaProg;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestIE {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/IEDriverServer.exe");
	}
	public static void main(String[] args) {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriver driver = new InternetExplorerDriver(cap);
		driver.get("http://localhost/login.do");
		WebElement ele = driver.findElement(By.id("username"));
		for (int i = 0; i < 5; i++) {
			ele.sendKeys("admin");
			ele.clear();
		}
	}

}
