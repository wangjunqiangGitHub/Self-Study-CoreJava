package com.wjq.cn.designpatterns.adapter.ducks;

public class DuckFlyRocket extends Duck {

	public DuckFlyRocket() {
		//实例化时初始化鸭子的行为
		flyBehavior=new FlyRocket();
		quackBehavior=new Quack();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

}
