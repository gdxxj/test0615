package com.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodDemo {

	public static void main(String[] args) throws Exception{
		
	A a1 = new A();
	Class c = a1.getClass();
	
	Method m = c.getMethod("print", int.class,int.class);
	Object o = m.invoke(a1, 1,3);
	
	Method m1 = c.getMethod("print", String.class,String.class);
	Object o1 = m1.invoke(a1, "Hello","World");
	
	Method m2 = c.getMethod("print");
	Object o2 = m2.invoke(a1);

	

	}

}
