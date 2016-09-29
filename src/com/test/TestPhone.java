package com.test;

public class TestPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone cp = new CallPhone();
		cp.sendMess();
		cp.callphone();
		
		Phone sm = new SmartPhone();
		sm.sendMess();
		sm.callphone();
		
		IPlayGame pp = new Psp();
		pp.playGame();
		
		IPlayGame sm1 = new SmartPhone();
		sm1.playGame();
		
		new IPlayGame(){

			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("This is Internal Class !");
				
			}
			
		}.playGame();
		

	}

}
