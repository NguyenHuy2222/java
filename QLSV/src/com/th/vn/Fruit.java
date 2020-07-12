package com.th.vn;

public class Fruit extends Plant {
	public String size;
	public String colour;
	public String taste;
	public void khoitaogiatri() {
		Plant full = new Plant("Appe","Thanh nhiet","1$");
		System.out.println(full.FULL());
		
	}
	
	public Fruit() {
		super();
		this.size = size;
		this.colour = colour;
		this.taste = taste;
	}


	public void showInfo() {
		System.out.println("Fruit infor: ");
		System.out.println("-Size  :  \t"+this.getSize());
		System.out.println("-Colour:  \t"+this.getColour());
		System.out.println("-Taste :  \t"+this.getTaste());
		
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	
}
