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
*  @date  2016��3��9�� ����10:10:22
*  �������߳�ͬʱ��һ��ArrayList�����Ԫ��ʱ�ᷢ���̰߳�ȫ�����⣿
*  ����������̰߳�ȫ�����⣬������θý���
 */
public class TestArrayList {
	
	public static void main(String[] args) {
		
		List list=new ArrayList();
		//ͨ�����ϵĹ����ཫ�̲߳���ȫ��listת��Ϊ���ϰ�ȫ��list
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



