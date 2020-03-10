package seleniumjavapratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LOGINUSINGHASHMAP {
	
	public  WebDriver driver;
	public  static String admincredintals;
	public static  String admininfo[];
	
	
	
	
	@BeforeMethod()
	public void LaunchBrowser() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://localhost/orangehrm/symfony/web/index.php/auth/login");
		
		}
	
	@Test(priority=1)
	public void adminLogin() throws InterruptedException {
		
		admincredintals=DATAHASHMAP.Loginfo().get("admin");
		
		admininfo=admincredintals.split("_");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(admininfo[0]);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(admininfo[1]);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		Thread.sleep(3000);
		
	}
	

@Test(priority=2)
	public void admindeepakLogin() throws InterruptedException {
		
		admincredintals=DATAHASHMAP.Loginfo().get("deepakchandra admin");
		
		admininfo=admincredintals.split("_");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(admininfo[0]);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(admininfo[1]);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		Thread.sleep(3000);
		
	}
	
	@AfterMethod()
	public void teardown() {
		
		
		driver.quit();
		
	}
	
	
	
	

}
