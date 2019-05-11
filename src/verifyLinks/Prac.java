package verifyLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("http://www.google.co.in/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total links are "+links.size());
		for (int i = 0; i < links.size(); i++) {
			WebElement  ele= links.get(i);
			String url = ele.getAttribute("href");
			verifyLinkActive(url);
			
		}
	}
	public static void verifyLinkActive(String linkUrl) throws IOException {
		
		URL url=new URL(linkUrl);
		HttpURLConnection huc=(HttpURLConnection)url.openConnection();
		huc.setConnectTimeout(3000);
		huc.connect();
		if (huc.getResponseCode()==200) {
			System.out.println(linkUrl+" "+huc.getResponseMessage());
		}
		if (huc.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
			System.out.println(linkUrl+" "+huc.getResponseMessage()+" "+HttpURLConnection.HTTP_NOT_FOUND);
		}	
	}
}
