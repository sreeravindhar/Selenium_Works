package com.pojo.org;

public class PojoExm {
	private int a ;
	private int b ;
	
	public PojoExm(int i, int j) {
		this.a =i;
		this.b=j; 
		System.out.println(i+j);
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	

}
