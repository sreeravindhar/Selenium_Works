package com.pojo.org;

import com.seleniumprojects.BaseClassTwo;

public class LoginPage extends BaseClassTwo{

	public static void main(String[] args) {
		
		getBrowser("chrome");
		getUrl("http://www.facebook.com");
		
		PomExample p = new PomExample(driver);
		sendKeyssss(p.getUsername(), "abc2@gmail.com");
		sendKeyssss(p.getPassword(), "02314");
		//p.getLogin().click();
		directClick(p.getLogin());
      
	}

}
 