package com.wjq.cn.proxy;

public class MyStaticProxy {

	public static void main(String[] args) {
		
		//��liying
		A a=new A();
		//a.add();
		
		//��li
		C c=new C();
		//c.add();
		
		//�н�
		B b=new B();
		//��
		b.binder(a);
		//�н�ִ����Ҫִ�еģ�
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
		System.out.println("�����н����a��b��ȷ���");
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