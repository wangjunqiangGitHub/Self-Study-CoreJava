package com.wjq.cn.designpatterns.iterator.me;

public interface Collection {
	
	void add(Object o);
	Object get(int index);
	int size();
	
	//创建生成迭代器的抽象方法，具体的实现由子类区实现
	Iterator iterator();
	
	

}
