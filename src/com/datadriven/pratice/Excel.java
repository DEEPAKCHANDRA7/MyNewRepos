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

public class Excel 


{   
	public static WebDriver driver;
	public static Properties pr;
	public static FileInputStream fis;
	public static FileInputStream Fis;
	public static String firstname;
	public static String lastname;
	public static String Country;
	public static String martialstatus;
	public static String DOB;
	public static String LED;
	
	
	
	
	public static void main(String[] args) throws IOException {
		driver=new ChromeDriver();
		pr=new Properties();
		fis=new FileInputStream("D:\\NEW PROJECT\\SEL&JAVAINTERV\\src\\com\\datadriven\\pratice\\object.properties");
		
		pr.load(fis);
		driver.get(pr.getProperty("Url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(pr.getProperty("Userid"))).sendKeys("deepak");
		driver.findElement(By.xpath(pr.getProperty("password"))).sendKeys("deepak123");
		driver.findElement(By.xpath(pr.getProperty("LoginsumbitBtn"))).click();
		
		
		
		
		
		
         
        
         
         FileInputStream Fis=new FileInputStream("D:\\ADDEMPLOYEE.xlsx");
         
         //WorkBook
         
         XSSFWorkbook WB=new XSSFWorkbook(Fis);
         
         //Sheet
         
         XSSFSheet WS=WB.getSheet("AddEmployee");
         
         //Row Count
         
         int Rcount=WS.getLastRowNum();
         System.out.println(Rcount);
         
         //Multiple Iterations ---- For Loop
         
         for (int i=1;i<=Rcount;i++) 
         {
        	 //Row
        	 
        	 XSSFRow WR=WS.getRow(i);
        	 
        	 //Cells
        	 
        	 XSSFCell WC=WR.getCell(0);
         	 XSSFCell WC1=WR.getCell(1);
         	 XSSFCell WC2=WR.getCell(2);
			
         	 XSSFCell WC3=WR.getCell(3);
         	XSSFCell WC4=WR.getCell(4);
         	XSSFCell WC5=WR.getCell(5);
         	XSSFCell WC6=WR.createCell(6);
         	
         	 
         	//Cell Values
         	 
         	  firstname=WC.getStringCellValue();
         	  lastname=WC1.getStringCellValue();
         	  Country=WC2.getStringCellValue();
         	  martialstatus=WC3.getStringCellValue();
         	  DOB=WC4.getStringCellValue();
         	  LED=WC5.getStringCellValue();
         	 
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
         	nationality.selectByVisibleText(Country);
         	driver.findElement(By.xpath(pr.getProperty("DateofBirth"))).clear();
         	driver.findElement(By.xpath(pr.getProperty("DateofBirth"))).sendKeys(DOB);
         	
         	driver.findElement(By.xpath(pr.getProperty("LicenseExpiryDate"))).clear();
         	
         	
         	
         	driver.findElement(By.xpath(pr.getProperty("LicenseExpiryDate"))).sendKeys(LED);
         	
         	driver.findElement(By.xpath(pr.getProperty("save"))).click();
         	
         	

         	 
         	  
         	  
         	  
         	  
         	  
         	 
         	 
         	 }

         
         
         
       FileOutputStream Fos=new FileOutputStream("C:\\\\Users\\\\Deepak\\\\Desktop\\\\ADDEMPLOYEEresult.xlsx");  
       WB.write(Fos);
       WB.close();
         
         
         
         
         
         
	

}
}