package com.wjq.cn.designpatterns.adapter.ducks;

public class DuckFly extends Duck {
	
	public DuckFly() {
		//实例化时初始化鸭子的行为
		flyBehavior=new FlyWithWings();
		quackBehavior=new Quack();
	}

	@Override
	public void display() {

	}

}
