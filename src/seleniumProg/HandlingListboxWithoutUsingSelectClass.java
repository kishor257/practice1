package seleniumProg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingListboxWithoutUsingSelectClass {

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
		WebElement ld=driver.findElement(By.xpath("//*[@id='leaveperiod_cmbStartMonth']"));
		//after selecting the element no need to click on that element if click doesnt matter it will work
		//ld.click();
		//		ld.sendKeys(Keys.DOWN);
		//		ld.sendKeys(Keys.DOWN);
		//		ld.sendKeys(Keys.DOWN);

		//keys.DOWN and keys.ARROW_DOWN both works fine
		//		ld.sendKeys(Keys.ARROW_DOWN);
		//		ld.sendKeys(Keys.ARROW_DOWN);
		//		ld.sendKeys(Keys.ARROW_DOWN);
		//		ld.click();

		//trying with robot class its working fine
		ld.click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//*[@id='leaveperiod_cmbStartDate']"));

		//driver.close();
	}

}
