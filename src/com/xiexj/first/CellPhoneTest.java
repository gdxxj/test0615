package com.xiexj.first;

import static org.junit.Assert.*;

import org.junit.Test;

public class CellPhoneTest {

	@Test
	public void testCallPhone() {
		
		CellPhone cp = new CellPhone();
		
		String result_a= cp.callPhone();
		String result_b=cp.sendMess();
		
		
		assertEquals("�ֻ����Դ�绰",result_a);
		
		assertEquals("�ֻ����Է�����",result_b);
		
		cp.callPhone();
		cp.sendMess();
		
		
	}

	@Test
	public void testSendMess() {
		 
	}

}
