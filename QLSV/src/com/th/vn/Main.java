package com.th.vn;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plant plant = new Plant();
		Fruit fruit = new Fruit();
		fruit.khoitaogiatri();
		fruit.setColour("Green or red");
		fruit.setSize("Small");
		fruit.setTaste("DAT");
		fruit.showInfo();
	}

}
