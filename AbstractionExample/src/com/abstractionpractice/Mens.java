package com.abstractionpractice;

public class Mens implements tops,Jeans,Bottoms {

	@Override
	public void size(int size1) {
		// TODO Auto-generated method stub
		if(size1==22) {
			System.out.println("Bottoms suitable for mediumsize mens");
			
		}
		else if(size1==24) {
			System.out.println("Bottoms suitable for  largesize mens");
			
		}
		
	}

	@Override
	public String colors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void typesOfTops() {
		// TODO Auto-generated method stub
		
	}

}
