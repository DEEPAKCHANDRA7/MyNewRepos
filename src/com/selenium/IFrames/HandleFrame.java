package com.selenium.IFrames;

import java.util.concurrent.TimeUnit;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleFrame {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

    	Actions act =new Actions(driver);
    	
    	WebElement ele=driver.findElement(By.xpath("//a[contains(text(),'Frames')]"));
    	act.moveToElement(ele).click().build().perform();
    	
    	
    

	}

}
