package com.datadriven.pratice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseLibrary2 {
	
	public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties pr;
	
	
	public String LaunchApp(String url) throws IOException {
		
		driver=new ChromeDriver();
		driver.get(url);
		fis=new FileInputStream("D:\\NEW PROJECT\\SEL&JAVAINTERV\\src\\com\\datadriven\\pratice\\object.properties");
		
		pr.load(fis);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
		
		return url;
		
	}

	public void Login(String username,String password) {
		

		driver.findElement(By.xpath(pr.getProperty("Userid"))).sendKeys(pr.getProperty(username));
		driver.findElement(By.xpath(pr.getProperty("password"))).sendKeys(pr.getProperty(password));
		driver.findElement(By.xpath(pr.getProperty("LoginsumbitBtn"))).click();
		
		
	
		
	}
	
	public String AddEmployee(String firstname,String lastname,String country,String martialstatus,String dob,String led) {
		
		driver.findElement(By.xpath(pr.getProperty("PIM"))).click();
		driver.findElement(By.xpath(pr.getProperty("EmployyeList"))).click();
		driver.findElement(By.xpath(pr.getProperty("AddEmployeebtn"))).click();
		driver.findElement(By.xpath(pr.getProperty("EmpFirstName"))).sendKeys(firstname);
		driver.findElement(By.xpath(pr.getProperty("EmpLastName"))).sendKeys(lastname);
		driver.findElement(By.xpath(pr.getProperty("EmpSave"))).click();
		
	
		driver.findElement(By.xpath(pr.getProperty("EmpEdit"))).click();
		driver.findElement(By.xpath(pr.getProperty("Gender"))).click();
		
		Select martialStatus=new Select(driver.findElement(By.xpath(pr.getProperty("MartialStatus"))));
		martialStatus.selectByVisibleText(martialstatus);
		

		Select nationality=new Select(driver.findElement(By.xpath(pr.getProperty("Nationality"))));
		nationality.selectByVisibleText(martialstatus);
		driver.findElement(By.xpath(pr.getProperty("DateofBirth"))).clear();
		driver.findElement(By.xpath(pr.getProperty("DateofBirth"))).sendKeys(dob);
		
		driver.findElement(By.xpath(pr.getProperty("LicenseExpiryDate"))).clear();
		
		
		
		driver.findElement(By.xpath(pr.getProperty("LicenseExpiryDate"))).sendKeys(led);
		
		driver.findElement(By.xpath(pr.getProperty("save"))).click();
		
		
		
		return firstname;
		
	}
}
