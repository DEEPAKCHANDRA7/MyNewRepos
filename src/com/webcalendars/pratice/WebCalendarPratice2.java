package com.webcalendars.pratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCalendarPratice2 {

	public static void main(String[] args) {
		
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://www.expedia.ca/");
		
		driver.findElement(By.xpath("//input[@id='hotel-checkin-hp-hotel']")).click();
		
		String month="Sep 2020";
		String day="30";
		
		while(true) {
		
	String name=driver.findElement(By.xpath("//caption")).getText();
	
	if(name.equals(month)) {
		break;
	}
		
	else {
		
		
		driver.findElement(By.xpath("//button[@class='datepicker-paging datepicker-next btn-paging btn-secondary next']")).click();
	}
		}
		
		
	List<WebElement>all_dates=driver.findElements(By.xpath("//div[@class='tabs-container col']//div[2]//table[1]//tbody[1]//tr//td//button[1]"));
	
	for(WebElement ele:all_dates) {
	String date_text=ele.getText();
	
	String date[]=date_text.split("\n");
	
	if(date[1].equals(day)) {
		
		ele.click();
		
		System.out.println(ele.getText());
		break;
		
	}
	}

	}

}
