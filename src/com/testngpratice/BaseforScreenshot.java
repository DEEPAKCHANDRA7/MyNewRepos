package com.testngpratice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseforScreenshot {
	
	public static WebDriver driver;
	
	public static void intialization() throws InterruptedException {
		
		driver=new  ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(5000);
		
		
		
		
	}
	
	
	public void failed(String testclassName)  {
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(src,new File("C:\\Users\\Deepak\\Desktop\\selenium prep\\shots"+testclassName+"_"+".jpg"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
