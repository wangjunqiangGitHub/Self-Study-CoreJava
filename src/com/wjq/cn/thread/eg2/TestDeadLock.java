package com.wjq.cn.thread.eg2;

/**
 * 
 * @author wjq
 * @ClassName : TestDeadLock
 * @Version
 * @ModifiedBy
 * @Copyright asiainfo
 * @date 2016年3月1日 下午2:58:20 测试字符换的死锁 //死锁的问题只有在线程同步的时候才会出现
 *       //不同的线程分别占用对方需要的资源不放弃，都在等待对方释放自己所需的同步资源，这样就会造成死锁 //我们写代码要尽量避免死锁
 */
public class TestDeadLock {

	static StringBuffer sb1 = new StringBuffer();
	static StringBuffer sb2 = new StringBuffer();

	public static void main(String[] args) {
		new Thread() {
			public void run() {
				synchronized (sb1) {
					sb1.append("A");
					try {
						Thread.currentThread().sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (sb2) {
						sb2.append("B");
						System.out.println(sb1);
						System.out.println(sb2);
					}
				}
			}
		}.start();
		new Thread() {
			public void run() {
				synchronized (sb2) {
					try {
						Thread.currentThread().sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sb2.append("C");
					synchronized (sb1) {
						sb1.append("D");
						System.out.println(sb1);
						System.out.println(sb2);
					}
				}
			}
		}.start();
	}

}
