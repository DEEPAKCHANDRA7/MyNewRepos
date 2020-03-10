package testcasesforPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectrespositoryforPOM.RediffHomePage;
import com.objectrespositoryforPOM.RediffLoginPage;

public class RediffLoginApplication {
	
	
	@Test
	public void Login() {
		
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPage rlp=new RediffLoginPage(driver);
		rlp.EmailID().sendKeys("deepakchandra.ch");
		rlp.Password().sendKeys("elephant.12");
		rlp.button().click();
		
		RediffHomePage rhp=new RediffHomePage(driver);
		
		rhp.Search().sendKeys("Telgana news");
		rhp.SearchButton().click();
		
	}
}
