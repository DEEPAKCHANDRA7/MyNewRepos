package com.testngpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTesting {
	
	

	
	
	@Test
	@Parameters({ "BrowserName" })
	 public void LaunchBrowser(String BrowserName) {
		
		WebDriver   driver=new ChromeDriver();
		
		driver.get("http://localhost/orangehrm/symfony/web/index.php/auth/login");
		
		}
	

	@Test
	@Parameters({ "username","password" })
	public void LoginasDeepak(String username,String password) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://localhost/orangehrm/symfony/web/index.php/auth/login");
		
	
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		
		
		
	}
	
	
	@Test
	@Parameters({ "username1","password1" })
	public void LoginasDeepakAdmin(String username1,String password1) throws InterruptedException {
		
		
		
WebDriver driver=new ChromeDriver();
		
		driver.get("http://localhost/orangehrm/symfony/web/index.php/auth/login");
		
	
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username1);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password1);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		
		
		

}
}