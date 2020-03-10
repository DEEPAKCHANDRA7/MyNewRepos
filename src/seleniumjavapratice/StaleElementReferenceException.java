package seleniumjavapratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://classic.crmpro.com/login.cfm");
	
	WebElement username=driver.findElement(By.xpath("//input[@placeholder='Login']"));
	username.sendKeys("deepak chandra");
	
	WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
	password.sendKeys("123456789");
	driver.navigate().refresh();
	// with below step  we will get the Stale Element Exception to overcome this we need to handle by using Exception and identify element again
	
	///username.sendKeys("deepak chandra");
	
	try {
		username.sendKeys("deepak chandra");
	}
	
	catch(Exception e) {
		username=driver.findElement(By.xpath("//input[@placeholder='Login']"));
		
		username.sendKeys("deepak chandra");
		
		System.out.println(e.getMessage());
		
		
	
		
	}
	

	

	}

}
