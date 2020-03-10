package com.WEBTABLESpratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DYNAMICWEBTABLESTOCHECKBOX2 {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://localhost/orangehrm/symfony/web/index.php/dashboard");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("deepak");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("deepak123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
	List<WebElement>ele=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td"));
	
	
	
	String xpath_before="//table[@id='resultTable']/tbody/tr[";
	String xpath_after="]/td[2]";
	
	for(int i=1;i<5;i++) {
		
		String name=driver.findElement(By.xpath(xpath_before+i+xpath_after)).getText();
		System.out.println(name);
		
		if(name.contains("KINGKOHLI")) {
			
			
		driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[1]//input")).click();
		
		boolean a=driver.findElement(By.xpath("//input[@id='btnDelete']")).isEnabled();
		
		System.out.println(a);
		boolean b=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[1]//input")).isSelected();
		
		System.out.println(b);
		
		driver.findElement(By.xpath("//input[@id='btnDelete']")).click();
		
		driver.findElement(By.xpath("//input[@id='dialogDeleteBtn']")).click();
		
		
		
		


		
			
		}
		
		
	}
		
		
		
}
}



