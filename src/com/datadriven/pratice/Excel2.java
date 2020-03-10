package com.datadriven.pratice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Excel2{
	
	public static WebDriver driver;
	
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static FileInputStream fis;
	
	public static Properties pr;
	public static String username;
	
	public static String  password;
	
	public static String URL;
	


public static void main(String[] args) throws IOException {
	
	
	
	fis=new FileInputStream("C:\\\\Users\\\\Deepak\\\\Desktop\\\\ADDEMPLOYEE.xlsx");
	 
	wb=new XSSFWorkbook(fis);
	
	ws=wb.getSheet("LOGINDETAILS");
	
	//getting the ROW count
	
	int Rcount=ws.getLastRowNum();
	
	System.out.println(Rcount);
	
	//For multiple interations of  rows 
	
	for(int i=1;i<=Rcount;i++) {
		
		XSSFRow wr=ws.getRow(i);
		
		//cells
		
		XSSFCell wc=wr.getCell(0);
		XSSFCell wc1=wr.getCell(1);
		XSSFCell wc2=wr.getCell(2);
		
		//getting all the cell values
		
		URL=wc.getStringCellValue();
		
		username=wc1.getStringCellValue();
		password=wc2.getStringCellValue();
		
		
		
		driver=new ChromeDriver();
		pr=new Properties();
		fis=new FileInputStream("D:\\NEW PROJECT\\SEL&JAVAINTERV\\src\\com\\datadriven\\pratice\\object.properties");
		
		pr.load(fis);
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(pr.getProperty("Userid"))).sendKeys(username);
		driver.findElement(By.xpath(pr.getProperty("password"))).sendKeys(password);
		driver.findElement(By.xpath(pr.getProperty("LoginsumbitBtn"))).click();
		
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
		
		
		
	}
	
	
	
	
	
	
	
	
}}
