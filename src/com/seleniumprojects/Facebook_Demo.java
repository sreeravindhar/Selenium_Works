package com.seleniumprojects;

public class Facebook_Demo extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		getBrowser("firefox");
		getUrl("http://www.facebook.com");
		findElement("xpath", "(//a[@role='button'])[2]");
		clickButton("xpath");
		Thread.sleep(5000);
		findElement("name", "firstname");
		sendKey("name", "Sree");
		findElement("name", "lastname");
		sendKey("name", "Ravindhar");
		findElement("name", "reg_email__");
		sendKey("name", "9884662222");
		findElement("id", "password_step_input");
		sendKey("id", "helloworld");
		
		
		findElement("xpath", "//select[@name='birthday_day']");
		dropDown("xpath", "index", "22");
		
		findElement("id", "month");
		dropDown("id", "value", "9");
		
		findElement("name", "birthday_year");
		dropDown("name", "visibletext", "1996");
		
		findElement("xpath", "(//input[@name='sex'])[2]");
		clickButton("xpath");
		
		findElement("xpath", "(//input[@name='sex'])[3]");
		clickButton("xpath");
		Thread.sleep(3000);
		isSelectted("xpath");
		
		findElement("name", "preferred_pronoun");
		dropDown("name", "index", "1");
		
		findElement("name", "custom_gender");
		sendKey("name", "Male");
		isDisplayyed("xpath");
		
		
	}

}
