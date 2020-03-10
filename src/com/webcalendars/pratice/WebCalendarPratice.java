package com.webcalendars.pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCalendarPratice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://www.phptravels.net/");
		
		
		driver.findElement(By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']")).click();
		Thread.sleep(5000);
		
		
		String month="July 2019";
		
		String day="20";
		
		
		while(true) {
	String text=driver.findElement(By.xpath("//div[10]//div[1]//tr[1]//th[2]")).getText();
	
	if(text.equals(month)) {
		break;
	}
	else {
		
		
		driver.findElement(By.xpath("//div[10]//div[1]//tr[1]//th[3]")).click();
		
	}
		
		}
		
	driver.findElement(By.xpath("//div[10]//tr//td[contains(text(),'30')]")).click();
	
	
}
}