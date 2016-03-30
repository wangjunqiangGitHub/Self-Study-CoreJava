package com.wjq.cn.thread.eg1;

/**
 * 
 * @author wjq
 * @ClassName : TestWindow
 * @Version
 * @ModifiedBy
 * @Copyright asiainfo
 * @date 2016年2月29日 上午10:42:28
 * 
 *模拟火车站3个窗口买票的问题 存不存在线程安全的问题？？存在
 *
 *打印车票会出现重复的车票，以及错误的车票
 *
 */
public class TestWindow {
	public static void main(String[] args) {
		// 创建3个窗口的线程
		Window w1 = new Window();
		Window w2 = new Window();
		Window w3 = new Window();

		w1.setName("窗口1");
		w2.setName("窗口2");
		w3.setName("窗口3");

		w1.start();
		w2.start();
		w3.start();
	}

}

class Window extends Thread {
	static int ticket = 100;

	public void run() {
		while (true) {
			if (ticket > 0) {
				try {
					Thread.currentThread().sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + ":售票，票号为"
						+ ticket--);
			} else {
				break;
			}
		}
	}
}