package com.wjq.cn.thread.eg1;

/**
 * @author wjq
 * @ClassName : TestWindow2
 * @Version
 * @ModifiedBy
 * @Copyright asiainfo
 * @date 2016年2月29日 下午3:06:30 
 * 使用实现的方式实现窗口售票，会存在线程安全的问题,导致所售的车票有重复的车票，以及错误的车票
 *       Ⅰ.线程安全存在的原因是？
 *       	 由于一个线程在操作共享数据的时候，还未执行完毕，另外的线程参与进来，导致共享的数据发生了错误
 *       Ⅱ.如何解决线程安全的问题？
 *       	 ①同步代码块 synchronized(同步监视器){ 需要被同步的代码块【即多个线程共享的数据】 }
 *      		 ❶.同步监视器：俗称“锁”，要求是【所有的线程共享同一把锁】 同步监视器通常由一个类的对象来充当，那个线程获取该同步监视器，
 *      			 那个线程就执行同步的代码块，即操作共享的数据。
 *      			 注：线程在实现的方式中我们可以考虑使用this来充当“同步监视器【即同步锁】”，但在继承实现多线程的方式中药慎用this
 *    			 ❷.共享的数据：即多个线程共同操作的同一份数据
 *       	 ②同步方法
 * 
 */
public class TestWindow2 {

	public static void main(String[] args) {
		Window2 w = new Window2();
		Thread t1 = new Thread(w);
		Thread t2 = new Thread(w);
		Thread t3 = new Thread(w);
		t1.setName("窗口1");
		t2.setName("窗口2");
		t3.setName("窗口3");
		t1.start();
		t2.start();
		t3.start();

	}

}

class Window2 implements Runnable {
	//共享的数据
	int ticket = 100;
	//Object object=new Object();//局部变量
	// Animal animal=new Animal();//局部变量
	@Override
	public void run() {
		while (true) {
			// synchronized (animal) {//同步锁
		//	synchronized (object) {	//
			synchronized (this) {//this表示当前的对象，代表Window2 w = new Window2();中的w对象
				if (ticket > 0) {
					try {
						Thread.currentThread().sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()
							+ "售票，票号为：" + ticket--);
				} else {
					break;
				}
			}
		}
	}

}

class Animal {

}
