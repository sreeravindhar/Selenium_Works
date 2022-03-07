package com.seleniumprojects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserLaunch {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.edge.driver", ".\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotpit.in/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.hotpit.in/shop/bike/Honda");
		Thread.sleep(1500);
		driver.navigate().to("https://www.hotpit.in/product/Honda-CBR-250-Radiator-Guard");
		TakesScreenshot hi = (TakesScreenshot) driver;
		File screenshotAs = hi.getScreenshotAs(OutputType.FILE);
		File file = new File("A:\\My data\\Java\\NewSeleniumProject\\Screenshot\\file.png");
		FileUtils.copyFile(screenshotAs, file);
		System.out.println();

		/*
		 * driver.navigate().back(); String currentUrl = driver.getCurrentUrl();
		 * System.out.println("My current URL is " + currentUrl); String title =
		 * driver.getTitle(); System.out.println("My title is " + title);
		 * driver.manage().window().maximize();
		 */

	}

}
