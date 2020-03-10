package com.selenium.IFrames;

import java.util.Iterator;		
import java.util.Set;		
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		

public class WindowHandles2 {				

    public static void main(String[] args) throws InterruptedException {									
        	WebDriver driver=new ChromeDriver();			
        		
        
        	// To maximize browser
        	driver.manage().window().maximize();
        	// To open Naukri website with multiple windows
        	driver.get("http://www.naukri.com/");
        	// It will return the parent window name as a String
        	String mainWindow=driver.getWindowHandle();
        	
        	System.out.println(mainWindow);
        	
        	System.out.println("main window title is:"+driver.getTitle());
        	// It returns no. of windows opened by WebDriver and will return Set of Strings
        	Set<String> set =driver.getWindowHandles();
        	// Using Iterator to iterate with in windows
        	Iterator<String> itr= set.iterator();
        	while(itr.hasNext()){
        	String childWindow=itr.next();
        	// Compare whether the main windows is not equal to child window. If not equal, we will close.
        	if(!mainWindow.equals(childWindow)){
        	driver.switchTo().window(childWindow);
        	driver.manage().window().maximize();
        	  
        	System.out.println("child window titles:"+driver.switchTo().window(childWindow).getTitle());
        	System.out.println("titles of webpages"    +driver.getTitle());
        	
        	driver.close();
        
        	}
        	}
    }}
