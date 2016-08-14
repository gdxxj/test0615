package com.demo02;

public class TestPhone {

	public static void main(String[] args) {
		
		Phone cp = new CellPhone();
		cp.callPhone();
		cp.sendMess();
		
		Phone sm = new SmartPhone();
		sm.callPhone();
		sm.sendMess();
		
		Psp pp = new Psp();
		pp.playGame();
		
		IPlayGame sm1 = new SmartPhone();
		sm1.playGame();
		
		new IPlayGame(){
			@Override
			public void playGame() {
				System.out.println("这是个匿名内部类");
				
			}			
		}.playGame();		

	}

}
