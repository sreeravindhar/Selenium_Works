package com.seleniumprojects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTable extends BaseClass {
	
	public static void main (String[] args) {
		getBrowser("firefox");
		getUrl("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> allData = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		for (WebElement data : allData) {
			System.out.println(data.getText());
			
		}
		minimize();
	

				
		
	}

}
