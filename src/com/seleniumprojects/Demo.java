package com.seleniumprojects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demo extends BaseClass{
	public static void main(String[] args) throws IOException, InterruptedException {
		getBrowser("firefox");
		getUrl("http://www.facebook.com");
		findElement("name", "email");
		sendKey("name", "abc@gmail.com");
		findElement("xpath", "//input[@type='password']") ;
		sendKey("xpath", "12345");
		findElement("name", "login");
		clickButton("name");
		navigateTo("https://www.udemy.com/");
		getTitle();
		Thread.sleep(3000);
		navigateReferesh();
		Thread.sleep(3000);
		navigateBack();
		screenShot("A:\\My data\\Java\\NewSeleniumProject\\Screenshot\\file.png");
		getUrl();
		getTitle();
		navigateTo("http://www.greenstechnologys.com/");
		findElement("xpath", "(//p[@style='text-align:justify; font-size:18px;'])[1]");
		getText("xpath");
		navigateTo("http://demo.automationtesting.in/Alerts.html");
		findElement("xpath", "//button[@onclick='alertbox()']");
		clickButton("xpath");
		Thread.sleep(3000);
		alerts("accept");
		navigateTo("https://www.amazon.in/");
		Thread.sleep(3000);
		findElement("xpath", "//img[@alt='Top offers from Oneplus, Xiaomi ,Mivi Mobile Accessories']");
		scrollUpDown("xpath");
		Thread.sleep(3000);
		actionss("xpath", "context");
		Thread.sleep(3000);
		navigateTo("http://demo.automationtesting.in/Frames.html");
		framess("string", "SingleFrame");
		findElement("xpath", "(//input[@type='text'])[1]");
		sendKey("xpath", "vanduchailaya");
		screenShot("A:\\My data\\Java\\NewSeleniumProject\\Screenshot\\image2.png");
		switchframe("default");
		findElement("xpath", "//a[text()='Iframe with in an Iframe']");
		clickButton("xpath");
		Thread.sleep(3000);
		framess("webelement", "//iframe[@src='MultipleFrames.html']");
		Thread.sleep(3000);
		framess("webelement", "//iframe[@style='float: left;height: 250px;width: 400px']");
		Thread.sleep(3000);
		findElement("xpath", "/html/body/section/div/div/div/input");
		sendKey("xpath", "--------------Hellooooooo-----------------");
		Thread.sleep(3000);
		quit();
		
	
		
	}

}
