package com.seleniumprojects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_Example {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", ".\\\\Driver\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		Alert s = driver.switchTo().alert();
		Thread.sleep(3000);
		s.accept();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		//Alert r = driver.switchTo().alert();
		Thread.sleep(3000);
		s.dismiss();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		//Alert e = driver.switchTo().alert();
		
		Thread.sleep(3000);
		s.sendKeys("Hello");
		Thread.sleep(3000);
		s.accept();
		

	}
}
