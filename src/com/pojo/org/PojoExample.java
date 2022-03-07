package com.pojo.org;

import org.openqa.selenium.support.FindBy;

public class PojoExample {
	private int ele;
	
	public PojoExample(int i) {
       this.ele=i;
       System.out.println("the pojo varaibale value is " + ele);
	}

	public int getEle() {
		return ele;
	}

	public void setEle(int ele) {
		this.ele = ele;
	}

}
