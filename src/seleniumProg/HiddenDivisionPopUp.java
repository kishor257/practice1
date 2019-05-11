package seleniumProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		CalenderPopUp date=new CalenderPopUp();
		String str = date.toString();
		System.out.println(str);
		String[] str2=str.split(" ");
		String today=str2[2];
		System.out.println(today);
		driver.findElement(By.linkText(today)).click();;
	}
	
	

}
