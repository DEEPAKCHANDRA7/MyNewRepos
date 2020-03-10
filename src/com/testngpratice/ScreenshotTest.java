package com.testngpratice;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListenerForScreenshot.class)
public class ScreenshotTest extends BaseforScreenshot{

	@BeforeMethod
	public void setup() throws InterruptedException {
		intialization();
	}

	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
	
	
	@Test
	public void takescreenshot() {
		
		Assert.assertEquals(false, true);
		
	}
	
	@Test
	public void takescreenshot1() {
		
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void takescreenshot2() {
		
		Assert.assertEquals(false, true);
	}	
	@Test
	public void takescreenshot3() {
		
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void takescreenshot4() {
		
		Assert.assertEquals(false, true);
		
		
	}
	
	
	
}





