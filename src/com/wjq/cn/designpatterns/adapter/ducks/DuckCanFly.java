package com.wjq.cn.designpatterns.adapter.ducks;

public class DuckCanFly extends Duck {

	public DuckCanFly() {
		//实例化时初始化鸭子的行为
		flyBehavior=new FlyNoWings();
		quackBehavior=new SqueakQuack();
	}
	
	
	
	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

}
