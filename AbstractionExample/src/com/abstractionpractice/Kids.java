package com.abstractionpractice;

public class Kids implements tops,Jeans,Bottoms {

	@Override
	public void size(int size1) {
		// TODO Auto-generated method stub
		if(size1==2) {
			System.out.println("Bottoms suitable for 2 yearkids");
			
		}
		else if(size1==4) {
			System.out.println("Bottoms suitable for  4 yearkids");
			
		}
		
	}

	@Override
	public String colors() {
		// TODO Auto-generated method stub
		System.out.println("purple");
		return "purple";
	}

	@Override
	public void typesOfTops() {
		// TODO Auto-generated method stub
		
	}

}
