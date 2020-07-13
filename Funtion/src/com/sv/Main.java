package com.sv;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentOne = new Student();
		Student studentTwo = new Student();
		
		//Strudent 1
		studentOne.setDate(2001);
		studentOne.setCode("S001");
		studentOne.setName("Huy");
		studentOne.showInfo();
		
		
	
		//student 2
		studentTwo.setDate(2001);
		studentTwo.setCode("S002");
		studentTwo.setName("ATSB");
		studentTwo.showInfo();
		
		
	}

}
