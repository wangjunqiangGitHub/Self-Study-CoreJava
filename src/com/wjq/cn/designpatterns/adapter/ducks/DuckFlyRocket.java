package com.wjq.cn.designpatterns.adapter.ducks;

public class DuckFlyRocket extends Duck {

	public DuckFlyRocket() {
		//ʵ����ʱ��ʼ��Ѽ�ӵ���Ϊ
		flyBehavior=new FlyRocket();
		quackBehavior=new Quack();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

}
