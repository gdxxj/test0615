package com.ddd1;

public class TestPhone {

	public static void main(String[] args) {
		
		Phone cp = new CellPhone();
        cp.callPhone();
        cp.sendMess();
        
        Phone sm = new SmartPhone();
        sm.callPhone();
        sm.sendMess();
        
        IPlayGame pp = new Psp();
        pp.playGame();
        
        IPlayGame sm2 = new SmartPhone();
        sm2.playGame();
        
        // 匿名内部类
        new IPlayGame(){

			@Override
			public void playGame() {				
				System.out.println("这是个匿名内部类");				
			}
        	
        }.playGame();
 
	}
}
