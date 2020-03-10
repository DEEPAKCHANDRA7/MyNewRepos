
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDuplicateElements {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		
		WebElement days=driver.findElement(By.id("day"));
		Select s=new Select(days);
		
		List<WebElement>list=s.getOptions();
		
		for(WebElement ele:list) {
			System.out.println(ele.getText());
		}
	
		Set set=new HashSet();
		

		for(WebElement ele2:list) {
			
			set.add(ele2);
			System.out.println("printing all the Set elements"+ele2.getText());
		}
	
		
		
		
		
		
	}

}
