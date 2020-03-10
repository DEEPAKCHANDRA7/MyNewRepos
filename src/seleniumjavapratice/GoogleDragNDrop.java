package seleniumjavapratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleDragNDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
	WebElement ele=	driver.findElement(By.xpath("//input[@name='q']"));
	
	ele.sendKeys("DEEPAK CHANDRA");
	System.out.println("validating text with getText()"+ele.getText());
	
	System.out.println("validating text with attribute     "    +ele.getAttribute("value"));
	
	Thread.sleep(4000);
	
	Actions act=new Actions(driver);
	act.contextClick(ele).build().perform();
	
	System.out.println(act.getClass());
	
	
	
	
	driver.get("https://jqueryui.com/droppable/");
	
	
	////iframe[@class='demo-frame']
	
	WebElement framae=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	
	driver.switchTo().frame(framae);
	
	WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
	act.dragAndDrop(source, target).build().perform();
	
		
		
	}

}
