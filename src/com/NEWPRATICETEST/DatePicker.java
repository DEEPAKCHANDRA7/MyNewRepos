package com.NEWPRATICETEST;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub//https://www.phptravels.net/
		
		
		
		String selected_Month="December,\r\n" + 
				"2020";
				
		System.out.println(selected_Month);
		
		
		String selected_day="23";
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.phptravels.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='checkin']")).click();
		
		String a="December,\r\n" + 
				"2019";
		
		while(true) {
			
			
			String value=driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[1]/nav/div[2]")).getText();
			
			System.out.println(value);
			
			String array[]=value.split("\\r\\n");
			System.out.println(Arrays.toString(array));
			String joinedString = String.join("\r\n", array);
			
			System.out.println("my Joined String"+joinedString);
			
			boolean b=joinedString.equalsIgnoreCase(selected_Month);
			
			System.out.println("boolean condition"+b);
			
			if(joinedString.trim().contains(selected_Month.trim())) {
				break;
				
			
			}
			else {
				
				driver.findElement(By.xpath("//body[@class='with-waypoint-sticky']/div[@id='datepickers-container']/div[1]/nav[1]/div[3]/*[1]")).click();
			}
			
		}
		
		driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[1]/div/div/div[2]/div["+selected_day+"]")).click();

	}

}
