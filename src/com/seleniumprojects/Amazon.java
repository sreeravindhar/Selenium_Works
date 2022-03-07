package com.seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon {
	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", ".\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung");
	//	driver.findElement(By.className("nav-input nav-progressive-attribute")).click();
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.className("s-image")).click();
		
	//	driver.findElement(By.linkText("Visit the Samsung Store")).click();
		
	
		
	}

}
