package com.seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Task_2022 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("afc@gmail.com");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//i[@class='icon-user left']")).click();
		Thread.sleep(2500);
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.name("customer_firstname")).sendKeys("Divine");
		driver.findElement(By.id("customer_lastname")).sendKeys("D");
		driver.findElement(By.name("passwd")).sendKeys("Sree@8144");
		WebElement days = driver.findElement(By.id("days"));
		Select s = new Select(days);
		s.selectByValue("2");
		WebElement months = driver.findElement(By.id("months"));
		Select r = new Select(months);
		r.selectByIndex(2);
		WebElement years = driver.findElement(By.id("years"));
		Select e = new Select(years);
		e.selectByIndex(5);
		driver.findElement(By.name("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		driver.findElement(By.id("firstname")).sendKeys("Hello");
		driver.findElement(By.id("lastname")).sendKeys("World");
		driver.findElement(By.id("company")).sendKeys("Greens");
		driver.findElement(By.name("address1")).sendKeys("Don't No");
		driver.findElement(By.name("address2")).sendKeys("kkll");
		driver.findElement(By.name("city")).sendKeys("Matuthavani");
		WebElement state = driver.findElement(By.id("id_state"));
		Select d =  new Select(state);
		d.selectByIndex(3);
		driver.findElement(By.name("postcode")).sendKeys("5461816");
		driver.findElement(By.name("other")).sendKeys("Ada deiii");
		driver.findElement(By.id("phone")).sendKeys("1234567891");
		driver.findElement(By.name("phone_mobile")).sendKeys("1234567891");
		
		
		
		

		
		
		
		
		
	}

}
