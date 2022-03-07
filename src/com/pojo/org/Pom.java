package com.pojo.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	public static WebDriver driver;
	@FindBy(id = "email")  private WebElement userName;
	@FindBy(name = "pass") private WebElement passWord;
	@FindBy (name = "login") private WebElement loginButton;
	public Pom(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this); 
		
	}
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassWord() {
		return passWord;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	
	

}
