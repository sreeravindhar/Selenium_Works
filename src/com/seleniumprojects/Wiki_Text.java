package com.seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Wiki_Text {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", ".\\\\Driver\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		driver.findElement(By.id("searchInput")).sendKeys("Java");
		driver.findElement(By.xpath("//i[text()='Search']")).click();
		WebElement text = driver.findElement(By.xpath("//b[text()='Java']"));
		System.out.println(text.getText());
	}

}
