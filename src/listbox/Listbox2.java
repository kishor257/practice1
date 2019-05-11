package listbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///E:/selenium_pgm/html_pages_created_by_me/listbox.html");
		driver.manage().window().maximize();
		WebElement lw = driver.findElement(By.id("mtr"));
		Select s=new Select(lw);
		//counting no. of options
		List<WebElement> op = s.getOptions();
		int c=op.size();
		ArrayList al=new ArrayList();
		//printing no. of options
		for (int i = 0; i < c; i++) {
			WebElement go=op.get(i);
			String t=go.getText();
			al.add(t);	
		}
		Collections.sort(al);
		System.out.println(al);
		Thread.sleep(5000);
		driver.close();
	}
}
