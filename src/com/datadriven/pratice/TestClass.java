package com.datadriven.pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args)  throws Exception{
		
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://localhost/orangehrm/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
driver.findElement(By.xpath("//div[@id='divUsername']/input[@id='txtUsername']//following::div[@id='divPassword']/input[@id='txtPassword']")).sendKeys("deepak123");
		
		driver.findElement(By.xpath("//div[@id='divPassword']/input[@id='txtPassword']//preceding::div[@id='divUsername']/input[@id='txtUsername']")).sendKeys("deepak");

	}

}
