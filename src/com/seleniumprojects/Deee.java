package com.seleniumprojects;

import java.awt.AWTException;

public class Deee extends BaseClass {
	public static void main(String[] args) throws AWTException, InterruptedException {
		getBrowser("opera");
		getUrl("http://demo.automationtesting.in/Frames.html");
		findElement("xpath", "//a[text()='Iframe with in an Iframe']");
		clickButton("xpath");
		Thread.sleep(3000);
		framess("webelement", "//iframe[@src='MultipleFrames.html']");
		Thread.sleep(3000);
		framess("webelement", "//iframe[@style='float: left;height: 250px;width: 400px']");
		Thread.sleep(3000);
		findElement("xpath", "/html/body/section/div/div/div/input");
		sendKey("xpath", "--------------Hellooooooo-----------------");
		getAtribute("xpath");
		
		
		

	}

} 
