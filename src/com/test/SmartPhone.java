package com.test;

public class SmartPhone extends Phone implements IPlayGame{

	@Override
	public void sendMess() {
		// TODO Auto-generated method stub
		System.out.println("SmartPhone can send message !");

	}

	@Override
	public void callphone() {
		// TODO Auto-generated method stub
		System.out.println("SmartPhone can call phone !");

	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("SmartPhone can play Game !");
		
	}
	
	

}
