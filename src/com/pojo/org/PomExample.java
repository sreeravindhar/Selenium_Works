package com.pojo.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomExample {
	public static WebDriver driver;
	@FindBy(id = "email") private WebElement username;
	@FindBy(name = "pass") private WebElement password;
	@FindBy(name = "login")private WebElement login;
	
	public PomExample(WebDriver driver2) {
		
		this.driver =driver2;
		PageFactory.initElements(driver2,this);
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	

}
