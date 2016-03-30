package com.wjq.cn.proxy;

public class MyStaticProxy {

	public static void main(String[] args) {
		
		//张liying
		A a=new A();
		//a.add();
		
		//张li
		C c=new C();
		//c.add();
		
		//中介
		B b=new B();
		//绑定
		b.binder(a);
		//中介执行我要执行的，
		b.add();
	
		b.binder(c);
		b.add();
		
		
	}
	
	
}


interface  Factory{
	public void add();
} 

interface  FactoryCar{
	public void delete();
} 

class B implements Factory,FactoryCar {
	 public Factory factory; 
	
	public void binder(Factory factory){
		this.factory=factory;
	}
	 
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("房产中介检验a和b正确与否");
		factory.add();
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	
}

class A implements Factory ,FactoryCar{
	@Override
	public void add() {
		System.out.println("zhangliying");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
}




class C implements Factory{
	@Override
	public void add() {
		System.out.println("zhangli");
	}
}