package com.wjq.cn.thread.eg3;

import java.util.ArrayList;
import java.util.List;

/**
 * 
*  @author  wjq  
*  @ClassName  : TestThreadList  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016��3��4�� ����5:09:17
*  ����10���߳�ͬʱ��һ��list�в���һ�����ݣ��᲻������̰߳�ȫ������
*  
 */
public class TestThreadList {
	
	public static void main(String[] args) {
		MyList myList=new MyList();
		MyThread r1=new MyThread(myList);
		int  myindex=0;
		while (true) {
			if(myindex>100000000){
				System.out.println(myList.list);
				break;
			}
			Thread t1=new Thread(r1);
			t1.start();
			myindex++;
			
		}
	}

}
class MyThread implements Runnable{
	private MyList myList;
	
	public MyThread(MyList myList){
		this.myList=myList;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		myList.add();
	}
	
}

class MyList{

	public static List<String> list=new ArrayList<String>();
	
	public void add(){
		list.add(Thread.currentThread().getName());
	}
	
	
	
}