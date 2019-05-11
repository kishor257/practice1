package listbox;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox3 {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/selenium_pgm/html_pages_created_by_me/listbox.html");
		WebElement lb=driver.findElement(By.id("mtr"));
		Select s=new Select(lb);
		List<WebElement> op = s.getOptions();
		int c=op.size();
		TreeSet ts=new TreeSet();
		for (int i = 0; i < c; i++) {
			WebElement g=op.get(i);
			String t=g.getText();
			ts.add(t);
		}
		System.out.println(ts);
	}
}
