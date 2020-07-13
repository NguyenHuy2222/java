package com.sv;

public class Student {
	public String name;
	public String code;
	public int Date;
	
	
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getDate() {
		return Date;
	}
	public void setDate(int Date) {
		this.Date = Date;
	}
	
	//Show student inform
	public void showInfo() {
		System.out.println("Student infor: ");
		System.out.println("-Name: "+this.getName());
		System.out.println("-Code: "+this.getCode());
		System.out.println("-Date: "+this.getDate());
	}
}
