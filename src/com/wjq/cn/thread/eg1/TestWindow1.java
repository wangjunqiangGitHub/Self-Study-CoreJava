package com.wjq.cn.thread.eg1;

/**
 * 
 * @author wjq
 * @ClassName : TestWindow1
 * @Version
 * @ModifiedBy
 * @Copyright asiainfo
 * @date 2016年2月29日 上午10:58:35
 * 
 *       使用实现的方式实现火车票窗口买票的 次程序存在线程安全的问题，会出现后打印车票错误以及重复的车票
 */
public class TestWindow1 {

	public static void main(String[] args) {
		Window1 w1 = new Window1();
		Thread t1 = new Thread(w1);
		Thread t2 = new Thread(w1);
		Thread t3 = new Thread(w1);
		t1.setName("窗口1");
		t2.setName("窗口2");
		t3.setName("窗口3");
		
		t1.start();
		t2.start();
		t3.start();

	}

}

class Window1 implements Runnable {
	 int ticket = 100;

	@Override
	public void run() {
		while (true) {
			if (ticket > 0) {
				try {
					Thread.currentThread().sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"窗口售票，票号为"+ticket--);
			}else {
				break;
			}
		}

	}

}
