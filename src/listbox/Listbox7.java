package listbox;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox7 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/selenium_pgm/html_pages_created_by_me/listbox.html");
		WebElement lb=driver.findElement(By.id("mtr"));
		Select s=new Select(lb);
		List<WebElement> op = s.getOptions();
		int c=op.size();
		ArrayList al=new ArrayList();
		for (int i = 0; i < c; i++) {
			WebElement go=op.get(i);
			String t=go.getText();
			al.add(t);	
		}
		//enter the specified option u r searching for
		System.out.println("enter the specified option");
		Scanner scan=new Scanner(System.in);
		String val = scan.nextLine();
		System.out.println("..........................");
		if (al.contains(val)) {
			System.out.println(val+ " is present in listbox");
		}else {
			System.out.println(val+ " is not present in listbox");
		}
	}
}
