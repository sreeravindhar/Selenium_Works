package com.seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", ".\\\\Driver\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		WebElement one = driver.findElement(By.xpath("(//img[@itemprop='image'])[6]"));
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("arguments[0].scrollIntoView();",one);
		Thread.sleep(3000);
		WebElement two = driver.findElement(By.xpath("(//img[@alt='Printed Summer Dress'])[2]"));
		Actions e = new Actions(driver);
		e.moveToElement(two).perform();
		
		driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[6]/div/div[1]/div/a[2]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span/i")).cljick();
	//	WebElement three = driver.findElement(By.xpath("//select[@name='group_1']"));
	//	Select r = new Select(three);
	//	r.selectByIndex(2);
		WebElement Color = driver.findElement(By.id("color_8"));
		js.executeScript("arguments[0].click();", Color);
		
		
		

	}
}
