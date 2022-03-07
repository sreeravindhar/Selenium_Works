package com.seleniumprojects;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mouse_Hover {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",".\\\\Driver\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		Actions as = new Actions(driver);
		
		as.moveToElement(women).perform();
		Thread.sleep(2000);
		WebElement tshirt = driver.findElement(By.xpath("//a[text()='T-shirts']"));
		as.moveToElement(tshirt).click().perform();
		
		
	}

}
