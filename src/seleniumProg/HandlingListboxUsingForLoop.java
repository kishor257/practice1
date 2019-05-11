package seleniumProg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingListboxUsingForLoop {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {	
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:81/orangehrm/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("kishor");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("kishor1234");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//*[@id='menu_leave_viewLeaveModule']/b")).click();
		List<WebElement> sm=driver.findElements(By.xpath("//*[@id='leaveperiod_cmbStartMonth']/option"));
		int n=sm.size();
		//using for loop
		for (int i = 0; i < n; i++) {
			WebElement v=sm.get(i);
			if (i==3) {
				v.click();		
			}
		}
	}
}

