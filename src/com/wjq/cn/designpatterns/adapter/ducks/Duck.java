package com.wjq.cn.designpatterns.adapter.ducks;

public abstract class Duck{
	 FlyBehavior flyBehavior;
	 QuackBehavior quackBehavior;
	
	public abstract void display();
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void swim(){
		System.out.println("All duck float, even decoys");
	}

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	//Ϊ�˶�̬�ĸı�Ѽ�ӵ���Ϊ�������ṩ����������̬�ĸ��ĵķ���
	
	
	
	

}
