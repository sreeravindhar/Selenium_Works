package com.seleniumprojects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Hotpit_Login {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", ".\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotpit.in/");
		
		WebElement emailId = driver.findElement(By.xpath("//a[@class='login']"));
		Thread.sleep(2500);
		emailId.click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//a[@class='nav-link']")).click();
		driver.findElement(By.id("register-username")).sendKeys("Sree Ravindhar");
		driver.findElement(By.id("register-email")).sendKeys("sreeravindhar23@gmail.com");
		driver.findElement(By.id("register-password")).sendKeys("Sree@8144");
		driver.findElement(By.xpath("//label[@class='form-control-label font-secondary']")).click();
		driver.findElement(By.id("registerBtn")).click();
		//driver.findElement(By.xpath("//button[@class='btn btn-dark btn-md mb-1']")).click();
		
		
		
	
		
		
		
		
		
		
		
		

	}
}
