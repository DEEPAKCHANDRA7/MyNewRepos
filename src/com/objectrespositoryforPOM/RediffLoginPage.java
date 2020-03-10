package com.objectrespositoryforPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	WebDriver driver;
	
	public RediffLoginPage(WebDriver driver) {
		
		this.driver=driver;
		
		
		
	}
	
	By username=By.xpath("//input[@id='login1']");
	By password=By.xpath("//input[@id='password']");
	By go=By.xpath("//input[@name='proceed']");
	
	
	
	public WebElement EmailID() {
		
		
		return driver.findElement(username);
		
	}
	

	public WebElement Password() {
		
		
		return driver.findElement(password);
		
	}
	
public WebElement button() {
		
		
		return driver.findElement(go);
		
	}
	


}
