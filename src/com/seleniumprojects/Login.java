package com.seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Login {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", ".\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotpit.in/login");
		driver.findElement(By.id("singin-email")).sendKeys("ravi230998@gmail.com");
		driver.findElement(By.id("singin-password")).sendKeys("Sree@81224");
		driver.findElement(By.id("signinbtn")).click();
		

		driver.findElement(By.partialLinkText("your")).click();
	//	driver.findElement(By.tagName("input")).sendKeys("abc@gmail.com");

	}

}
