package com.ddd1;

public class SmartPhone extends Phone implements IPlayGame {

	@Override
	public void callPhone() {
		
		System.out.println("智能手机可以打电话");

	}

	@Override
	public void sendMess() {
		
		System.out.println("智能手机可以打电话");

	}

	@Override
	public void playGame() {
		
		System.out.println("智能手机可以玩游戏");
		
	}

}
