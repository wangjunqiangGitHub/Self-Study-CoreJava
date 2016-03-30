package com.wjq.cn.thread.eg2;

/**
 * 
 * @author wjq
 * @ClassName : TestThreadCommunication
 * @Version
 * @ModifiedBy
 * @Copyright asiainfo
 * @date 2016年3月1日 下午4:36:36 线程之间通信的问题，需要调用的3个方法有wait，notify，notifyAll
 *       注意：以上这3个关键字必须在同步代码块或同步方法里面使用 wait()方法，当前线程执行到wait方法时，会让出cpu资源，释放同步锁
 *       notify和notifyAll：唤醒wait的一个线程或多个线程
 * 
 *       eg:打印1——100两个线程交替打印
 * 
 */
public class TestThreadCommunication {

	public static void main(String[] args) {
		PrintNum p1 = new PrintNum();
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p1);
		t1.setName("甲");
		t2.setName("已");
		t1.start();
		t2.start();

	}
}

class PrintNum implements Runnable {
	int num = 1;
	Object obj=new Object();
	public void run() {

		while (true) {
			synchronized (this) {
				this.notify();
				if (num <= 100) {
					System.out.println(Thread.currentThread().getName() + " : "
							+ num);
					num++;
					try {
						this.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					break;
				}
			}
		}
	}

}
