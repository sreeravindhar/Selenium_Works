package com.pojo.org;

import com.seleniumprojects.BaseClassTwo;

public class PomExm extends BaseClassTwo{
	public static void main(String[] args) {
		getBrowser("firefox");
		getUrl("https://www.facebook.com/");
		Pom a = new Pom(driver);
		sendKeyssss(a.getUserName(), "abc@gmail.com");
		sendKeyssss(a.getPassWord(), "123456");
		directClick(a.getLoginButton());
		
		
	}

}
