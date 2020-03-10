package seleniumjavapratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessbrowserTesting {

	public static void main(String[] args) {
WebDriver driver=new HtmlUnitDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("http://localhost/orangehrm/symfony/web/index.php/dashboard");
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
	
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("deepak");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("deepak123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		System.out.println(driver.getTitle());

	}

}
