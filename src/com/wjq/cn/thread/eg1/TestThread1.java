package com.wjq.cn.thread.eg1;
/**
 * 
*  @author  wjq  
*  @ClassName  : TestThread1  
*  @Version     
*  @ModifiedBy   
*  @Copyright  asiainfo  
*  @date  2016年2月29日 上午10:16:11
*  创建多线程的方式二：通过实现Runnable接口的方式实现多线程
*  	
*  创建线程两种方式的对比：extends Thread ___VS___implements Runnable
*  	❶它们之间的联系public class Thread implements Runnable 
*  	❷那种方式较好呢？Why??????
*  		实现的方式相对较好：
*  		Because：①避免了单继承的局限性
*  				②当多个线程操作同一份资源（数据）时，更适合使用实现
*  					（implement Runnable）的方式
*  
*  
*  
 */

public class TestThread1 {
	public static void main(String[] args) {
		//4.创建一个接口的实现类对象
		PrintNum2 p1=new PrintNum2();
		//启动线程
		//p1.start();
		//p1.run();//这样只是普通的对象调用该对象的方法，并不能直接启动线程
		/**
		 * 说明：启动线程必须调用Thread类对象的start方法,我们可以参看Thread的源代码发现，Thread Imlements Runnable
		 */
		//5.创建两个线程对象,将Runnable接口的实现类作为Thread类中的target形参的实参
		Thread t1=new Thread(p1);
		Thread t2=new Thread(p1);
		t1.setPriority(10);
		t2.setPriority(1);
		t1.start();//启动线程之后，调用target.run();
		t2.start();
		
		
	}
	
	
	
	
}

//1.实现Runnable接口
class PrintNum2 implements Runnable{
	
	//2.实现接口的抽象方法
	@Override
	
	public void run() {
	//3.子线程实现的方法
		for (int i = 1; i <=100; i++) {
			if(i%2==0){
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
	}
	
}

