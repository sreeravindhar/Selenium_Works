package com.seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames_Task {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", ".\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame("SingleFrame");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Ravindhar");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
		driver.switchTo()
		.frame(driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']")));
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Vanduruchiiiii");
		driver.switchTo().defaultContent();
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
		

	}

}
