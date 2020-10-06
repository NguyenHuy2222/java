package com.th.vn;

public class Plant {
	
	public String ten;
	public String uses;
	public String price;
	private int code;
	
	private int test;

	public String FULL() {
		String full =ten + " " + uses + " " + price ;
		return full;
	}
	
	public Plant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Plant(String ten, String uses, String price) {
		super();
		this.ten = ten;
		this.uses = uses;
		this.price = price;
	}

	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getUses() {
		return uses;
	}
	public void setUses(String uses) {
		this.uses = uses;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	
}
