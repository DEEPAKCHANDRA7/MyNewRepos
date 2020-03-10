package seleniumjavapratice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.Naukri.com/");
		
		Thread.sleep(2000);
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		for(int i=0;i<links.size();i++) {
			
			WebElement element=links.get(i);
		String url=	element.getAttribute("href");
			
			URL link=new URL(url);
			
			
			HttpURLConnection httpconn=(HttpURLConnection)link.openConnection();
			Thread.sleep(5000);
			
			httpconn.connect();
			int responsecode=httpconn.getResponseCode();
			
			if(responsecode>=400) {
				
				
				System.out.println(url+"------------------"+"broken links are found");
			}
			
			else {
				
				System.out.println(url+"------------------"+"Validated link");
				
			}
			
		}
		
		
		

	}

}
