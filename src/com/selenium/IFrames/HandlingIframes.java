package com.selenium.IFrames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIframes {
public static void main(String[] args) {

WebDriver driver = new ChromeDriver();
driver.get("https://www.softwaretestingclass.com/");

//Finding iframes
List<WebElement> elements = driver.findElements(By.tagName("iframe"));

int numberOfTags = elements.size();

System.out.println("No. of Iframes on this Web Page are: "+ numberOfTags);

}
}