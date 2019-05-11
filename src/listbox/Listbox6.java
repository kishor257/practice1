package listbox;

import java.util.List;
import java.util.TreeMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox6 {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/selenium_pgm/html_pages_created_by_me/listbox.html");
		WebElement lb=driver.findElement(By.id("mtr"));
		Select s=new Select(lb);
		List<WebElement> op = s.getOptions();
		int c=op.size();
		TreeMap<String,Integer> ts=new TreeMap<String,Integer>();
		for (int i = 0; i < c; i++) {
			WebElement go=op.get(i);
			String t=go.getText();
			if (ts.containsKey(t)) {
				Integer v = ts.get(t);
				v++;
				ts.put(t, v);
			}else {
				ts.put(t, 1);
			}
		}
		System.out.println(ts);
	}
}
