package com.seleniumprojects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Class {
	public static WebDriver driver;
	@FindBy(id = "username") private WebElement username;
	@FindBy(id = "password") private WebElement password;
	@FindBy(name = "login") private WebElement loginButton;
	@FindBy(id = "location") private WebElement location;
	@FindBy(id = "hotels") private WebElement hotels;
	@FindBy(name = "room_type") private WebElement roomType;
	@FindBy(id = "room_nos")  private WebElement roomNos;
	@FindBy(name = "datepick_in") private WebElement dateIn ;
	@FindBy(name = "datepick_out") private WebElement dateOut;
	@FindBy(id = "adult_room") private WebElement qtyAdult;
	@FindBy(id = "child_room") private WebElement qtyChild;
	@FindBy(id = "Submit") private WebElement submitButton;
	@FindBy(id = "radiobutton_0") private WebElement selectHotel;
	@FindBy(id = "continue") private WebElement continueButton;
	@FindBy(name = "first_name") private WebElement firstName;
	@FindBy(name = "last_name") private WebElement lastName;
	@FindBy(name = "address")  private WebElement billingAdd;
	@FindBy(name = "cc_num") private WebElement creditNum;
	@FindBy(id = "cc_type") private WebElement creditType;
	@FindBy(name = "cc_exp_month") private WebElement expMonth;
	@FindBy(id = "cc_exp_year") private WebElement expYear;
	@FindBy(id = "cc_cvv") private WebElement cvvNum;
	@FindBy(id = "book_now") private WebElement bookNowButton;
	@FindBy(xpath = "//input[@name='my_itinerary']")private WebElement move;

	public Pom_Class(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getRoomNos() {
		return roomNos;
	}
	public WebElement getDateIn() {
		return dateIn;
	}
	public WebElement getDateOut() {
		return dateOut;
	}
	public WebElement getQtyAdult() {
		return qtyAdult;
	}
	public WebElement getQtyChild() {
		return qtyChild;
	}
	public WebElement getLocation() {
		return location;
	}
//	public Pom_Class(WebDriver driver1) {
//		this.driver= driver1;
//		PageFactory.initElements(driver1, this);
	//}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getSubmitButton() {
		return submitButton;
	}
	public WebElement getSelectHotel() {
		return selectHotel;
	}
	public WebElement getContinueButton() {
		return continueButton;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getCreditNum() {
		return creditNum;
	}
	public WebElement getCreditType() {
		return creditType;
	}
	public WebElement getCvvNum() {
		return cvvNum;
	}
	public WebElement getBillingAdd() {
		return billingAdd;
	}
	public WebElement getExpMonth() {
		return expMonth;
	}
	public WebElement getExpYear() {
		return expYear;
	}
	public WebElement getBookNowButton() {
		return bookNowButton;
	}
	public WebElement getMove() {
		return move;
	}
	

}
