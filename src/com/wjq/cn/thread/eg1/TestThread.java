package com.wjq.cn.thread.eg1;
/**
 * 
*  @author  wjq  
*  @ClassName  : TestThread  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016年2月29日 上午9:59:13
*  
*  创建多线程的方式一：继承于Thread
*  
 */
public class TestThread {
	public static void main(String[] args) {
		//创建两个线程
		PrintNum p1=new PrintNum("线程1");
		PrintNum p2=new PrintNum("线程2");
		//设置线程的优先级，优先级越高只能代表被线程调用的几率就越大
		//线程优先级的等级有3个，最大为10，最小为1，默认为5
		p1.setPriority(1);
		p2.setPriority(10);
		//启动线程
		p1.start();
		p2.start();
		
	}
	

}

class PrintNum extends Thread{
	
	public void run(){
		//子线程执行的代码
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



