package com.ddd1;

public class CellPhone extends Phone {

	@Override
	public void callPhone() {
		
		System.out.println("手机可以打电话");

	}

	@Override
	public void sendMess() {
		
		System.out.println("手机发短信");

	}

}
