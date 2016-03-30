package com.wjq.cn.designpatterns.adapter.ducks;

public class DuckFly extends Duck {
	
	public DuckFly() {
		//ʵ����ʱ��ʼ��Ѽ�ӵ���Ϊ
		flyBehavior=new FlyWithWings();
		quackBehavior=new Quack();
	}

	@Override
	public void display() {

	}

}
