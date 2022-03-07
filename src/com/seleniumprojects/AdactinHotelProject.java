package com.seleniumprojects;
public class AdactinHotelProject extends BaseClassTwo {
	
	public static void main(String[] args) throws InterruptedException {
		
		getBrowser("firefox");
		getUrl("https://adactinhotelapp.com/index.php");
		Pom_Class a  = new Pom_Class(driver);
		sendKeyssss(a.getUsername(), "sreeravindhar");
		sendKeyssss(a.getPassword(), "Sree@8144");
		a.getLoginButton().click();
		dropDown(a.getLocation(), "value", "Melbourne");
		dropDown(a.getHotels(), "visibletext", "Hotel Hervey");
		dropDown(a.getRoomType(), "index", "3");
		dropDown(a.getRoomNos(), "value", "6");
		a.getDateIn().clear();
		sendKeyssss(a.getDateIn(), "30/01/2022");
		a.getDateOut().clear();
		sendKeyssss(a.getDateOut(), "05/02/2022");
		dropDown(a.getQtyAdult(), "value", "4");
		dropDown(a.getQtyChild(), "index", "1");
		a.getSubmitButton().click();
		Thread.sleep(2000);
		a.getSelectHotel().click();
		a.getContinueButton().click();
		sendKeyssss(a.getFirstName(), "Sree");
		sendKeyssss(a.getLastName(), "Ravindhar");
		sendKeyssss(a.getBillingAdd(), "No:32, Muthiya Street");
		sendKeyssss(a.getCreditNum(), "1234567891234567");
		dropDown(a.getCreditType(), "index", "2");
		dropDown(a.getExpMonth(), "index", "3");
		dropDown(a.getExpYear(), "visibletext", "2022");
		sendKeyssss(a.getCvvNum(), "1234");
		a.getBookNowButton().click();
		Thread.sleep(5000);
		scrollUpDown(a.getMove());
		Thread.sleep(2000);
		a.getMove().click();
		
		
	
		
		
		
		
		
		
		
	}

}
