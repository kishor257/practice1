package listbox;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/selenium_pgm/html_pages_created_by_me/listbox.html");
		WebElement lb=driver.findElement(By.id("mtr"));
		Select s=new Select(lb);
		List<WebElement> options = s.getOptions();
		int c=options.size();
		ArrayList al=new ArrayList();
		TreeSet ts=new TreeSet();
		for (int i = 0; i < c; i++) {
			WebElement op=options.get(i);
			String t=op.getText();
			al.add(t);
			ts.add(t);
		}
		if (al.equals(ts)) {
			System.out.println("listbox has not duplicate");
		} else {
			System.out.println("listbox has duplicate");
		}
	}
}
