package com.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodDemo1 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		 
		A a1 = new A();
		Class c = a1.getClass();
		
		Method m = c.getMethod("print",int.class,int.class); 
		Object o = m.invoke(a1, new Object[]{10,20});
				
		Method m1 = c.getMethod("print", String.class,String.class);
		Object o1 = m1.invoke(a1, "hello","World");

		Method m2 = c.getMethod("print");
		Object o2 = m2.invoke(a1);
	}
	
}

class A{
	
	public void print(){
		
		System.out.println("Single Hello");
		
	}
	
	public void print(int a , int b ){
		
		System.out.println(a+b);
	}
	
	public void print(String a , String b ){
//		System.out.println(a.toUpperCase()+","+b.toLowerCase());
		System.out.println(a+b);
		
	}
	
}
