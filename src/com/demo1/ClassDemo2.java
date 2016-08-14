package com.demo1;

public class ClassDemo2 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Foo foo1 = new Foo();
		
		Class c2 = foo1.getClass();
		
		System.out.println(c2);
		
		
	}
}

class Foo{
	
	public static void sendMess(){
		
		System.out.println("手机可以发短信");
	}
	
}


