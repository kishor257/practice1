package seleniumProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopUp {
	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:81/orangehrm/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("kishor");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("kishor1234");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//*[@id='menu_pim_viewMyDetails']/b")).click();
		driver.findElement(By.xpath("//*[@id='btnSave']")).click();
		driver.findElement(By.xpath("//*[@id='personal_txtLicExpDate']")).click();;
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[4]/a")).click();
	}
}
