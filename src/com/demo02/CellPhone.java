package com.demo02;

public class CellPhone extends Phone {

	@Override
	public void callPhone() {
		
		System.out.println("手机可以打电话");

	}

	@Override
	public void sendMess() {
		
		System.out.println("手机可以发短信");

	}

}
