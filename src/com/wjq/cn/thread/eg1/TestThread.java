package com.wjq.cn.thread.eg1;
/**
 * 
*  @author  wjq  
*  @ClassName  : TestThread  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016��2��29�� ����9:59:13
*  
*  �������̵߳ķ�ʽһ���̳���Thread
*  
 */
public class TestThread {
	public static void main(String[] args) {
		//���������߳�
		PrintNum p1=new PrintNum("�߳�1");
		PrintNum p2=new PrintNum("�߳�2");
		//�����̵߳����ȼ������ȼ�Խ��ֻ�ܴ����̵߳��õļ��ʾ�Խ��
		//�߳����ȼ��ĵȼ���3�������Ϊ10����СΪ1��Ĭ��Ϊ5
		p1.setPriority(1);
		p2.setPriority(10);
		//�����߳�
		p1.start();
		p2.start();
		
	}
	

}

class PrintNum extends Thread{
	
	public void run(){
		//���߳�ִ�еĴ���
		for(int i=1;i<=100;i++){
			if(i%2==0){
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
	}

	public PrintNum(String threadName) {
		super(threadName);
	}
	
}



