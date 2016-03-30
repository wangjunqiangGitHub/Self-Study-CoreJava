package com.wjq.cn.thread.eg1;

/**
 * 
 * @author wjq
 * @ClassName : TestWindow3
 * @Version
 * @ModifiedBy
 * @Copyright asiainfo
 * @date 2016年2月29日 下午3:49:10 使用继承的方式实现窗口售票，使用同步代码块synchronized来解决线程同步问题
 */
public class TestWindow3 {
	public static void main(String[] args) {
		Window3 w1 = new Window3("窗口1");
		Window3 w2 = new Window3("窗口2");
		Window3 w3 = new Window3("窗口3");
		
		w1.start();
		w2.start();
		w3.start();
		System.out.println(Window3.class.hashCode());
		System.out.println(Window3.class.hashCode());

	}

}

class Window3 extends Thread {
	// 共享数据
	static int ticket = 100;
	static Object object=new Object();
	// 线程
	public void run() {
		while (true) {
			//synchronized (this) {//this在此处代表的是w1,w2,w3，3个线程看到的不是同一把锁
			synchronized (object) {
				if (ticket > 0) {//将此object对象设置成static的，这样3个线程就看到的是同一个object
					try {
						Thread.currentThread().sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()
							+ "窗口售票，票号为：" + ticket--);
				} else {
					break;
				}
			}
		//show();

		}

	}
	
	
	/*
	 * synchronized此处锁的对象就是this
	 */
	public synchronized void show(){
		if (ticket > 0) {//将此object对象设置成static的，这样3个线程就看到的是同一个object
			try {
				Thread.currentThread().sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()
					+ "窗口售票，票号为：" + ticket--);
		} 
	}

	public Window3(String name) {
		super(name);
	}

}