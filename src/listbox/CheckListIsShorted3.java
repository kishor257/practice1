package listbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckListIsShorted3 {
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///E:/selenium_pgm/html_pages_created_by_me/listbox.html");
		driver.manage().window().maximize();
		WebElement lw = driver.findElement(By.id("mtr"));
		Select s=new Select(lw);
		List op = s.getOptions();
		TreeSet ts=new TreeSet(op);
		if (op.equals(ts)) {
			System.out.println("sorted");
		} else {
			System.out.println("not sorted");
		}
	}
}
