package com.selenium.IFrames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WINDOWHandles {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();


driver.get("https://support.google.com/");

System.out.println(driver.getTitle());

Set<String>windows=driver.getWindowHandles();

            Iterator itr=    windows.iterator();
            
            String ParentWin=(String) itr.next();

            String childWin=(String) itr.next();



           //switching to child window

            driver.switchTo().window(childWin);

            System.out.println(driver.getTitle());
            
            
	}

}
