package com.wjq.cn.thread.eg1;
import java.util.ArrayList;
import java.util.List;
/**
 * 
*  @author  wjq  
*  @ClassName  : TestArrayList  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016年3月9日 上午10:10:22
*  当两个线程同时向一个ArrayList中添加元素时会发生线程安全的问题？
*  如果发生了线程安全的问题，我们如何该进？
 */
public class TestArrayList {
	
	public static void main(String[] args) {
		
		List list=new ArrayList();
		//通过集合的工具类将线程不安全的list转换为集合安全的list
		//list=Collections.synchronizedList(list);
		MyI myI=new MyI(list);
		Thread t1=new Thread(myI);
		Thread t2=new MyT(list);
		t1.start();
		t2.start();
		
		
		
	}

}

class MyI implements Runnable{

	private List list;
	
	
	public MyI(List list){
		this.list=list;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			list.add(Thread.currentThread().getName());
		}
	}
	
}

class MyT extends Thread{
	private List list;
	public MyT( List list){
		this.list=list;
	}
	
	public void run(){
		while (true) {
			list.add(Thread.currentThread().getName());
		}
	}
	
}



