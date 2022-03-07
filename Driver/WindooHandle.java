package com.seleniumprojects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindooHandle extends BaseClass{
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.edge.driver",".\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	
		
		WebElement bestSeller = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));

		Actions a = new Actions(driver);
		a.contextClick(bestSeller).perform();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		a.contextClick(mobile).perform();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	
		WebElement todayDeal = driver.findElement(By.xpath("//a[text()='Mobiles']//following::a[1]"));
		a.contextClick(todayDeal).perform();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		String parentWindowHandle = driver. getWindowHandle();
		windowsHandlee();
		

	}

}
