package com.WEBTABLESpratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DYNAMICWEBTABLESTOCHECKBOX {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://ui.cogmento.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("deepakchandra.ch@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("DeadSilence@2018");
		
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		
		
		
	
		
		String before_xapth="//table[@class='ui celled sortable striped table custom-grid']/tbody/tr[";
		String after_xpath="]/td[2]";
		
		for (int i=1;i<8;i++) {
			
		String name=driver.findElement(By.xpath(before_xapth+i+after_xpath)).getText();
		
		System.out.println(name);
		
		if(name.contains("KINGKOHLI")) {
			
			driver.findElement(By.xpath("//table[@class='ui celled sortable striped table custom-grid']/tbody/tr["+i+"]/td[1]//input))")).click();
		
		
		}
	
		
		}
		
		

	}

}
