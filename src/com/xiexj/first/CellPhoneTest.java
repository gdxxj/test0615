package com.xiexj.first;

import static org.junit.Assert.*;

import org.junit.Test;

public class CellPhoneTest {

	@Test
	public void testCallPhone() {
		
		CellPhone cp = new CellPhone();
		
		String result_a= cp.callPhone();
		String result_b=cp.sendMess();
		
		
		assertEquals("手机可以打电话",result_a);
		
		assertEquals("手机可以发短信",result_b);
		
		cp.callPhone();
		cp.sendMess();
		
		
	}

	@Test
	public void testSendMess() {
		 
	}

}
