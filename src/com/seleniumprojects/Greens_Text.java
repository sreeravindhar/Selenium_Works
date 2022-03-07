package com.seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Greens_Text extends BaseClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", ".\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		findElement("xpath","(//p[@style='text-align:justify; font-size:18px;'])[2]");
		getText("xpath");
		
	   

	}

}
