package seleniumjavapratice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RoboClassFileUploadOption {

	
	 static WebDriver driver;
	public static void main(String[] args) throws AWTException {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://localhost/orangehrm/symfony/web/index.php/dashboard");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("deepak");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("deepak123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
		
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']"))).build().perform();
		
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		
		driver.findElement(By.xpath("//input[@id='photofile']")).click();
		Robot robot=new Robot();
		
		StringSelection str=new StringSelection("C:\\Users\\Deepak\\Desktop\\Capture1.PNG");
		
		
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		
		robot.setAutoDelay(3000);
		///pressing         the key 
		robot.keyPress(KeyEvent.VK_CONTROL);
		
		
		
		robot.keyPress(KeyEvent.VK_V);
		
		//releasing the key
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		

		robot.setAutoDelay(3000);
		//pressing the enter 
		
		robot.keyPress(KeyEvent.VK_ENTER);
	
		
		//releasing the enter
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		

	}

}
