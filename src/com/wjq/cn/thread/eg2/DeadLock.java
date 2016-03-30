package com.wjq.cn.thread.eg2;
/**
*  @author  wjq  
*  @ClassName  : DeadLock  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016年2月29日 下午5:37:40\
*  创建一个死锁的例子
 */
public class DeadLock implements Runnable {
	A a=new A();
	B b=new B();

	@Override
	public void run() {
		a.foo(b);
	}
	
	public void init(){
		b.bar(a);
	}

	public static void main(String[] args) {
		DeadLock deadLock=new DeadLock();
		Thread thread=new Thread(deadLock);
		thread.start();//启动线程并执行deadLock.run()方法
		deadLock.init();//调用deadLock对象的init()方法
		
	}
}
class A{
	public synchronized void foo(B b){
		try {
			Thread.currentThread().sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.last();
	}
	public synchronized void last(){
		
	}
}

class B{
	public synchronized void bar(A a){
		try {
			Thread.currentThread().sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a.last();
	}
	public synchronized void last(){
		
	}
}

















