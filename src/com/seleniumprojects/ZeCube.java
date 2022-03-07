package com.seleniumprojects;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ZeCube extends BaseClass{
	public static void main(String[] args) {
		getBrowser("firefox");
		getUrl("https://localhost/");
		List<WebElement> findElements = driver.findElements(By.tagName("a"));
		ListIterator<WebElement> size = findElements.listIterator();
		
	}
	
	

}
