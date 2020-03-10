package com.datadriven.pratice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseLibrary {
	
public static String ActualVal,ExpVal; 
public static WebDriver driver;
public static Properties pr;
public static FileInputStream fis;

public void LaunchApp() throws IOException {
	driver=new ChromeDriver();
	pr=new Properties();
	fis=new FileInputStream("D:\\NEW PROJECT\\SEL&JAVAINTERV\\src\\com\\datadriven\\pratice\\object.properties");
	
	pr.load(fis);
	driver.get(pr.getProperty("Url"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath(pr.getProperty("Userid"))).sendKeys(pr.getProperty("userId"));
	driver.findElement(By.xpath(pr.getProperty("password"))).sendKeys(pr.getProperty("Password"));
	driver.findElement(By.xpath(pr.getProperty("LoginsumbitBtn"))).click();
	ExpVal=driver.findElement(By.xpath(pr.getProperty("DashboardText"))).getText();
	ActualVal="Dashboard";
	if(ActualVal.contains(ExpVal)) {
		
		System.out.println("Welcome to Dashboard");
		
	}
	else {
		
		System.out.println("Not in Manager's Page Guru 99");
	}

}



public void addEmployee() throws InterruptedException {
	Thread.sleep(5000L);
	driver.findElement(By.xpath(pr.getProperty("PIM"))).click();
	driver.findElement(By.xpath(pr.getProperty("EmployyeList"))).click();
	driver.findElement(By.xpath(pr.getProperty("AddEmployeebtn"))).click();
	driver.findElement(By.xpath(pr.getProperty("EmpFirstName"))).sendKeys("JOHNWICK2");
	driver.findElement(By.xpath(pr.getProperty("EmpLastName"))).sendKeys("BABAYAGA2");
	driver.findElement(By.xpath(pr.getProperty("EmpSave"))).click();
	
	Thread.sleep(5000);
	driver.findElement(By.xpath(pr.getProperty("EmpEdit"))).click();
	driver.findElement(By.xpath(pr.getProperty("Gender"))).click();
	
	Select martialStatus=new Select(driver.findElement(By.xpath(pr.getProperty("MartialStatus"))));
	martialStatus.selectByVisibleText("Single");
	

	Select nationality=new Select(driver.findElement(By.xpath(pr.getProperty("Nationality"))));
	nationality.selectByVisibleText("Indian");
	driver.findElement(By.xpath(pr.getProperty("DateofBirth"))).clear();
	driver.findElement(By.xpath(pr.getProperty("DateofBirth"))).sendKeys("2019-04-23");
	
	driver.findElement(By.xpath(pr.getProperty("LicenseExpiryDate"))).clear();
	
	
	
	driver.findElement(By.xpath(pr.getProperty("LicenseExpiryDate"))).sendKeys("2019-05-23");
	
	driver.findElement(By.xpath(pr.getProperty("save"))).click();
	
	
	
	
	
	
}
public void teardown() {
	
	
	driver.close();
	
}

}
