package com.demo;

public class ClassDemo1 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Foo foo1 = new Foo();
		
		//�κ�һ���඼��Class��ʵ���������ʵ�����������ֱ�ʾ��ʽ
		
		//��һ�ֱ�ʾ��ʽ -->ʵ���ڸ��������κ�һ���඼��һ�������ľ�̬��Ա����class
		Class c1 = Foo.class;
		
		
		//�ڶ��ֱ�﷽ʽ  �Ѿ�֪������Ķ���ͨ��getClass����
		Class c2 = foo1.getClass();
		
		/*����c1,c2��ʾ��Foo���������(class type)  

		*��������Զ���
		*��Ҳ�Ƕ�����Class���ʵ������
		*����������ǳ�Ϊ�����������		
		*/
		
		System.out.println(c1 == c2);
		
		//�����ֱ�﷽ʽ
		Class c3 = null;
		try{
		c3 = Class.forName("com.demo.Foo");
		
	}catch(ClassNotFoundException e){
		e.printStackTrace();
}
		System.out.println(c2 == c3);
	}

	}
class Foo{
	public void xx(){
		System.out.println("Foo��Ĵ�ӡ");
	}
	
}
