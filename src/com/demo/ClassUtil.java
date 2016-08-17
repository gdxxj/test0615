package com.demo;

import java.lang.reflect.Method;

public class ClassUtil {
	/**
	 * 打印类的信息，包括类的成员函数、成员变量
	 * @param obj
	 */
	
	public static void printClassMessage(Object obj){
		//要获取类的信息 首先要获得类的类类型
		Class c = obj.getClass();
		
		//获取类的名称
		System.out.println("类的名称是："+c.getName());
		
		/*
		 * Method类，方法对象
		 * 一个成员方法就是一个Method对象
		 * getMethods()方法获取的是所有的public的函数
		 */
		Method[]ms = c.getMethods();
		for(int i=0; i <ms.length; i++){
			
			Class returnType = ms[i].getReturnType();
			System.out.print(returnType.getName()+"");
			
			System.out.print(ms[i].getName()+"(");
			
			Class[]paramTypes = ms[i].getParameterTypes();
			for(Class class1:paramTypes){
				
				System.out.print(class1.getName()+",");
			}
			System.out.println(")");
			
			
			
			
		}
	}
	
	

}
