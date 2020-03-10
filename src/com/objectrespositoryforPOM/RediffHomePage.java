package com.objectrespositoryforPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePage {
	
	WebDriver driver;
	
	public RediffHomePage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	
	@FindBy(xpath="//input[@id='inp_search_box']")
	
	WebElement search;
	
@FindBy(xpath="//button[@class='rd_srcbtn']//b")
	
	WebElement searchbutton;


public WebElement Search() {
	
	return search;
}


public WebElement SearchButton() {
	
	return searchbutton;
}







	

}
