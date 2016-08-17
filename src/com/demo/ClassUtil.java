package com.demo;

import java.lang.reflect.Method;

public class ClassUtil {
	/**
	 * ��ӡ�����Ϣ��������ĳ�Ա��������Ա����
	 * @param obj
	 */
	
	public static void printClassMessage(Object obj){
		//Ҫ��ȡ�����Ϣ ����Ҫ������������
		Class c = obj.getClass();
		
		//��ȡ�������
		System.out.println("��������ǣ�"+c.getName());
		
		/*
		 * Method�࣬��������
		 * һ����Ա��������һ��Method����
		 * getMethods()������ȡ�������е�public�ĺ���
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
