package com.demo;

public class ClassDemo1 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Foo foo1 = new Foo();
		
		//任何一个类都是Class的实例对象，这个实例对象有三种表示方式
		
		//第一种表示方式 -->实际在告诉我们任何一个类都有一个隐含的静态成员变量class
		Class c1 = Foo.class;
		
		
		//第二种表达方式  已经知道该类的对象通过getClass方法
		Class c2 = foo1.getClass();
		
		/*官网c1,c2表示了Foo类的类类型(class type)  

		*万事万物皆对象，
		*类也是对象，是Class类的实例对象
		*这个对象我们称为该类的类类型		
		*/
		
		System.out.println(c1 == c2);
		
		//第三种表达方式
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
		System.out.println("Foo类的打印");
	}
	
}
