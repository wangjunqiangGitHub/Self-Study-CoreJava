package com.wjq.cn.designpatterns.iterator.me;
/**
 * 
*  @author  wjq  
*  @ClassName  : Test  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016年3月15日 上午10:41:50
*  测试设计模式中集合collection中的Iterator的设计模式
*  为了使不同的集合都能使用同一种方式去遍历，所以我们采用面向接口编程的方式，
*  声明一个Iterator的接口，具体的实现要看各个集合实现类中具体的实现的迭代器
*  
 */
public class Test {
	
	public static void main(String[] args) {
		Collection list=new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list.size());
		Collection linkedList=new LinkedList();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		System.out.println(linkedList.size());
		
		//使用Collection类中iterator()来遍历ArrayList集合
		Iterator iterator = list.iterator();
		System.out.println(iterator.getClass().getName());
		while (iterator.hasNext()) {
			Object next = iterator.next();
			System.out.println(next);
			
		}
		
	}
	

}
