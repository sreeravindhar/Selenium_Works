package com.seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Google_search {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",".\\\\Driver\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/webhp?authuser=1");
	
		driver.findElement(By.name("q")).sendKeys("sree ravindhar");
		
		Thread.sleep(3000);
		 
    	driver.findElement(By.name("btnK")).submit();
		
		
		
	}

}
