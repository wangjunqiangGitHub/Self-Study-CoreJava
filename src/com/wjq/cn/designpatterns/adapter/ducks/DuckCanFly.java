package com.wjq.cn.designpatterns.adapter.ducks;

public class DuckCanFly extends Duck {

	public DuckCanFly() {
		//ʵ����ʱ��ʼ��Ѽ�ӵ���Ϊ
		flyBehavior=new FlyNoWings();
		quackBehavior=new SqueakQuack();
	}
	
	
	
	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

}
