package com.wjq.cn.thread.eg1;

/**
 * 
 * @author wjq
 * @ClassName : TestWindow4
 * @Version
 * @ModifiedBy
 * @Copyright asiainfo
 * @date 2016年2月29日 下午5:14:09 通过实现Runnable接口的方法，并使用同步方法的方式实现3个窗口售票 Ⅰ.线程安全存在的原因？
 *       当一个线程在操作共享数据时，还未操作完成，另一个线程参与进来，导致共享的数据发生了错误 Ⅱ.解决线程安全的方式 ①.同步代码块
 *       synchronized(同步锁){ 同步的代码块【共享数据】 } ❶.共享数据：多个线程共同要操作的数据
 *       ❷.同步锁：一般是一个类的对象，该对象必须是多个线程共享的， 注：当创建的多线程是通过implements
 *       Runnable来实现的，则我们推荐使用this做同步锁 当使用extends Thread实现多线程时，要慎用this ②.同步方法
 *       将同步代码块抽出来放到一个独立的方法中，并将此方法声明为synchronized，能够保证当有一个线程在
 *       操作该同步数据时，其他线程在外等待，直到该线程执行结束 注意：同步方法的同步锁就是this
 * 
 *       Ⅲ.线程同步的弊端： 由于同一个时间段只有一个线程操作，所以效率变低了
 * 
 */
public class TestWindow4 {
	public static void main(String[] args) {
		Window4 window4 = new Window4();
		Thread t1 = new Thread(window4);
		Thread t2 = new Thread(window4);
		Thread t3 = new Thread(window4);
		Thread t4 = new Thread(window4);
		t1.setName("窗口1");
		t2.setName("窗口2");
		t3.setName("窗口3");
		t4.setName("窗口4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}

class Window4 implements Runnable {
	int ticket = 100;

	@Override
	public void run() {
		while (true) {
			show();
		}

	}

	/**
	 * 此处的同步锁是this，即window4
	 */
	public synchronized void show() {
		if (ticket > 0) {
			try {
				Thread.currentThread().sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "窗口售票，票号为："
					+ ticket--);
		}
	}

}
