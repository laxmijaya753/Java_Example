package com.abstraction;

public class MainJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaMaker dmaker=new Dominos();
		PizzaMaker mmaker=new Mcd();
		System.out.println("Dominos Price"+dmaker.getPrice());
		System.out.println("Dominos Price"+mmaker.getPrice());
	}

}
