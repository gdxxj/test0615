package com.first0811;

public class SmartPhone extends Phone implements IPlayGame{

	@Override
	public void callPhone() {
		
		System.out.println("�����ֻ����Դ�绰");

	}

	@Override
	public void sendMess() {
		
		System.out.println("�����ֻ����Է�����");

	}

	@Override
	public void playGame() {
		
		System.out.println("�����ֻ����Դ���Ϸ");
		
	}

}
