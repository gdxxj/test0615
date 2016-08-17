package com.demo;

import java.lang.reflect.Method;

public class MethodDemo1 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		 
		A a1 = new A();
		Class c = a1.getClass();
		
		try{
		Method m = c.getMethod("print",int.class,int.class); 
		Object o = m.invoke(a1, 10,20);
		
		Method m1 = c.getMethod("print", String.class,String.class);
		Object o1 = m1.invoke(a1, "aaa","bbb");
		
		}catch(Exception e){
			e.printStackTrace();
			
		
		}
		
	}
	
}

class A{
	
	public void print(int a , int b ){
		
		System.out.println(a+b);
	}
	
	public void print(String a , String b ){
		System.out.println(a.toUpperCase()+","+b.toLowerCase());
		
	}
	
}
