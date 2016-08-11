package com.first0811;

public class TestPhone {

	public static void main(String[] args) {
		
	 Phone cp = new CellPhone();
	 cp.callPhone();
	 cp.sendMess();
	 
	 Phone sm = new SmartPhone();
	 sm.callPhone();
	 sm.sendMess();
	 
	 SmartPhone sm1 = new SmartPhone();
	 sm1.playGame();
	 
	 new IPlayGame(){
		@Override
		public void playGame() {			
			System.out.println("这是匿名内部类");			
		}
		 
	 }.playGame();;	
		

	}

}
