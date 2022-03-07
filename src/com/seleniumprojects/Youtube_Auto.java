package com.seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Youtube_Auto {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", ".\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.name("search_query")).sendKeys("Sajanka");
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(3000);
	
		driver.findElement(By.xpath(
         "//img[@src='https://i.ytimg.com/vi/ezu15x0FJZY/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLA5RK7xerTW06YsAodvpfUFUjjHwQ']")).click();
        Thread.sleep(6000);
		driver.findElement(By.id("ad-text:6")).click();
}
}
