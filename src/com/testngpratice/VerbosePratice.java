package com.testngpratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerbosePratice {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void Setup() {
		
		
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().deleteAllCookies();
		
	}
	
	@Test
	public void test1() {
		
		
		String title =driver.getTitle();
		
		System.out.println(title);
		
		Assert.assertEquals(title, "Facebook – log in or sign up");
		
		
	}

	@Test
	public void test2() {
		
		
		String title =driver.getTitle();
		
		System.out.println(title);
		
		Assert.assertEquals(title, "Facebook – log in or sign up");
		
		
	}
	
	@Test
	public void test3() {
		
		
		String title =driver.getTitle();
		
		System.out.println(title);
		
		Assert.assertEquals(title, "Facebook – log in or sign up");
		
		
	}
	@Test
	public void test4() {
		
		
		String title =driver.getTitle();
		
		System.out.println(title);
		
		Assert.assertEquals(title, "Facebook – log in or sign upass");
		
		
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
}
