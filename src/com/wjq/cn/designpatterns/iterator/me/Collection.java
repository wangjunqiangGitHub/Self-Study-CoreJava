package com.wjq.cn.designpatterns.iterator.me;

public interface Collection {
	
	void add(Object o);
	Object get(int index);
	int size();
	
	//�������ɵ������ĳ��󷽷��������ʵ����������ʵ��
	Iterator iterator();
	
	

}
