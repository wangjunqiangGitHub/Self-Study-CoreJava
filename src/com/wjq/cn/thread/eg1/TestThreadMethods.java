package com.wjq.cn.thread.eg1;
/**
 * 
*  @author  wjq  
*  @ClassName  : TestThreadMethods  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016年3月7日 下午5:24:48
*  Thread的常用的方法：
*  	①.start()启动线程，并执行相应的run方法
*  	②.run()子线程要执行的方法放入run方法中
*  	③.currentThread()静态的调取当前线程
*  	④.getName()获取线程的名字
*  	⑤.setName()设置此线程的名字
*  	⑥.yield调用此方法的线程释放cpu的执行权
*  	⑦.join() 在线程A中调用线程B的join方法，表示当执行到此方法时，
*  		线程A停止执行，直到线程B执行完成之后，线程A再执行join之后的方法
*  	⑧.isAlive()判断当前的线程是否还存活
*  	⑨.sleep(1)让当前的线程睡眠1毫秒
*  	⑩线程之间的通信：wait(),notify(),notifyAll()
*  	⑪.setPriority()设置线程之间的优先级
*  	⑫.getPriority()获取当前线程的优先级
 */

public class TestThreadMethods {
	public static void main(String[] args) {
		SubThread t1=new SubThread();
		t1.setName("子线程");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		Thread.currentThread().setName("主线程=============");
		for (int i = 0; i < 100; i++) {
			System.out.println(i+" "+Thread.currentThread().getName()+"优先级"+Thread.currentThread().getPriority());
			if(i%10==0){
				Thread.currentThread().yield();
			}
			if(i==20){
				try {
					t1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println(t1.isAlive());
		
		
	}
}


class SubThread extends Thread{
	
	public void run(){
		for(int i=0;i<100;i++){
			try {
				Thread.currentThread().sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+"  "+Thread.currentThread().getName()+"优先级"+Thread.currentThread().getPriority());
			
		}
	}
}














